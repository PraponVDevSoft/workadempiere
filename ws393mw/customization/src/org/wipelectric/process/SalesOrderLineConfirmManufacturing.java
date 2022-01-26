/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2021 														  *
*******************************************************************************/
package org.wipelectric.process;


import java.math.BigDecimal;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.adempiere.exceptions.FillMandatoryException;
import org.compiere.model.MQuery;
import org.compiere.model.MTable;
import org.compiere.model.PrintInfo;
import org.compiere.print.MPrintFormat;
import org.compiere.print.ReportCtl;
import org.compiere.print.ReportEngine;
import org.compiere.process.ClientProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.eevolution.model.MPPOrder;

/**
 * Sales Order Line Confirm for Manufacturing Order
 * @author prapon@vdevsoft.com
 * @author 
 */
public class SalesOrderLineConfirmManufacturing extends SvrProcess
implements ClientProcess
{
	/** The Order */
	private int p_C_OrderLine_ID = 0;
	private boolean p_IsConfirmed = false;
 	@SuppressWarnings("unused")

	/**
	 * Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
 		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)	
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_OrderLine_ID"))
				p_C_OrderLine_ID = ((BigDecimal)para[i].getParameter()).intValue();		
			else if (name.equals("IsConfirmed"))
				p_IsConfirmed = para[i].getParameterAsBoolean();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	} // prepare

	/**
	 * Perform process.
	 * 
	 * @return Message (clear text)
	 * @throws Exception
	 *             if not successful
	 */
	protected String doIt() throws Exception
	{
/*
		if (p_C_OrderLine_ID == 0)
		{
			throw new FillMandatoryException(MCorderLine.COLUMNNAME_C_OrderLine_ID);
		}
*/
		if (p_IsConfirmed)
		{
			// Get Format & Data
			ReportEngine re = this.getReportEngine("Manufacturing_Order_BOM_Header ** TEMPLATE **","PP_Order_BOM_Header_v");
			if(re == null )
			{
				return "";
			}
			ReportCtl.preview(re);
			// re.print(); // prints only original		Prapon 3.9.3-09/12/2021
		}

		return "@OK@";

	} // doIt
	
	/*
	 * get the a Report Engine Instance using the view table 
	 * @param tableName
	 */
	private ReportEngine getReportEngine(String formatName, String tableName)
	{
		// Get Format & Data
		int format_id= MPrintFormat.getPrintFormat_ID(formatName, MTable.getTable_ID(tableName), getAD_Client_ID());
		MPrintFormat format = MPrintFormat.get(getCtx(), format_id, true);
		if (format == null)
		{
			addLog("@NotFound@ @AD_PrintFormat_ID@");
			return null;
		}
		// query
		MQuery query = new MQuery(tableName);
		query.addRestriction("C_OrderLine_ID", MQuery.EQUAL, p_C_OrderLine_ID);
		// Engine
		PrintInfo info = new PrintInfo(tableName,  MTable.getTable_ID(tableName), p_C_OrderLine_ID);
		ReportEngine re = new ReportEngine(getCtx(), format, query, info);
		return re;
	}
} // CompletePrintOrder
