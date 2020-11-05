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

/** Generated Interface for QM_Inspect1Line
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_QM_Inspect1Line 
{

    /** TableName=QM_Inspect1Line */
    public static final String Table_Name = "QM_Inspect1Line";

    /** AD_Table_ID=1000028 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name A_Asset_ID */
    public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";

	/** Set Fixed Asset.
	  * Fixed Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID);

	/** Get Fixed Asset.
	  * Fixed Asset used internally or by customers
	  */
	public int getA_Asset_ID();

	public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException;

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

    /** Column name C_UOM_ID */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/** Set UOM.
	  * Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID);

	/** Get UOM.
	  * Unit of Measure
	  */
	public int getC_UOM_ID();

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

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

    /** Column name IsPass */
    public static final String COLUMNNAME_IsPass = "IsPass";

	/** Set IsPass	  */
	public void setIsPass (boolean IsPass);

	/** Get IsPass	  */
	public boolean isPass();

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

    /** Column name MeasureValue1 */
    public static final String COLUMNNAME_MeasureValue1 = "MeasureValue1";

	/** Set MeasureValue1	  */
	public void setMeasureValue1 (BigDecimal MeasureValue1);

	/** Get MeasureValue1	  */
	public BigDecimal getMeasureValue1();

    /** Column name MeasureValue2 */
    public static final String COLUMNNAME_MeasureValue2 = "MeasureValue2";

	/** Set MeasureValue2	  */
	public void setMeasureValue2 (BigDecimal MeasureValue2);

	/** Get MeasureValue2	  */
	public BigDecimal getMeasureValue2();

    /** Column name MeasureValue3 */
    public static final String COLUMNNAME_MeasureValue3 = "MeasureValue3";

	/** Set MeasureValue3	  */
	public void setMeasureValue3 (BigDecimal MeasureValue3);

	/** Get MeasureValue3	  */
	public BigDecimal getMeasureValue3();

    /** Column name MeasureValue4 */
    public static final String COLUMNNAME_MeasureValue4 = "MeasureValue4";

	/** Set MeasureValue4	  */
	public void setMeasureValue4 (BigDecimal MeasureValue4);

	/** Get MeasureValue4	  */
	public BigDecimal getMeasureValue4();

    /** Column name MeasureValue5 */
    public static final String COLUMNNAME_MeasureValue5 = "MeasureValue5";

	/** Set MeasureValue5	  */
	public void setMeasureValue5 (BigDecimal MeasureValue5);

	/** Get MeasureValue5	  */
	public BigDecimal getMeasureValue5();

    /** Column name M_InOutLine_ID */
    public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";

	/** Set Shipment/Receipt Line.
	  * Line on Shipment or Receipt document
	  */
	public void setM_InOutLine_ID (int M_InOutLine_ID);

	/** Get Shipment/Receipt Line.
	  * Line on Shipment or Receipt document
	  */
	public int getM_InOutLine_ID();

	public org.compiere.model.I_M_InOutLine getM_InOutLine() throws RuntimeException;

    /** Column name QM_Inspect1Line_ID */
    public static final String COLUMNNAME_QM_Inspect1Line_ID = "QM_Inspect1Line_ID";

	/** Set Inspect1Line	  */
	public void setQM_Inspect1Line_ID (int QM_Inspect1Line_ID);

	/** Get Inspect1Line	  */
	public int getQM_Inspect1Line_ID();

    /** Column name QM_InspectItem_ID */
    public static final String COLUMNNAME_QM_InspectItem_ID = "QM_InspectItem_ID";

	/** Set Inspection Item	  */
	public void setQM_InspectItem_ID (int QM_InspectItem_ID);

	/** Get Inspection Item	  */
	public int getQM_InspectItem_ID();

    /** Column name SpecType1 */
    public static final String COLUMNNAME_SpecType1 = "SpecType1";

	/** Set SpecType1	  */
	public void setSpecType1 (String SpecType1);

	/** Get SpecType1	  */
	public String getSpecType1();

    /** Column name SpecType2 */
    public static final String COLUMNNAME_SpecType2 = "SpecType2";

	/** Set SpecType2	  */
	public void setSpecType2 (String SpecType2);

	/** Get SpecType2	  */
	public String getSpecType2();

    /** Column name SpecType3 */
    public static final String COLUMNNAME_SpecType3 = "SpecType3";

	/** Set SpecType3	  */
	public void setSpecType3 (String SpecType3);

	/** Get SpecType3	  */
	public String getSpecType3();

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
