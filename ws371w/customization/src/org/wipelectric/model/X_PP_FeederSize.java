/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.wipelectric.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for PP_FeederSize
 *  @author Adempiere (generated) 
 *  @version Release 3.7.1RC - $Id$ */
public class X_PP_FeederSize extends PO implements I_PP_FeederSize, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25620221L;

    /** Standard Constructor */
    public X_PP_FeederSize (Properties ctx, int PP_FeederSize_ID, String trxName)
    {
      super (ctx, PP_FeederSize_ID, trxName);
      /** if (PP_FeederSize_ID == 0)
        {
			setPP_FeederSize_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PP_FeederSize (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_FeederSize[")
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