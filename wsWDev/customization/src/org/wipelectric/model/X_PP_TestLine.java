/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.wipelectric.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for PP_TestLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_TestLine extends PO implements I_PP_TestLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_PP_TestLine (Properties ctx, int PP_TestLine_ID, String trxName)
    {
      super (ctx, PP_TestLine_ID, trxName);
      /** if (PP_TestLine_ID == 0)
        {
			setPP_Product_BOM_ID (0);
			setPP_Test_ID (0);
			setPP_TestLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PP_TestLine (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_PP_TestLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		throw new IllegalArgumentException ("M_Product_ID is virtual column");	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException
    {
		return (org.eevolution.model.I_PP_Product_BOM)MTable.get(getCtx(), org.eevolution.model.I_PP_Product_BOM.Table_Name)
			.getPO(getPP_Product_BOM_ID(), get_TrxName());	}

	/** Set BOM & Formula.
		@param PP_Product_BOM_ID 
		BOM & Formula
	  */
	public void setPP_Product_BOM_ID (int PP_Product_BOM_ID)
	{
		if (PP_Product_BOM_ID < 1) 
			set_Value (COLUMNNAME_PP_Product_BOM_ID, null);
		else 
			set_Value (COLUMNNAME_PP_Product_BOM_ID, Integer.valueOf(PP_Product_BOM_ID));
	}

	/** Get BOM & Formula.
		@return BOM & Formula
	  */
	public int getPP_Product_BOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Product_BOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_PP_Test getPP_Test() throws RuntimeException
    {
		return (I_PP_Test)MTable.get(getCtx(), I_PP_Test.Table_Name)
			.getPO(getPP_Test_ID(), get_TrxName());	}

	/** Set PD_Test.
		@param PP_Test_ID PD_Test	  */
	public void setPP_Test_ID (int PP_Test_ID)
	{
		if (PP_Test_ID < 1) 
			set_Value (COLUMNNAME_PP_Test_ID, null);
		else 
			set_Value (COLUMNNAME_PP_Test_ID, Integer.valueOf(PP_Test_ID));
	}

	/** Get PD_Test.
		@return PD_Test	  */
	public int getPP_Test_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Test_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PD_TestLine.
		@param PP_TestLine_ID PD_TestLine	  */
	public void setPP_TestLine_ID (int PP_TestLine_ID)
	{
		if (PP_TestLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_TestLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_TestLine_ID, Integer.valueOf(PP_TestLine_ID));
	}

	/** Get PD_TestLine.
		@return PD_TestLine	  */
	public int getPP_TestLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_TestLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Quantity.
		@param QtyEntered 
		The Quantity Entered is based on the selected UoM
	  */
	public void setQtyEntered (BigDecimal QtyEntered)
	{
		set_Value (COLUMNNAME_QtyEntered, QtyEntered);
	}

	/** Get Quantity.
		@return The Quantity Entered is based on the selected UoM
	  */
	public BigDecimal getQtyEntered () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}