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

/** Generated Model for PP_MatControl_Checking
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_MatControl_Checking extends PO implements I_PP_MatControl_Checking, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_PP_MatControl_Checking (Properties ctx, int PP_MatControl_Checking_ID, String trxName)
    {
      super (ctx, PP_MatControl_Checking_ID, trxName);
      /** if (PP_MatControl_Checking_ID == 0)
        {
			setPP_MatControl_Checking_ID (0);
			setPP_MatControl_ID (0);
			setQtyDelivered (Env.ZERO);
			setQtyRequired (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_PP_MatControl_Checking (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_MatControl_Checking[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set BOM Assembly.
		@param BOM_Assembly BOM Assembly	  */
	public void setBOM_Assembly (boolean BOM_Assembly)
	{
		set_Value (COLUMNNAME_BOM_Assembly, Boolean.valueOf(BOM_Assembly));
	}

	/** Get BOM Assembly.
		@return BOM Assembly	  */
	public boolean isBOM_Assembly () 
	{
		Object oo = get_Value(COLUMNNAME_BOM_Assembly);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

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

	/** Set PP_MatControl_Checking.
		@param PP_MatControl_Checking_ID PP_MatControl_Checking	  */
	public void setPP_MatControl_Checking_ID (int PP_MatControl_Checking_ID)
	{
		if (PP_MatControl_Checking_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_MatControl_Checking_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_MatControl_Checking_ID, Integer.valueOf(PP_MatControl_Checking_ID));
	}

	/** Get PP_MatControl_Checking.
		@return PP_MatControl_Checking	  */
	public int getPP_MatControl_Checking_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_MatControl_Checking_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_PP_MatControl getPP_MatControl() throws RuntimeException
    {
		return (I_PP_MatControl)MTable.get(getCtx(), I_PP_MatControl.Table_Name)
			.getPO(getPP_MatControl_ID(), get_TrxName());	}

	/** Set PP_MatControl.
		@param PP_MatControl_ID PP_MatControl	  */
	public void setPP_MatControl_ID (int PP_MatControl_ID)
	{
		if (PP_MatControl_ID < 1) 
			set_Value (COLUMNNAME_PP_MatControl_ID, null);
		else 
			set_Value (COLUMNNAME_PP_MatControl_ID, Integer.valueOf(PP_MatControl_ID));
	}

	/** Get PP_MatControl.
		@return PP_MatControl	  */
	public int getPP_MatControl_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_MatControl_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Checking-1.
		@param QtyCount1 
		R/M Checking-1
	  */
	public void setQtyCount1 (BigDecimal QtyCount1)
	{
		set_Value (COLUMNNAME_QtyCount1, QtyCount1);
	}

	/** Get Checking-1.
		@return R/M Checking-1
	  */
	public BigDecimal getQtyCount1 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyCount1);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Checking-2.
		@param QtyCount2 
		R/M Checking-2
	  */
	public void setQtyCount2 (BigDecimal QtyCount2)
	{
		set_Value (COLUMNNAME_QtyCount2, QtyCount2);
	}

	/** Get Checking-2.
		@return R/M Checking-2
	  */
	public BigDecimal getQtyCount2 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyCount2);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Delivered Quantity.
		@param QtyDelivered 
		Delivered Quantity
	  */
	public void setQtyDelivered (BigDecimal QtyDelivered)
	{
		set_Value (COLUMNNAME_QtyDelivered, QtyDelivered);
	}

	/** Get Delivered Quantity.
		@return Delivered Quantity
	  */
	public BigDecimal getQtyDelivered () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyDelivered);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Qty Required.
		@param QtyRequired Qty Required	  */
	public void setQtyRequired (BigDecimal QtyRequired)
	{
		set_Value (COLUMNNAME_QtyRequired, QtyRequired);
	}

	/** Get Qty Required.
		@return Qty Required	  */
	public BigDecimal getQtyRequired () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyRequired);
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