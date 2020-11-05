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

/** Generated Model for QR_RepairItemLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_QR_RepairItemLine extends PO implements I_QR_RepairItemLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_QR_RepairItemLine (Properties ctx, int QR_RepairItemLine_ID, String trxName)
    {
      super (ctx, QR_RepairItemLine_ID, trxName);
      /** if (QR_RepairItemLine_ID == 0)
        {
			setC_UOM_ID (0);
			setQR_RepairItem_ID (0);
			setQR_RepairItemLine_ID (0);
			setqtyrequiered (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_QR_RepairItemLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_QR_RepairItemLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException
    {
		return (org.compiere.model.I_C_UOM)MTable.get(getCtx(), org.compiere.model.I_C_UOM.Table_Name)
			.getPO(getC_UOM_ID(), get_TrxName());	}

	/** Set UOM.
		@param C_UOM_ID 
		Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get UOM.
		@return Unit of Measure
	  */
	public int getC_UOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
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

	public I_QR_RepairItem getQR_RepairItem() throws RuntimeException
    {
		return (I_QR_RepairItem)MTable.get(getCtx(), I_QR_RepairItem.Table_Name)
			.getPO(getQR_RepairItem_ID(), get_TrxName());	}

	/** Set Repair Item.
		@param QR_RepairItem_ID Repair Item	  */
	public void setQR_RepairItem_ID (int QR_RepairItem_ID)
	{
		if (QR_RepairItem_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_QR_RepairItem_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_QR_RepairItem_ID, Integer.valueOf(QR_RepairItem_ID));
	}

	/** Get Repair Item.
		@return Repair Item	  */
	public int getQR_RepairItem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QR_RepairItem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set QR_RepairItemLine_ID.
		@param QR_RepairItemLine_ID QR_RepairItemLine_ID	  */
	public void setQR_RepairItemLine_ID (int QR_RepairItemLine_ID)
	{
		if (QR_RepairItemLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_QR_RepairItemLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_QR_RepairItemLine_ID, Integer.valueOf(QR_RepairItemLine_ID));
	}

	/** Get QR_RepairItemLine_ID.
		@return QR_RepairItemLine_ID	  */
	public int getQR_RepairItemLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QR_RepairItemLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set qtyrequiered.
		@param qtyrequiered qtyrequiered	  */
	public void setqtyrequiered (BigDecimal qtyrequiered)
	{
		set_Value (COLUMNNAME_qtyrequiered, qtyrequiered);
	}

	/** Get qtyrequiered.
		@return qtyrequiered	  */
	public BigDecimal getqtyrequiered () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_qtyrequiered);
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