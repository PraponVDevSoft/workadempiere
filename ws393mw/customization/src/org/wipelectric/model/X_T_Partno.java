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

/** Generated Model for T_Partno
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_T_Partno extends PO implements I_T_Partno, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_T_Partno (Properties ctx, int T_Partno_ID, String trxName)
    {
      super (ctx, T_Partno_ID, trxName);
      /** if (T_Partno_ID == 0)
        {
			setT_Partno_ID (0);
        } */
    }

    /** Load Constructor */
    public X_T_Partno (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_T_Partno[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set ma_code.
		@param ma_code ma_code	  */
	public void setma_code (String ma_code)
	{
		set_Value (COLUMNNAME_ma_code, ma_code);
	}

	/** Get ma_code.
		@return ma_code	  */
	public String getma_code () 
	{
		return (String)get_Value(COLUMNNAME_ma_code);
	}

	/** Set mb_name.
		@param mb_name mb_name	  */
	public void setmb_name (String mb_name)
	{
		set_Value (COLUMNNAME_mb_name, mb_name);
	}

	/** Get mb_name.
		@return mb_name	  */
	public String getmb_name () 
	{
		return (String)get_Value(COLUMNNAME_mb_name);
	}

	/** Set mb_seq.
		@param mb_seq mb_seq	  */
	public void setmb_seq (int mb_seq)
	{
		set_Value (COLUMNNAME_mb_seq, Integer.valueOf(mb_seq));
	}

	/** Get mb_seq.
		@return mb_seq	  */
	public int getmb_seq () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_mb_seq);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set part_no.
		@param part_no part_no	  */
	public void setpart_no (String part_no)
	{
		set_Value (COLUMNNAME_part_no, part_no);
	}

	/** Get part_no.
		@return part_no	  */
	public String getpart_no () 
	{
		return (String)get_Value(COLUMNNAME_part_no);
	}

	/** Set T_Partno.
		@param T_Partno_ID T_Partno	  */
	public void setT_Partno_ID (int T_Partno_ID)
	{
		if (T_Partno_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_T_Partno_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_T_Partno_ID, Integer.valueOf(T_Partno_ID));
	}

	/** Get T_Partno.
		@return T_Partno	  */
	public int getT_Partno_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_T_Partno_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}