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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for QR_RepairItem
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_QR_RepairItem extends PO implements I_QR_RepairItem, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_QR_RepairItem (Properties ctx, int QR_RepairItem_ID, String trxName)
    {
      super (ctx, QR_RepairItem_ID, trxName);
      /** if (QR_RepairItem_ID == 0)
        {
			setC_BPartner_ID (0);
			setC_DocType_ID (0);
			setDateInformed (new Timestamp( System.currentTimeMillis() ));
// @#Date@
			setDocumentNo (null);
			setIsChange (false);
// N
			setQR_RepairItem_ID (0);
        } */
    }

    /** Load Constructor */
    public X_QR_RepairItem (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_QR_RepairItem[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
    {
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getCorrec() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getCorrectBy(), get_TrxName());	}

	/** Set Correct By.
		@param CorrectBy Correct By	  */
	public void setCorrectBy (int CorrectBy)
	{
		set_Value (COLUMNNAME_CorrectBy, Integer.valueOf(CorrectBy));
	}

	/** Get Correct By.
		@return Correct By	  */
	public int getCorrectBy () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CorrectBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Correct.
		@param DateCorrect Date Correct	  */
	public void setDateCorrect (Timestamp DateCorrect)
	{
		set_Value (COLUMNNAME_DateCorrect, DateCorrect);
	}

	/** Get Date Correct.
		@return Date Correct	  */
	public Timestamp getDateCorrect () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateCorrect);
	}

	/** Set Finish Date.
		@param DateFinish 
		Finish or (planned) completion date
	  */
	public void setDateFinish (Timestamp DateFinish)
	{
		set_Value (COLUMNNAME_DateFinish, DateFinish);
	}

	/** Get Finish Date.
		@return Finish or (planned) completion date
	  */
	public Timestamp getDateFinish () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFinish);
	}

	/** Set Date Informed.
		@param DateInformed Date Informed	  */
	public void setDateInformed (Timestamp DateInformed)
	{
		set_Value (COLUMNNAME_DateInformed, DateInformed);
	}

	/** Get Date Informed.
		@return Date Informed	  */
	public Timestamp getDateInformed () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateInformed);
	}

	/** Set Date Produce.
		@param DateProduce Date Produce	  */
	public void setDateProduce (Timestamp DateProduce)
	{
		set_Value (COLUMNNAME_DateProduce, DateProduce);
	}

	/** Get Date Produce.
		@return Date Produce	  */
	public Timestamp getDateProduce () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateProduce);
	}

	/** Set Date Promised.
		@param DatePromised 
		Date Order was promised
	  */
	public void setDatePromised (Timestamp DatePromised)
	{
		set_Value (COLUMNNAME_DatePromised, DatePromised);
	}

	/** Get Date Promised.
		@return Date Order was promised
	  */
	public Timestamp getDatePromised () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DatePromised);
	}

	/** Set Date received.
		@param DateReceived 
		Date a product was received
	  */
	public void setDateReceived (Timestamp DateReceived)
	{
		set_Value (COLUMNNAME_DateReceived, DateReceived);
	}

	/** Get Date received.
		@return Date a product was received
	  */
	public Timestamp getDateReceived () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateReceived);
	}

	/** Set Inform Details.
		@param DescInform Inform Details	  */
	public void setDescInform (String DescInform)
	{
		set_Value (COLUMNNAME_DescInform, DescInform);
	}

	/** Get Inform Details.
		@return Inform Details	  */
	public String getDescInform () 
	{
		return (String)get_Value(COLUMNNAME_DescInform);
	}

	/** Set Problem Details.
		@param DescProblem Problem Details	  */
	public void setDescProblem (String DescProblem)
	{
		set_Value (COLUMNNAME_DescProblem, DescProblem);
	}

	/** Get Problem Details.
		@return Problem Details	  */
	public String getDescProblem () 
	{
		return (String)get_Value(COLUMNNAME_DescProblem);
	}

	/** Set Protection.
		@param DescProtect Protection	  */
	public void setDescProtect (String DescProtect)
	{
		set_Value (COLUMNNAME_DescProtect, DescProtect);
	}

	/** Get Protection.
		@return Protection	  */
	public String getDescProtect () 
	{
		return (String)get_Value(COLUMNNAME_DescProtect);
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

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getDocumentNo());
    }

	/** Set Expense Amount.
		@param ExpenseAmt 
		Amount for this expense
	  */
	public void setExpenseAmt (BigDecimal ExpenseAmt)
	{
		set_Value (COLUMNNAME_ExpenseAmt, ExpenseAmt);
	}

	/** Get Expense Amount.
		@return Amount for this expense
	  */
	public BigDecimal getExpenseAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ExpenseAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** InformStatus AD_Reference_ID=1000002 */
	public static final int INFORMSTATUS_AD_Reference_ID=1000002;
	/** Repair/Factory = 1 */
	public static final String INFORMSTATUS_RepairFactory = "1";
	/** Return to Customer = 2 */
	public static final String INFORMSTATUS_ReturnToCustomer = "2";
	/** Set Inform Status.
		@param InformStatus Inform Status	  */
	public void setInformStatus (String InformStatus)
	{

		set_Value (COLUMNNAME_InformStatus, InformStatus);
	}

	/** Get Inform Status.
		@return Inform Status	  */
	public String getInformStatus () 
	{
		return (String)get_Value(COLUMNNAME_InformStatus);
	}

	/** Set Change.
		@param IsChange Change	  */
	public void setIsChange (boolean IsChange)
	{
		set_Value (COLUMNNAME_IsChange, Boolean.valueOf(IsChange));
	}

	/** Get Change.
		@return Change	  */
	public boolean isChange () 
	{
		Object oo = get_Value(COLUMNNAME_IsChange);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set In Dispute.
		@param IsInDispute 
		Document is in dispute
	  */
	public void setIsInDispute (boolean IsInDispute)
	{
		set_Value (COLUMNNAME_IsInDispute, Boolean.valueOf(IsInDispute));
	}

	/** Get In Dispute.
		@return Document is in dispute
	  */
	public boolean isInDispute () 
	{
		Object oo = get_Value(COLUMNNAME_IsInDispute);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Pre-Change.
		@param IsPreChange 
		Changed by Sale
	  */
	public void setIsPreChange (boolean IsPreChange)
	{
		set_Value (COLUMNNAME_IsPreChange, Boolean.valueOf(IsPreChange));
	}

	/** Get Pre-Change.
		@return Changed by Sale
	  */
	public boolean isPreChange () 
	{
		Object oo = get_Value(COLUMNNAME_IsPreChange);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Warranty.
		@param IsWarranty Warranty	  */
	public void setIsWarranty (boolean IsWarranty)
	{
		set_Value (COLUMNNAME_IsWarranty, Boolean.valueOf(IsWarranty));
	}

	/** Get Warranty.
		@return Warranty	  */
	public boolean isWarranty () 
	{
		Object oo = get_Value(COLUMNNAME_IsWarranty);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Lot.
		@param Item_Lot Lot	  */
	public void setItem_Lot (String Item_Lot)
	{
		set_Value (COLUMNNAME_Item_Lot, Item_Lot);
	}

	/** Get Lot.
		@return Lot	  */
	public String getItem_Lot () 
	{
		return (String)get_Value(COLUMNNAME_Item_Lot);
	}

	/** Set Serial No..
		@param Item_Serialno Serial No.	  */
	public void setItem_Serialno (String Item_Serialno)
	{
		set_Value (COLUMNNAME_Item_Serialno, Item_Serialno);
	}

	/** Get Serial No..
		@return Serial No.	  */
	public String getItem_Serialno () 
	{
		return (String)get_Value(COLUMNNAME_Item_Serialno);
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

	/** Set Repair Item.
		@param QR_RepairItem_ID Repair Item	  */
	public void setQR_RepairItem_ID (int QR_RepairItem_ID)
	{
		if (QR_RepairItem_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_QR_RepairItem_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_QR_RepairItem_ID, Integer.valueOf(QR_RepairItem_ID));
	}

	/** Get Repair Item.
		@return Repair Item	  */
	public int getQR_RepairItem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QR_RepairItem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_QR_Return getQR_Return() throws RuntimeException
    {
		return (I_QR_Return)MTable.get(getCtx(), I_QR_Return.Table_Name)
			.getPO(getQR_Return_ID(), get_TrxName());	}

	/** Set Return No..
		@param QR_Return_ID 
		QR Return No.
	  */
	public void setQR_Return_ID (int QR_Return_ID)
	{
		if (QR_Return_ID < 1) 
			set_Value (COLUMNNAME_QR_Return_ID, null);
		else 
			set_Value (COLUMNNAME_QR_Return_ID, Integer.valueOf(QR_Return_ID));
	}

	/** Get Return No..
		@return QR Return No.
	  */
	public int getQR_Return_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QR_Return_ID);
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

	/** Set Reference No.
		@param ReferenceNo 
		Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo)
	{
		set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
	}

	/** Get Reference No.
		@return Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo () 
	{
		return (String)get_Value(COLUMNNAME_ReferenceNo);
	}

	/** RepairStatus AD_Reference_ID=1000001 */
	public static final int REPAIRSTATUS_AD_Reference_ID=1000001;
	/** กำลังตรวจสอบ = 1 */
	public static final String REPAIRSTATUS_กำลังตรวจสอบ = "1";
	/** จัดเก็บ (ซ่อมเสร็จแล้ว) = 2 */
	public static final String REPAIRSTATUS_จัดเก็บซ่อมเสร็จแล้ว = "2";
	/** ส่งคืน (ซ่อมเสร็จแล้ว-ส่งคืน CS) = 3 */
	public static final String REPAIRSTATUS_ส่งคืนซ่อมเสร็จแล้ว_ส่งคืนCS = "3";
	/** ทำลาย = 4 */
	public static final String REPAIRSTATUS_ทำลาย = "4";
	/** Set Repair Status.
		@param RepairStatus Repair Status	  */
	public void setRepairStatus (String RepairStatus)
	{

		set_Value (COLUMNNAME_RepairStatus, RepairStatus);
	}

	/** Get Repair Status.
		@return Repair Status	  */
	public String getRepairStatus () 
	{
		return (String)get_Value(COLUMNNAME_RepairStatus);
	}

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getSalesRep_ID(), get_TrxName());	}

	/** Set Sales Representative.
		@param SalesRep_ID 
		Sales Representative or Company Agent
	  */
	public void setSalesRep_ID (int SalesRep_ID)
	{
		if (SalesRep_ID < 1) 
			set_Value (COLUMNNAME_SalesRep_ID, null);
		else 
			set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
	}

	/** Get Sales Representative.
		@return Sales Representative or Company Agent
	  */
	public int getSalesRep_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
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
}