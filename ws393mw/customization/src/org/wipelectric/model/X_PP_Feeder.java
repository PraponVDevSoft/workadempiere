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

/** Generated Model for PP_Feeder
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_Feeder extends PO implements I_PP_Feeder, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_PP_Feeder (Properties ctx, int PP_Feeder_ID, String trxName)
    {
      super (ctx, PP_Feeder_ID, trxName);
      /** if (PP_Feeder_ID == 0)
        {
			setA_Asset_ID (0);
			setPP_Feeder_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PP_Feeder (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_Feeder[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException
    {
		return (org.compiere.model.I_A_Asset)MTable.get(getCtx(), org.compiere.model.I_A_Asset.Table_Name)
			.getPO(getA_Asset_ID(), get_TrxName());	}

	/** Set Fixed Asset.
		@param A_Asset_ID 
		Fixed Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Fixed Asset.
		@return Fixed Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Feeder No.
		@param FeederNo Feeder No	  */
	public void setFeederNo (String FeederNo)
	{
		set_Value (COLUMNNAME_FeederNo, FeederNo);
	}

	/** Get Feeder No.
		@return Feeder No	  */
	public String getFeederNo () 
	{
		return (String)get_Value(COLUMNNAME_FeederNo);
	}

	/** Set Feeder.
		@param PP_Feeder_ID Feeder	  */
	public void setPP_Feeder_ID (int PP_Feeder_ID)
	{
		if (PP_Feeder_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_Feeder_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_Feeder_ID, Integer.valueOf(PP_Feeder_ID));
	}

	/** Get Feeder.
		@return Feeder	  */
	public int getPP_Feeder_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Feeder_ID);
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
		set_Value (COLUMNNAME_Size, Size);
	}

	/** Get Size.
		@return Size
	  */
	public String getSize () 
	{
		return (String)get_Value(COLUMNNAME_Size);
	}
}