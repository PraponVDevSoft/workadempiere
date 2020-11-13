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

/** Generated Model for PP_FeederLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_FeederLine extends PO implements I_PP_FeederLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_PP_FeederLine (Properties ctx, int PP_FeederLine_ID, String trxName)
    {
      super (ctx, PP_FeederLine_ID, trxName);
      /** if (PP_FeederLine_ID == 0)
        {
			setPP_Feeder_ID (0);
			setPP_FeederLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PP_FeederLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_FeederLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_PP_Feeder getPP_Feeder() throws RuntimeException
    {
		return (I_PP_Feeder)MTable.get(getCtx(), I_PP_Feeder.Table_Name)
			.getPO(getPP_Feeder_ID(), get_TrxName());	}

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

	/** Set Feeder Line.
		@param PP_FeederLine_ID Feeder Line	  */
	public void setPP_FeederLine_ID (int PP_FeederLine_ID)
	{
		if (PP_FeederLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_FeederLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_FeederLine_ID, Integer.valueOf(PP_FeederLine_ID));
	}

	/** Get Feeder Line.
		@return Feeder Line	  */
	public int getPP_FeederLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_FeederLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}