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

/** Generated Model for T_CountingStock
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_T_CountingStock extends PO implements I_T_CountingStock, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_T_CountingStock (Properties ctx, int T_CountingStock_ID, String trxName)
    {
      super (ctx, T_CountingStock_ID, trxName);
      /** if (T_CountingStock_ID == 0)
        {
			setT_CountingStock_ID (0);
        } */
    }

    /** Load Constructor */
    public X_T_CountingStock (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_T_CountingStock[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Product.
		@param Product Product	  */
	public void setProduct (String Product)
	{
		set_Value (COLUMNNAME_Product, Product);
	}

	/** Get Product.
		@return Product	  */
	public String getProduct () 
	{
		return (String)get_Value(COLUMNNAME_Product);
	}

	/** Set Product Name.
		@param ProductName 
		Name of the Product
	  */
	public void setProductName (String ProductName)
	{
		throw new IllegalArgumentException ("ProductName is virtual column");	}

	/** Get Product Name.
		@return Name of the Product
	  */
	public String getProductName () 
	{
		return (String)get_Value(COLUMNNAME_ProductName);
	}

	/** Set Quantity.
		@param Qty 
		Quantity
	  */
	public void setQty (BigDecimal Qty)
	{
		set_Value (COLUMNNAME_Qty, Qty);
	}

	/** Get Quantity.
		@return Quantity
	  */
	public BigDecimal getQty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Counting Stock.
		@param T_CountingStock_ID 
		Temporary Counting Stock
	  */
	public void setT_CountingStock_ID (int T_CountingStock_ID)
	{
		if (T_CountingStock_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_T_CountingStock_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_T_CountingStock_ID, Integer.valueOf(T_CountingStock_ID));
	}

	/** Get Counting Stock.
		@return Temporary Counting Stock
	  */
	public int getT_CountingStock_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_T_CountingStock_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}