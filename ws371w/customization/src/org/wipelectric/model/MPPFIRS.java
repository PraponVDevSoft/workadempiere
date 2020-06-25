package org.wipelectric.model;

import java.io.File;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.model.POWrapper;
import org.compiere.model.MDocType;
//import org.compiere.model.MInvoice;
//import org.compiere.model.MPayment;
//import org.compiere.model.MPaymentAllocate;
//import org.compiere.model.MPeriod;
//import org.compiere.model.MPriceList;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.Query;
import org.compiere.model.X_C_DocType;
import org.compiere.process.DocAction;
import org.compiere.process.DocOptions;
import org.compiere.process.DocumentEngine;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
//import org.globalqss.model.LCO_MInvoice;

/**
 *	Model class for FIRS
 *	
 *  @author Prapon Aon 
 *	@version $Id: MPPFIRS.java, v1 2019/03/08
 */

public class MPPFIRS extends X_PP_FIRS implements DocAction, DocOptions
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**	Process Message 			*/
	private String		m_processMsg = null;

	public MPPFIRS(Properties ctx, int PP_FIRS_ID,
			String trxName) {
		super(ctx, PP_FIRS_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MPPFIRS(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public static MPPFIRS getFIRS(Properties ctx,int PP_FIRS_ID,String trxName){
		return new MPPFIRS(ctx,PP_FIRS_ID,trxName);
	}

	@Override
	protected boolean beforeDelete() {
		
		try
		{
			// Delete previous records generated
			String sqldel = "DELETE FROM PP_FIRSLine "
				+ " WHERE PP_FIRS_ID = ?";
			PreparedStatement pstmtdel = DB.prepareStatement(sqldel, get_TrxName());
			pstmtdel.setInt(1, getPP_FIRS_ID());
			int nodel = pstmtdel.executeUpdate();
			log.config("PP_FIRSLine deleted="+nodel);
			pstmtdel.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "", e);
			return false;
		}
		
		return true;
	}
	
	@Override
	protected boolean afterDelete(boolean success) {
		//updateHeaderAmount();
		return true;
	}
	
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		//updateHeaderAmount();
		return true;
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// Check LineNet Amount Should Not Over Invoice Total Amount
		
		return true;
	}
	
	public boolean approveIt() {
		log.info(toString());
		//setIsApproved(true);
		return true;
	}

	@Override
	public BigDecimal getApprovalAmt() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean closeIt() {
		log.info(toString());
		// Before Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_CLOSE);
		if (m_processMsg != null)
			return false;
		// After Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_CLOSE);
		if (m_processMsg != null)
			return false;		
		setDocAction(DOCACTION_None);
		return true;
	}

	@Override
	public String completeIt() {
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		log.info(toString());
		
//		Re-Check
		if (!m_justPrepared)
		{
			String status = prepareIt();
			if (!DocAction.STATUS_InProgress.equals(status))
				return status;
		}
		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		
		setProcessed(true);	
		//m_processMsg = info.toString();
		//
		setDocAction(DOCACTION_Close);
		return DocAction.STATUS_Completed;
	}

	@Override
	public String getSummary() {
		StringBuffer sb = new StringBuffer();
		sb.append(getDocumentNo());
		//	: Total Lines = 123.00 (#1)
		//sb.append(": ")
//			.append(Msg.translate(getCtx(),"GrandTotal")).append("=").append(this.getGrandTotal());
		//	 - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());
		return sb.toString();
	}

	/**
	 * 	Set Processed.
	 * 	Propagate to Lines
	 *	@param processed processed
	 */
	public void setProcessed (boolean processed)
	{
		super.setProcessed (processed);
		if (get_ID() == 0)
			return;
		String set = "SET Processed='"
			+ (processed ? "Y" : "N")
			+ "' WHERE PP_FIRS_ID=" + getPP_FIRS_ID();
		int noLine = DB.executeUpdateEx("UPDATE PP_FIRSLine " + set, get_TrxName());
		log.fine("setProcessed - " + processed + " - Lines=" + noLine );
	}	//	setProcessed

	@Override
	public File createPDF() {
		/*try
		{
			File temp = File.createTempFile(get_TableName()+get_ID()+"_", ".pdf");
			return createPDF (temp);
		}
		catch (Exception e)
		{
			log.severe("Could not create PDF - " + e.getMessage());
		}*/
		return null;
	}
/*
	@Override
	public BigDecimal getApprovalAmt() {
		// TODO Auto-generated method stub
		return getGrandTotal();
	}
*/
	@Override
	public int getDoc_User_ID() {
		// TODO Auto-generated method stub
		return getCreatedBy();
	}

	@Override
	public String getDocumentInfo() {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		return dt.getName() + " " + getDocumentNo();
	}

	@Override
	public String getProcessMsg() {
		// TODO Auto-generated method stub
		return m_processMsg;
	}
/*
	@Override
	public String getSummary() {
		StringBuffer sb = new StringBuffer();
		sb.append(getDocumentNo());
		//	: Total Lines = 123.00 (#1)
		sb.append(": ")
			.append(Msg.translate(getCtx(),"GrandTotal")).append("=").append(this.getGrandTotal());
		//	 - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());
		return sb.toString();
	}
*/
	@Override
	public boolean invalidateIt() {
		log.info(toString());
		setDocAction(DOCACTION_Prepare);
		return true;
	}

	@Override
	public String prepareIt() {
		log.info(toString());
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
/*				
		if (!MPeriod.isOpen(getCtx(), getDateDoc(), 
				org.wipelectric.model.I_C_DocType.DOCBASETYPE_FIRS , getAD_Org_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}
*/		
		// Should Have Line
		MPPFIRSLine[] fLines = getLines(false);
		if(fLines.length <= 0 ){
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}

		// Verify Invoice And Find Total Amount In Line
//		BigDecimal total = Env.ZERO;
/*		
		for(MPPFIRSLine bLine : fLines ){
			MInvoice invoice = MInvoice.get(p_ctx, bLine.getC_Invoice_ID()); 
			if(invoice != null && bLine.isActive()){
				// Check Invoice Should Be Selling Process
				if(!invoice.isSOTrx()){
					m_processMsg = "@BillInconsistencyInvoice@";
					return DocAction.STATUS_Invalid;
				}
				
				// == Compare the Open Amount with Billing Amount ==
				BigDecimal invoiceOpenAmt = invoice.getOpenAmt();
				BigDecimal invNetAmt = bLine.getNetAmtToInvoice();
				
				String sql = "SELECT SUM(bal.NetAmtToInvoice) "
						+ "FROM C_BillingLine bal JOIN C_Billing ba "
						+ "ON ba.PP_FIRS_ID = bal.PP_FIRS_ID "
						+ "AND ba.IsActive = 'Y' AND bal.IsActive = 'Y' "
						+ "WHERE bal.C_Invoice_ID = ? "
						+ "AND ba.DocStatus in ('CO'); "; // For Billed (but not closed)
				
				BigDecimal invoiceBillAmt = DB.getSQLValueBD(get_TrxName(), sql, invoice.getC_Invoice_ID());
				if(invoiceBillAmt == null) 
					invoiceBillAmt = Env.ZERO;
				
				invoiceBillAmt = invoiceBillAmt.add(invNetAmt);
					
				if(invoiceOpenAmt.compareTo(invoiceBillAmt)<0){
					m_processMsg = "@BillAmtOverInvoiceAmt@";
					return DocAction.STATUS_Invalid;
				}
			}
			
			total = total.add(bLine.getNetAmtToInvoice());
		}
*/		
/*	
		if(total.compareTo(getGrandTotal()) != 0){
			m_processMsg = "@BillSumInconsistent@";
			return DocAction.STATUS_Invalid;
		}
*/		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		
		m_justPrepared = true;
		if (!DOCACTION_Complete.equals(getDocAction()))
			setDocAction(DOCACTION_Complete);
		return DocAction.STATUS_InProgress;
	}
	
	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;
	
	MPPFIRSLine[] lines = null;
	
	public MPPFIRSLine[] getLines(boolean query){
		if(lines == null || query)
			lines = getLines(null);
		
		return lines;
	}
	
	
	public MPPFIRSLine[] getLines(String whereClause){
		String whereClauseFinal = "PP_FIRS_ID=? ";
		if (whereClause != null)
			whereClauseFinal += whereClause;
		
		List<MPPFIRSLine> list = new Query(getCtx(), MPPFIRSLine.Table_Name, whereClauseFinal, get_TrxName())
											.setParameters(new Object[]{getPP_FIRS_ID()})
											.setOrderBy(MPPFIRSLine.COLUMNNAME_Line)
											.list();
		
		return list.toArray(new MPPFIRSLine[list.size()]);
	}

	@Override
	public boolean processIt(String processAction) throws Exception {
		m_processMsg = null;
		DocumentEngine engine = new DocumentEngine (this, getDocStatus());
		return engine.processIt (processAction, getDocAction());
	}
	
	@Override
	public boolean reActivateIt() {
		
		log.info(toString());
		// Before reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE);
		if (m_processMsg != null)
			return false;	

		// Only billing document that has not been associated with any payment can be reactivated.
		String sql = "SELECT COUNT(*) "
				+ "FROM C_Payment "
				+ "WHERE IsActive = 'Y' AND PP_FIRS_ID = ? ";
		
		BigDecimal i = DB.getSQLValueBD(get_TrxName(), sql, getPP_FIRS_ID());
		if(i == null) 
			i = Env.ZERO;
				
		if(!i.equals(Env.ZERO)){
			m_processMsg = "@BillDocUsedByPaymentDoc@";
			return false;
		}		
		
		// After reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);
		if (m_processMsg != null)
			return false;			
		
		setProcessed(false);
		setDocAction(DOCACTION_Complete);
		
		return true;
	}

	@Override
	public boolean rejectIt() {
		log.info(toString());
		//setIsApproved(false);
		return true;
	}

	@Override
	public boolean reverseAccrualIt() {
		log.info(toString());
		// Before reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;

		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;

		return false;
	}

	@Override
	public boolean reverseCorrectIt() {
		log.info(toString());
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		return voidIt();
	}

	@Override
	public boolean unlockIt() {
		log.info("unlockIt - " + toString());
		setProcessed(false);
		return true;
	}

	@Override
	public boolean voidIt() {
		log.info(toString());
		// Before Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID);
		if (m_processMsg != null)
			return false;
/*		
		// Only for non-Closed billing
		if (!getDocStatus().equals(DocumentEngine.STATUS_Closed))
		{
			// If billing is associated with some payment, it can't be voided.
			String sql = "SELECT COUNT(*) "
				+ "FROM C_Payment "
				+ "WHERE IsActive = 'Y' AND PP_FIRS_ID = ? ";
		
			BigDecimal i = DB.getSQLValueBD(get_TrxName(), sql, getPP_FIRS_ID());
			if(i == null) 
				i = Env.ZERO;
					
			if(!i.equals(Env.ZERO)){
				m_processMsg = "@BillDocUsedByPaymentDoc@";
				return false;
			}
		}
*/
		// Set up Description as voided
//		MPPFIRSLine[] fLines = getLines(false);
/*		
		if(fLines.length > 0){
			for(MPPFIRSLine bline : fLines){
				bline.setDescription((bline.getDescription() == null ? "" : bline.getDescription())
									+ " Voided (Old Amount : "+bline.getNetAmtToInvoice()+")");
				bline.save(get_TrxName());
			}
		}
*/		
		addDescription(Msg.getMsg(getCtx(), "Voided"));
		
		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;
		
		setProcessed(true);
		setDocAction(DOCACTION_None);
		
		return true;
	}
	
	/**
	 * 	Add to Description
	 *	@param description text
	 */
	public void addDescription (String description)
	{
		String desc = getDescription();
		if (desc == null)
			setDescription(description);
		else
			setDescription(desc + " | " + description);
	}	//	addDescription

	
	public int getC_Currency_ID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    /**
     * Customize Valid Actions
     * @param docStatus
     * @param processing
     * @param orderType
     * @param isSOTrx
     * @param AD_Table_ID
     * @param docAction
     * @param options
     * @return Number of valid options
     */
    public int customizeValidActions (String docStatus, Object processing, 
                    String orderType, String isSOTrx, int AD_Table_ID, String[] docAction, String[] options, int index) {
    	
    	// If status = Drafted, add "Prepare" in the list
    	if (docStatus.equals(DocumentEngine.STATUS_Drafted)
    			|| docStatus.equals(DocumentEngine.STATUS_Invalid)) {
    		options[index++] = DocumentEngine.ACTION_Prepare;
    	}
    	
    	// If status = Completed, add "Reactivte" in the list
    	if (docStatus.equals(DocumentEngine.STATUS_Completed)) {
    		options[index++] = DocumentEngine.ACTION_ReActivate;
    		options[index++] = DocumentEngine.ACTION_Void;
    	}   	
    		
    	return index;
    }

}