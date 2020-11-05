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

/** Generated Model for R_RequestResultLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_R_RequestResultLine extends PO implements I_R_RequestResultLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_R_RequestResultLine (Properties ctx, int R_RequestResultLine_ID, String trxName)
    {
      super (ctx, R_RequestResultLine_ID, trxName);
      /** if (R_RequestResultLine_ID == 0)
        {
			setLine (0);
// @SQL=SELECT COALESCE(MAX(Line),0)+1 AS DefaultValue FROM R_RequestResultLine WHERE R_Request_ID=@R_Request_ID@
			setR_Request_ID (0);
			setR_RequestResultLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_R_RequestResultLine (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
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
      StringBuffer sb = new StringBuffer ("X_R_RequestResultLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Date Start.
		@param DateStart 
		Date Start for this Order
	  */
	public void setDateStart (Timestamp DateStart)
	{
		set_Value (COLUMNNAME_DateStart, DateStart);
	}

	/** Get Date Start.
		@return Date Start for this Order
	  */
	public Timestamp getDateStart () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateStart);
	}

	/** Set Cause Details.
		@param DescCause Cause Details	  */
	public void setDescCause (String DescCause)
	{
		set_Value (COLUMNNAME_DescCause, DescCause);
	}

	/** Get Cause Details.
		@return Cause Details	  */
	public String getDescCause () 
	{
		return (String)get_Value(COLUMNNAME_DescCause);
	}

	/** Set Repair Details.
		@param DescRepair Repair Details	  */
	public void setDescRepair (String DescRepair)
	{
		set_Value (COLUMNNAME_DescRepair, DescRepair);
	}

	/** Get Repair Details.
		@return Repair Details	  */
	public String getDescRepair () 
	{
		return (String)get_Value(COLUMNNAME_DescRepair);
	}

	/** Set Symptom Details.
		@param DescSymptom Symptom Details	  */
	public void setDescSymptom (String DescSymptom)
	{
		set_Value (COLUMNNAME_DescSymptom, DescSymptom);
	}

	/** Get Symptom Details.
		@return Symptom Details	  */
	public String getDescSymptom () 
	{
		return (String)get_Value(COLUMNNAME_DescSymptom);
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

	/** Set Lot No.
		@param Lot 
		Lot number (alphanumeric)
	  */
	public void setLot (String Lot)
	{
		throw new IllegalArgumentException ("Lot is virtual column");	}

	/** Get Lot No.
		@return Lot number (alphanumeric)
	  */
	public String getLot () 
	{
		return (String)get_Value(COLUMNNAME_Lot);
	}

	public I_QR_Cause getQR_Cause() throws RuntimeException
    {
		return (I_QR_Cause)MTable.get(getCtx(), I_QR_Cause.Table_Name)
			.getPO(getQR_Cause_ID(), get_TrxName());	}

	/** Set Cause.
		@param QR_Cause_ID 
		Root of problem
	  */
	public void setQR_Cause_ID (int QR_Cause_ID)
	{
		if (QR_Cause_ID < 1) 
			set_Value (COLUMNNAME_QR_Cause_ID, null);
		else 
			set_Value (COLUMNNAME_QR_Cause_ID, Integer.valueOf(QR_Cause_ID));
	}

	/** Get Cause.
		@return Root of problem
	  */
	public int getQR_Cause_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QR_Cause_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_QR_Repair getQR_Repair() throws RuntimeException
    {
		return (I_QR_Repair)MTable.get(getCtx(), I_QR_Repair.Table_Name)
			.getPO(getQR_Repair_ID(), get_TrxName());	}

	/** Set Repair.
		@param QR_Repair_ID Repair	  */
	public void setQR_Repair_ID (int QR_Repair_ID)
	{
		if (QR_Repair_ID < 1) 
			set_Value (COLUMNNAME_QR_Repair_ID, null);
		else 
			set_Value (COLUMNNAME_QR_Repair_ID, Integer.valueOf(QR_Repair_ID));
	}

	/** Get Repair.
		@return Repair	  */
	public int getQR_Repair_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QR_Repair_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_QR_Symptom getQR_Symptom() throws RuntimeException
    {
		return (I_QR_Symptom)MTable.get(getCtx(), I_QR_Symptom.Table_Name)
			.getPO(getQR_Symptom_ID(), get_TrxName());	}

	/** Set Symptom.
		@param QR_Symptom_ID 
		Problem or Symptom
	  */
	public void setQR_Symptom_ID (int QR_Symptom_ID)
	{
		if (QR_Symptom_ID < 1) 
			set_Value (COLUMNNAME_QR_Symptom_ID, null);
		else 
			set_Value (COLUMNNAME_QR_Symptom_ID, Integer.valueOf(QR_Symptom_ID));
	}

	/** Get Symptom.
		@return Problem or Symptom
	  */
	public int getQR_Symptom_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QR_Symptom_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Result.
		@param Result 
		Result of the action taken
	  */
	public void setResult (String Result)
	{
		set_Value (COLUMNNAME_Result, Result);
	}

	/** Get Result.
		@return Result of the action taken
	  */
	public String getResult () 
	{
		return (String)get_Value(COLUMNNAME_Result);
	}

	public org.compiere.model.I_R_Request getR_Request() throws RuntimeException
    {
		return (org.compiere.model.I_R_Request)MTable.get(getCtx(), org.compiere.model.I_R_Request.Table_Name)
			.getPO(getR_Request_ID(), get_TrxName());	}

	/** Set Request.
		@param R_Request_ID 
		Request from a Business Partner or Prospect
	  */
	public void setR_Request_ID (int R_Request_ID)
	{
		if (R_Request_ID < 1) 
			set_Value (COLUMNNAME_R_Request_ID, null);
		else 
			set_Value (COLUMNNAME_R_Request_ID, Integer.valueOf(R_Request_ID));
	}

	/** Get Request.
		@return Request from a Business Partner or Prospect
	  */
	public int getR_Request_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_Request_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Request Result Line.
		@param R_RequestResultLine_ID 
		Request Result Line
	  */
	public void setR_RequestResultLine_ID (int R_RequestResultLine_ID)
	{
		if (R_RequestResultLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_R_RequestResultLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_R_RequestResultLine_ID, Integer.valueOf(R_RequestResultLine_ID));
	}

	/** Get Request Result Line.
		@return Request Result Line
	  */
	public int getR_RequestResultLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestResultLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Serial No.
		@param SerNo 
		Product Serial Number 
	  */
	public void setSerNo (String SerNo)
	{
		set_Value (COLUMNNAME_SerNo, SerNo);
	}

	/** Get Serial No.
		@return Product Serial Number 
	  */
	public String getSerNo () 
	{
		return (String)get_Value(COLUMNNAME_SerNo);
	}

	/** Set Text Message.
		@param TextMsg 
		Text Message
	  */
	public void setTextMsg (String TextMsg)
	{
		set_Value (COLUMNNAME_TextMsg, TextMsg);
	}

	/** Get Text Message.
		@return Text Message
	  */
	public String getTextMsg () 
	{
		return (String)get_Value(COLUMNNAME_TextMsg);
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