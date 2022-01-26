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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for PP_MatControl
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_MatControl extends PO implements I_PP_MatControl, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_PP_MatControl (Properties ctx, int PP_MatControl_ID, String trxName)
    {
      super (ctx, PP_MatControl_ID, trxName);
      /** if (PP_MatControl_ID == 0)
        {
			setPP_MatControl_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_PP_MatControl (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_MatControl[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** BOM_Assembly AD_Reference_ID=1000005 */
	public static final int BOM_ASSEMBLY_AD_Reference_ID=1000005;
	/** SMT = 1 */
	public static final String BOM_ASSEMBLY_SMT = "1";
	/** AI = 2 */
	public static final String BOM_ASSEMBLY_AI = "2";
	/** AS1 = 3 */
	public static final String BOM_ASSEMBLY_AS1 = "3";
	/** AS2 = 4 */
	public static final String BOM_ASSEMBLY_AS2 = "4";
	/** QC = 5 */
	public static final String BOM_ASSEMBLY_QC = "5";
	/** PK = 6 */
	public static final String BOM_ASSEMBLY_PK = "6";
	/** AI,AS1 = A */
	public static final String BOM_ASSEMBLY_AIAS1 = "A";
	/** LED = L */
	public static final String BOM_ASSEMBLY_LED = "L";
	/** Set BOM Assembly.
		@param BOM_Assembly BOM Assembly	  */
	public void setBOM_Assembly (String BOM_Assembly)
	{

		set_Value (COLUMNNAME_BOM_Assembly, BOM_Assembly);
	}

	/** Get BOM Assembly.
		@return BOM Assembly	  */
	public String getBOM_Assembly () 
	{
		return (String)get_Value(COLUMNNAME_BOM_Assembly);
	}

	/** Set Date Ordered.
		@param DateOrdered 
		Date of Order
	  */
	public void setDateOrdered (Timestamp DateOrdered)
	{
		set_Value (COLUMNNAME_DateOrdered, DateOrdered);
	}

	/** Get Date Ordered.
		@return Date of Order
	  */
	public Timestamp getDateOrdered () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateOrdered);
	}

	/** Set DoSomething.
		@param DoSomething DoSomething	  */
	public void setDoSomething (String DoSomething)
	{
		set_Value (COLUMNNAME_DoSomething, DoSomething);
	}

	/** Get DoSomething.
		@return DoSomething	  */
	public String getDoSomething () 
	{
		return (String)get_Value(COLUMNNAME_DoSomething);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set PP_MatControl.
		@param PP_MatControl_ID PP_MatControl	  */
	public void setPP_MatControl_ID (int PP_MatControl_ID)
	{
		if (PP_MatControl_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_MatControl_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_MatControl_ID, Integer.valueOf(PP_MatControl_ID));
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