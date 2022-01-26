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

/** Generated Model for PP_FeederSizeCompo
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_FeederSizeCompo extends PO implements I_PP_FeederSizeCompo, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_PP_FeederSizeCompo (Properties ctx, int PP_FeederSizeCompo_ID, String trxName)
    {
      super (ctx, PP_FeederSizeCompo_ID, trxName);
      /** if (PP_FeederSizeCompo_ID == 0)
        {
			setPP_FeederSizeCompo_ID (0);
			setPP_FeederSize_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PP_FeederSizeCompo (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_FeederSizeCompo[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Component Size.
		@param PP_FeederSizeCompo_ID Component Size	  */
	public void setPP_FeederSizeCompo_ID (int PP_FeederSizeCompo_ID)
	{
		if (PP_FeederSizeCompo_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_FeederSizeCompo_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_FeederSizeCompo_ID, Integer.valueOf(PP_FeederSizeCompo_ID));
	}

	/** Get Component Size.
		@return Component Size	  */
	public int getPP_FeederSizeCompo_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_FeederSizeCompo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_PP_FeederSize getPP_FeederSize() throws RuntimeException
    {
		return (I_PP_FeederSize)MTable.get(getCtx(), I_PP_FeederSize.Table_Name)
			.getPO(getPP_FeederSize_ID(), get_TrxName());	}

	/** Set Feeder Size.
		@param PP_FeederSize_ID Feeder Size	  */
	public void setPP_FeederSize_ID (int PP_FeederSize_ID)
	{
		if (PP_FeederSize_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_FeederSize_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_FeederSize_ID, Integer.valueOf(PP_FeederSize_ID));
	}

	/** Get Feeder Size.
		@return Feeder Size	  */
	public int getPP_FeederSize_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_FeederSize_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Size.
		@param Size 
		Size
	  */
	public void setSize (String Size)
	{
		throw new IllegalArgumentException ("Size is virtual column");	}

	/** Get Size.
		@return Size
	  */
	public String getSize () 
	{
		return (String)get_Value(COLUMNNAME_Size);
	}
}