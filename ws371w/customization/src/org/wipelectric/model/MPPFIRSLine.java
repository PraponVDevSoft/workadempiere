package org.wipelectric.model;

//import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

//import org.compiere.util.DB;

/**
 *	Model class for BillingLine
 *	
 *  @author Kitti U. - Ecosoft Co., Ltd.
 *	@version $Id: MCBillingLine.java, v1 2010/12/31 06:53:26 ktu Exp $
 */

public class MPPFIRSLine extends X_PP_FIRSLine {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MPPFIRSLine(Properties ctx, int PP_FIRSLine_ID,
			String trxName) {
		super(ctx, PP_FIRSLine_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MPPFIRSLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	protected boolean afterDelete(boolean success) {
		//updateHeaderAmount();
		return true;
	}

	protected boolean afterSave(boolean newRecord, boolean success) {
		//updateHeaderAmount();
		return true;
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		
		return true;
	}
/*
	private boolean updateHeaderAmount(){
		
		MPPFIRS billHdr = getParent();
		
		// Find Total Bill Amount 
		String sql = "SELECT SUM(NetAmtToInvoice) FROM C_BillingLine WHERE C_Billing_ID = ? AND IsActive='Y' ";
		BigDecimal totalLineNetAmt = DB.getSQLValueBD(get_TrxName(), sql, billHdr.getC_Billing_ID());
		
		billHdr.setGrandTotal(totalLineNetAmt);
		
		if(!billHdr.save(get_TrxName())){
			log.saveError("Cannot Update Billing Header", "Cannot Save Billing Header");
			return false;
		}

		return true;
	}
*/	
	private MPPFIRS parent = null ;
	
	public MPPFIRS getParent(){
		if(parent == null)
			parent = MPPFIRS.getFIRS(getCtx(), getPP_FIRS_ID(), get_TrxName());
		
		return parent;
	}
}