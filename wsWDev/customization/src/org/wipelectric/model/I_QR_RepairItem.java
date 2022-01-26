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
package org.wipelectric.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for QR_RepairItem
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_QR_RepairItem 
{

    /** TableName=QR_RepairItem */
    public static final String Table_Name = "QR_RepairItem";

    /** AD_Table_ID=1000003 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name CorrectBy */
    public static final String COLUMNNAME_CorrectBy = "CorrectBy";

	/** Set Correct By	  */
	public void setCorrectBy (int CorrectBy);

	/** Get Correct By	  */
	public int getCorrectBy();

	public org.compiere.model.I_AD_User getCorrec() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateCorrect */
    public static final String COLUMNNAME_DateCorrect = "DateCorrect";

	/** Set Date Correct	  */
	public void setDateCorrect (Timestamp DateCorrect);

	/** Get Date Correct	  */
	public Timestamp getDateCorrect();

    /** Column name DateFinish */
    public static final String COLUMNNAME_DateFinish = "DateFinish";

	/** Set Finish Date.
	  * Finish or (planned) completion date
	  */
	public void setDateFinish (Timestamp DateFinish);

	/** Get Finish Date.
	  * Finish or (planned) completion date
	  */
	public Timestamp getDateFinish();

    /** Column name DateInformed */
    public static final String COLUMNNAME_DateInformed = "DateInformed";

	/** Set Date Informed	  */
	public void setDateInformed (Timestamp DateInformed);

	/** Get Date Informed	  */
	public Timestamp getDateInformed();

    /** Column name DateProduce */
    public static final String COLUMNNAME_DateProduce = "DateProduce";

	/** Set Date Produce	  */
	public void setDateProduce (Timestamp DateProduce);

	/** Get Date Produce	  */
	public Timestamp getDateProduce();

    /** Column name DatePromised */
    public static final String COLUMNNAME_DatePromised = "DatePromised";

	/** Set Date Promised.
	  * Date Order was promised
	  */
	public void setDatePromised (Timestamp DatePromised);

	/** Get Date Promised.
	  * Date Order was promised
	  */
	public Timestamp getDatePromised();

    /** Column name DateReceived */
    public static final String COLUMNNAME_DateReceived = "DateReceived";

	/** Set Date received.
	  * Date a product was received
	  */
	public void setDateReceived (Timestamp DateReceived);

	/** Get Date received.
	  * Date a product was received
	  */
	public Timestamp getDateReceived();

    /** Column name DescInform */
    public static final String COLUMNNAME_DescInform = "DescInform";

	/** Set Inform Details	  */
	public void setDescInform (String DescInform);

	/** Get Inform Details	  */
	public String getDescInform();

    /** Column name DescProblem */
    public static final String COLUMNNAME_DescProblem = "DescProblem";

	/** Set Problem Details	  */
	public void setDescProblem (String DescProblem);

	/** Get Problem Details	  */
	public String getDescProblem();

    /** Column name DescProtect */
    public static final String COLUMNNAME_DescProtect = "DescProtect";

	/** Set Protection	  */
	public void setDescProtect (String DescProtect);

	/** Get Protection	  */
	public String getDescProtect();

    /** Column name DescRepair */
    public static final String COLUMNNAME_DescRepair = "DescRepair";

	/** Set Repair Details	  */
	public void setDescRepair (String DescRepair);

	/** Get Repair Details	  */
	public String getDescRepair();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name ExpenseAmt */
    public static final String COLUMNNAME_ExpenseAmt = "ExpenseAmt";

	/** Set Expense Amount.
	  * Amount for this expense
	  */
	public void setExpenseAmt (BigDecimal ExpenseAmt);

	/** Get Expense Amount.
	  * Amount for this expense
	  */
	public BigDecimal getExpenseAmt();

    /** Column name InformStatus */
    public static final String COLUMNNAME_InformStatus = "InformStatus";

	/** Set Inform Status	  */
	public void setInformStatus (String InformStatus);

	/** Get Inform Status	  */
	public String getInformStatus();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsChange */
    public static final String COLUMNNAME_IsChange = "IsChange";

	/** Set Change	  */
	public void setIsChange (boolean IsChange);

	/** Get Change	  */
	public boolean isChange();

    /** Column name IsInDispute */
    public static final String COLUMNNAME_IsInDispute = "IsInDispute";

	/** Set In Dispute.
	  * Document is in dispute
	  */
	public void setIsInDispute (boolean IsInDispute);

	/** Get In Dispute.
	  * Document is in dispute
	  */
	public boolean isInDispute();

    /** Column name IsPreChange */
    public static final String COLUMNNAME_IsPreChange = "IsPreChange";

	/** Set Pre-Change.
	  * Changed by Sale
	  */
	public void setIsPreChange (boolean IsPreChange);

	/** Get Pre-Change.
	  * Changed by Sale
	  */
	public boolean isPreChange();

    /** Column name IsWarranty */
    public static final String COLUMNNAME_IsWarranty = "IsWarranty";

	/** Set Warranty	  */
	public void setIsWarranty (boolean IsWarranty);

	/** Get Warranty	  */
	public boolean isWarranty();

    /** Column name Item_Lot */
    public static final String COLUMNNAME_Item_Lot = "Item_Lot";

	/** Set Lot	  */
	public void setItem_Lot (String Item_Lot);

	/** Get Lot	  */
	public String getItem_Lot();

    /** Column name Item_Serialno */
    public static final String COLUMNNAME_Item_Serialno = "Item_Serialno";

	/** Set Serial No.	  */
	public void setItem_Serialno (String Item_Serialno);

	/** Get Serial No.	  */
	public String getItem_Serialno();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name QR_Cause_ID */
    public static final String COLUMNNAME_QR_Cause_ID = "QR_Cause_ID";

	/** Set Cause.
	  * Root of problem
	  */
	public void setQR_Cause_ID (int QR_Cause_ID);

	/** Get Cause.
	  * Root of problem
	  */
	public int getQR_Cause_ID();

	public I_QR_Cause getQR_Cause() throws RuntimeException;

    /** Column name QR_Repair_ID */
    public static final String COLUMNNAME_QR_Repair_ID = "QR_Repair_ID";

	/** Set Repair	  */
	public void setQR_Repair_ID (int QR_Repair_ID);

	/** Get Repair	  */
	public int getQR_Repair_ID();

	public I_QR_Repair getQR_Repair() throws RuntimeException;

    /** Column name QR_RepairItem_ID */
    public static final String COLUMNNAME_QR_RepairItem_ID = "QR_RepairItem_ID";

	/** Set Repair Item	  */
	public void setQR_RepairItem_ID (int QR_RepairItem_ID);

	/** Get Repair Item	  */
	public int getQR_RepairItem_ID();

    /** Column name QR_Return_ID */
    public static final String COLUMNNAME_QR_Return_ID = "QR_Return_ID";

	/** Set Return No..
	  * QR Return No.
	  */
	public void setQR_Return_ID (int QR_Return_ID);

	/** Get Return No..
	  * QR Return No.
	  */
	public int getQR_Return_ID();

	public I_QR_Return getQR_Return() throws RuntimeException;

    /** Column name QR_Symptom_ID */
    public static final String COLUMNNAME_QR_Symptom_ID = "QR_Symptom_ID";

	/** Set Symptom.
	  * Problem or Symptom
	  */
	public void setQR_Symptom_ID (int QR_Symptom_ID);

	/** Get Symptom.
	  * Problem or Symptom
	  */
	public int getQR_Symptom_ID();

	public I_QR_Symptom getQR_Symptom() throws RuntimeException;

    /** Column name ReferenceNo */
    public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

	/** Set Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo);

	/** Get Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo();

    /** Column name RepairStatus */
    public static final String COLUMNNAME_RepairStatus = "RepairStatus";

	/** Set Repair Status	  */
	public void setRepairStatus (String RepairStatus);

	/** Get Repair Status	  */
	public String getRepairStatus();

    /** Column name SalesRep_ID */
    public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

	/** Set Sales Representative.
	  * Sales Representative or Company Agent
	  */
	public void setSalesRep_ID (int SalesRep_ID);

	/** Get Sales Representative.
	  * Sales Representative or Company Agent
	  */
	public int getSalesRep_ID();

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException;

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();
}
