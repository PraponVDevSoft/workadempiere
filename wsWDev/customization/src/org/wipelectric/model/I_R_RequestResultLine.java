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

/** Generated Interface for R_RequestResultLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_R_RequestResultLine 
{

    /** TableName=R_RequestResultLine */
    public static final String Table_Name = "R_RequestResultLine";

    /** AD_Table_ID=1000052 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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

    /** Column name DateStart */
    public static final String COLUMNNAME_DateStart = "DateStart";

	/** Set Date Start.
	  * Date Start for this Order
	  */
	public void setDateStart (Timestamp DateStart);

	/** Get Date Start.
	  * Date Start for this Order
	  */
	public Timestamp getDateStart();

    /** Column name DescCause */
    public static final String COLUMNNAME_DescCause = "DescCause";

	/** Set Cause Details	  */
	public void setDescCause (String DescCause);

	/** Get Cause Details	  */
	public String getDescCause();

    /** Column name DescRepair */
    public static final String COLUMNNAME_DescRepair = "DescRepair";

	/** Set Repair Details	  */
	public void setDescRepair (String DescRepair);

	/** Get Repair Details	  */
	public String getDescRepair();

    /** Column name DescSymptom */
    public static final String COLUMNNAME_DescSymptom = "DescSymptom";

	/** Set Symptom Details	  */
	public void setDescSymptom (String DescSymptom);

	/** Get Symptom Details	  */
	public String getDescSymptom();

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

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name Lot */
    public static final String COLUMNNAME_Lot = "Lot";

	/** Set Lot No.
	  * Lot number (alphanumeric)
	  */
	public void setLot (String Lot);

	/** Get Lot No.
	  * Lot number (alphanumeric)
	  */
	public String getLot();

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

    /** Column name Result */
    public static final String COLUMNNAME_Result = "Result";

	/** Set Result.
	  * Result of the action taken
	  */
	public void setResult (String Result);

	/** Get Result.
	  * Result of the action taken
	  */
	public String getResult();

    /** Column name R_Request_ID */
    public static final String COLUMNNAME_R_Request_ID = "R_Request_ID";

	/** Set Request.
	  * Request from a Business Partner or Prospect
	  */
	public void setR_Request_ID (int R_Request_ID);

	/** Get Request.
	  * Request from a Business Partner or Prospect
	  */
	public int getR_Request_ID();

	public org.compiere.model.I_R_Request getR_Request() throws RuntimeException;

    /** Column name R_RequestResultLine_ID */
    public static final String COLUMNNAME_R_RequestResultLine_ID = "R_RequestResultLine_ID";

	/** Set Request Result Line.
	  * Request Result Line
	  */
	public void setR_RequestResultLine_ID (int R_RequestResultLine_ID);

	/** Get Request Result Line.
	  * Request Result Line
	  */
	public int getR_RequestResultLine_ID();

    /** Column name SerNo */
    public static final String COLUMNNAME_SerNo = "SerNo";

	/** Set Serial No.
	  * Product Serial Number 
	  */
	public void setSerNo (String SerNo);

	/** Get Serial No.
	  * Product Serial Number 
	  */
	public String getSerNo();

    /** Column name TextMsg */
    public static final String COLUMNNAME_TextMsg = "TextMsg";

	/** Set Text Message.
	  * Text Message
	  */
	public void setTextMsg (String TextMsg);

	/** Get Text Message.
	  * Text Message
	  */
	public String getTextMsg();

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
