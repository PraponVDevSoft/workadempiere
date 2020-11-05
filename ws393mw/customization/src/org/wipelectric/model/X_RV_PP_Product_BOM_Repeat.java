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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for RV_PP_Product_BOM_Repeat
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_RV_PP_Product_BOM_Repeat extends PO implements I_RV_PP_Product_BOM_Repeat, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_RV_PP_Product_BOM_Repeat (Properties ctx, int RV_PP_Product_BOM_Repeat_ID, String trxName)
    {
      super (ctx, RV_PP_Product_BOM_Repeat_ID, trxName);
      /** if (RV_PP_Product_BOM_Repeat_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RV_PP_Product_BOM_Repeat (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_RV_PP_Product_BOM_Repeat[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Counter.
		@param Counter 
		Count Value
	  */
	public void setCounter (String Counter)
	{
		set_Value (COLUMNNAME_Counter, Counter);
	}

	/** Get Counter.
		@return Count Value
	  */
	public String getCounter () 
	{
		return (String)get_Value(COLUMNNAME_Counter);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
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

	/** Set Product BOM Key.
		@param Product_BOM_Value 
		Key of Product BOM
	  */
	public void setProduct_BOM_Value (String Product_BOM_Value)
	{
		set_Value (COLUMNNAME_Product_BOM_Value, Product_BOM_Value);
	}

	/** Get Product BOM Key.
		@return Key of Product BOM
	  */
	public String getProduct_BOM_Value () 
	{
		return (String)get_Value(COLUMNNAME_Product_BOM_Value);
	}

	/** Set Product Name.
		@param ProductName 
		Name of the Product
	  */
	public void setProductName (String ProductName)
	{
		set_Value (COLUMNNAME_ProductName, ProductName);
	}

	/** Get Product Name.
		@return Name of the Product
	  */
	public String getProductName () 
	{
		return (String)get_Value(COLUMNNAME_ProductName);
	}

	/** Set Product Key.
		@param ProductValue 
		Key of the Product
	  */
	public void setProductValue (String ProductValue)
	{
		set_Value (COLUMNNAME_ProductValue, ProductValue);
	}

	/** Get Product Key.
		@return Key of the Product
	  */
	public String getProductValue () 
	{
		return (String)get_Value(COLUMNNAME_ProductValue);
	}
}