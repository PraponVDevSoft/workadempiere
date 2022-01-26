/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.wipelectric.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;

//import org.eevolution.model.MPPProductBom;
//import org.compiere.model.MInventoryLine;
//import org.compiere.model.MInventoryLineMA;
//import org.compiere.model.MStorage;
//import org.compiere.util.AdempiereSystemError;
//import org.compiere.util.DB;
//import org.compiere.util.Env;


import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.adempiere.exceptions.DBException;
import org.compiere.model.MRole;
import org.compiere.util.DB;
import org.compiere.util.TimeUtil;



/**
 *	Update existing Inventory Count List with current Book value
 *	
 *  @author Prapon Thavornkaew
 *  2016/11/03 00:00:00
 */
public class BomCalculateCost extends SvrProcess
{
	/** Product BOM */
	private int		p_PP_Product_BOM_ID = 0;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{		
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("PP_Product_BOM_ID"))
				p_PP_Product_BOM_ID = ((BigDecimal)para[i].getParameter()).intValue();			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}		
	}	//	prepare

	
	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt() throws Exception	
	{
		log.info("PP_Product_BOM_ID=" + p_PP_Product_BOM_ID);
		String sql= "SELECT bom_calculate_cost_pt( " + p_PP_Product_BOM_ID +" ) as i";
    	int i2 = DB.getSQLValue("i", sql);
	    System.out.println(" Return : " + i2);		
		// 	log.info("Calculate with Product BOM ID=" + no);
		return "";	    
	}	//	doIt

	
}	//	BomCalculateCost
