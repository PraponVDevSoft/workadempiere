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

/** Generated Model for PP_FIRSLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_FIRSLine extends PO implements I_PP_FIRSLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_PP_FIRSLine (Properties ctx, int PP_FIRSLine_ID, String trxName)
    {
      super (ctx, PP_FIRSLine_ID, trxName);
      /** if (PP_FIRSLine_ID == 0)
        {
			setIsCheck1 (false);
			setIsCheck2 (false);
			setIsCheck3 (false);
			setIsCheck4 (false);
			setIsCheck5 (false);
			setLine (0);
// @SQL=SELECT NVL(MAX(Line),0)+1 AS DefaultValue FROM PP_FIRSLine WHERE PP_FIRS_ID=@PP_FIRS_ID@
			setPP_FIRS_ID (0);
			setPP_FIRSLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PP_FIRSLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_FIRSLine[")
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

	/** Set Check1.
		@param IsCheck1 Check1	  */
	public void setIsCheck1 (boolean IsCheck1)
	{
		set_Value (COLUMNNAME_IsCheck1, Boolean.valueOf(IsCheck1));
	}

	/** Get Check1.
		@return Check1	  */
	public boolean isCheck1 () 
	{
		Object oo = get_Value(COLUMNNAME_IsCheck1);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Check2.
		@param IsCheck2 Check2	  */
	public void setIsCheck2 (boolean IsCheck2)
	{
		set_Value (COLUMNNAME_IsCheck2, Boolean.valueOf(IsCheck2));
	}

	/** Get Check2.
		@return Check2	  */
	public boolean isCheck2 () 
	{
		Object oo = get_Value(COLUMNNAME_IsCheck2);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Check3.
		@param IsCheck3 Check3	  */
	public void setIsCheck3 (boolean IsCheck3)
	{
		set_Value (COLUMNNAME_IsCheck3, Boolean.valueOf(IsCheck3));
	}

	/** Get Check3.
		@return Check3	  */
	public boolean isCheck3 () 
	{
		Object oo = get_Value(COLUMNNAME_IsCheck3);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Check4.
		@param IsCheck4 Check4	  */
	public void setIsCheck4 (boolean IsCheck4)
	{
		set_Value (COLUMNNAME_IsCheck4, Boolean.valueOf(IsCheck4));
	}

	/** Get Check4.
		@return Check4	  */
	public boolean isCheck4 () 
	{
		Object oo = get_Value(COLUMNNAME_IsCheck4);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Check5.
		@param IsCheck5 Check5	  */
	public void setIsCheck5 (boolean IsCheck5)
	{
		set_Value (COLUMNNAME_IsCheck5, Boolean.valueOf(IsCheck5));
	}

	/** Get Check5.
		@return Check5	  */
	public boolean isCheck5 () 
	{
		Object oo = get_Value(COLUMNNAME_IsCheck5);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
			set_Value (COLUMNNAME_PP_Feeder_ID, null);
		else 
			set_Value (COLUMNNAME_PP_Feeder_ID, Integer.valueOf(PP_Feeder_ID));
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

	public I_PP_FeederSizeCompo getPP_FeederSizeCompo() throws RuntimeException
    {
		return (I_PP_FeederSizeCompo)MTable.get(getCtx(), I_PP_FeederSizeCompo.Table_Name)
			.getPO(getPP_FeederSizeCompo_ID(), get_TrxName());	}

	/** Set Component Size.
		@param PP_FeederSizeCompo_ID Component Size	  */
	public void setPP_FeederSizeCompo_ID (int PP_FeederSizeCompo_ID)
	{
		if (PP_FeederSizeCompo_ID < 1) 
			set_Value (COLUMNNAME_PP_FeederSizeCompo_ID, null);
		else 
			set_Value (COLUMNNAME_PP_FeederSizeCompo_ID, Integer.valueOf(PP_FeederSizeCompo_ID));
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
			set_Value (COLUMNNAME_PP_FeederSize_ID, null);
		else 
			set_Value (COLUMNNAME_PP_FeederSize_ID, Integer.valueOf(PP_FeederSize_ID));
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

	public I_PP_FIRS getPP_FIRS() throws RuntimeException
    {
		return (I_PP_FIRS)MTable.get(getCtx(), I_PP_FIRS.Table_Name)
			.getPO(getPP_FIRS_ID(), get_TrxName());	}

	/** Set FIRS.
		@param PP_FIRS_ID 
		Feeder Inspect Record Sheet
	  */
	public void setPP_FIRS_ID (int PP_FIRS_ID)
	{
		if (PP_FIRS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_FIRS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_FIRS_ID, Integer.valueOf(PP_FIRS_ID));
	}

	/** Get FIRS.
		@return Feeder Inspect Record Sheet
	  */
	public int getPP_FIRS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_FIRS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getPP_FIRS_ID()));
    }

	/** Set FIRS Line.
		@param PP_FIRSLine_ID 
		Feeder Inspect Record Sheet Line
	  */
	public void setPP_FIRSLine_ID (int PP_FIRSLine_ID)
	{
		if (PP_FIRSLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_FIRSLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_FIRSLine_ID, Integer.valueOf(PP_FIRSLine_ID));
	}

	/** Get FIRS Line.
		@return Feeder Inspect Record Sheet Line
	  */
	public int getPP_FIRSLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_FIRSLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_PP_Order_BOMLine getPP_Order_BOMLine() throws RuntimeException
    {
		return (org.eevolution.model.I_PP_Order_BOMLine)MTable.get(getCtx(), org.eevolution.model.I_PP_Order_BOMLine.Table_Name)
			.getPO(getPP_Order_BOMLine_ID(), get_TrxName());	}

	/** Set Manufacturing Order BOM Line.
		@param PP_Order_BOMLine_ID Manufacturing Order BOM Line	  */
	public void setPP_Order_BOMLine_ID (int PP_Order_BOMLine_ID)
	{
		if (PP_Order_BOMLine_ID < 1) 
			set_Value (COLUMNNAME_PP_Order_BOMLine_ID, null);
		else 
			set_Value (COLUMNNAME_PP_Order_BOMLine_ID, Integer.valueOf(PP_Order_BOMLine_ID));
	}

	/** Get Manufacturing Order BOM Line.
		@return Manufacturing Order BOM Line	  */
	public int getPP_Order_BOMLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Order_BOMLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Text1.
		@param ScanText1 Text1	  */
	public void setScanText1 (String ScanText1)
	{
		set_Value (COLUMNNAME_ScanText1, ScanText1);
	}

	/** Get Text1.
		@return Text1	  */
	public String getScanText1 () 
	{
		return (String)get_Value(COLUMNNAME_ScanText1);
	}

	/** Set Text2.
		@param ScanText2 Text2	  */
	public void setScanText2 (String ScanText2)
	{
		set_Value (COLUMNNAME_ScanText2, ScanText2);
	}

	/** Get Text2.
		@return Text2	  */
	public String getScanText2 () 
	{
		return (String)get_Value(COLUMNNAME_ScanText2);
	}

	/** Set Text3.
		@param ScanText3 Text3	  */
	public void setScanText3 (String ScanText3)
	{
		set_Value (COLUMNNAME_ScanText3, ScanText3);
	}

	/** Get Text3.
		@return Text3	  */
	public String getScanText3 () 
	{
		return (String)get_Value(COLUMNNAME_ScanText3);
	}

	/** Set Text4.
		@param ScanText4 Text4	  */
	public void setScanText4 (String ScanText4)
	{
		set_Value (COLUMNNAME_ScanText4, ScanText4);
	}

	/** Get Text4.
		@return Text4	  */
	public String getScanText4 () 
	{
		return (String)get_Value(COLUMNNAME_ScanText4);
	}

	/** Set Text5.
		@param ScanText5 Text5	  */
	public void setScanText5 (String ScanText5)
	{
		set_Value (COLUMNNAME_ScanText5, ScanText5);
	}

	/** Get Text5.
		@return Text5	  */
	public String getScanText5 () 
	{
		return (String)get_Value(COLUMNNAME_ScanText5);
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