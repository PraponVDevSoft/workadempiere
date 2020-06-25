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
package org.wipelectric.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for PP_FIRSLine
 *  @author Adempiere (generated) 
 *  @version Release 3.7.1RC
 */
public interface I_PP_FIRSLine 
{

    /** TableName=PP_FIRSLine */
    public static final String Table_Name = "PP_FIRSLine";

    /** AD_Table_ID=1000058 */
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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

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

    /** Column name IsCheck1 */
    public static final String COLUMNNAME_IsCheck1 = "IsCheck1";

	/** Set Check1	  */
	public void setIsCheck1 (boolean IsCheck1);

	/** Get Check1	  */
	public boolean isCheck1();

    /** Column name IsCheck2 */
    public static final String COLUMNNAME_IsCheck2 = "IsCheck2";

	/** Set Check2	  */
	public void setIsCheck2 (boolean IsCheck2);

	/** Get Check2	  */
	public boolean isCheck2();

    /** Column name IsCheck3 */
    public static final String COLUMNNAME_IsCheck3 = "IsCheck3";

	/** Set Check3	  */
	public void setIsCheck3 (boolean IsCheck3);

	/** Get Check3	  */
	public boolean isCheck3();

    /** Column name IsCheck4 */
    public static final String COLUMNNAME_IsCheck4 = "IsCheck4";

	/** Set Check4	  */
	public void setIsCheck4 (boolean IsCheck4);

	/** Get Check4	  */
	public boolean isCheck4();

    /** Column name IsCheck5 */
    public static final String COLUMNNAME_IsCheck5 = "IsCheck5";

	/** Set Check5	  */
	public void setIsCheck5 (boolean IsCheck5);

	/** Get Check5	  */
	public boolean isCheck5();

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

    /** Column name PP_Feeder_ID */
    public static final String COLUMNNAME_PP_Feeder_ID = "PP_Feeder_ID";

	/** Set Feeder	  */
	public void setPP_Feeder_ID (int PP_Feeder_ID);

	/** Get Feeder	  */
	public int getPP_Feeder_ID();

	public I_PP_Feeder getPP_Feeder() throws RuntimeException;

    /** Column name PP_FeederSizeCompo_ID */
    public static final String COLUMNNAME_PP_FeederSizeCompo_ID = "PP_FeederSizeCompo_ID";

	/** Set Component Size	  */
	public void setPP_FeederSizeCompo_ID (int PP_FeederSizeCompo_ID);

	/** Get Component Size	  */
	public int getPP_FeederSizeCompo_ID();

	public I_PP_FeederSizeCompo getPP_FeederSizeCompo() throws RuntimeException;

    /** Column name PP_FeederSize_ID */
    public static final String COLUMNNAME_PP_FeederSize_ID = "PP_FeederSize_ID";

	/** Set Feeder Size	  */
	public void setPP_FeederSize_ID (int PP_FeederSize_ID);

	/** Get Feeder Size	  */
	public int getPP_FeederSize_ID();

	public I_PP_FeederSize getPP_FeederSize() throws RuntimeException;

    /** Column name PP_FIRS_ID */
    public static final String COLUMNNAME_PP_FIRS_ID = "PP_FIRS_ID";

	/** Set FIRS.
	  * Feeder Inspect Record Sheet
	  */
	public void setPP_FIRS_ID (int PP_FIRS_ID);

	/** Get FIRS.
	  * Feeder Inspect Record Sheet
	  */
	public int getPP_FIRS_ID();

	public I_PP_FIRS getPP_FIRS() throws RuntimeException;

    /** Column name PP_FIRSLine_ID */
    public static final String COLUMNNAME_PP_FIRSLine_ID = "PP_FIRSLine_ID";

	/** Set FIRS Line.
	  * Feeder Inspect Record Sheet Line
	  */
	public void setPP_FIRSLine_ID (int PP_FIRSLine_ID);

	/** Get FIRS Line.
	  * Feeder Inspect Record Sheet Line
	  */
	public int getPP_FIRSLine_ID();

    /** Column name PP_Order_BOMLine_ID */
    public static final String COLUMNNAME_PP_Order_BOMLine_ID = "PP_Order_BOMLine_ID";

	/** Set Manufacturing Order BOM Line	  */
	public void setPP_Order_BOMLine_ID (int PP_Order_BOMLine_ID);

	/** Get Manufacturing Order BOM Line	  */
	public int getPP_Order_BOMLine_ID();

	public org.eevolution.model.I_PP_Order_BOMLine getPP_Order_BOMLine() throws RuntimeException;

    /** Column name ScanText1 */
    public static final String COLUMNNAME_ScanText1 = "ScanText1";

	/** Set Text1	  */
	public void setScanText1 (String ScanText1);

	/** Get Text1	  */
	public String getScanText1();

    /** Column name ScanText2 */
    public static final String COLUMNNAME_ScanText2 = "ScanText2";

	/** Set Text2	  */
	public void setScanText2 (String ScanText2);

	/** Get Text2	  */
	public String getScanText2();

    /** Column name ScanText3 */
    public static final String COLUMNNAME_ScanText3 = "ScanText3";

	/** Set Text3	  */
	public void setScanText3 (String ScanText3);

	/** Get Text3	  */
	public String getScanText3();

    /** Column name ScanText4 */
    public static final String COLUMNNAME_ScanText4 = "ScanText4";

	/** Set Text4	  */
	public void setScanText4 (String ScanText4);

	/** Get Text4	  */
	public String getScanText4();

    /** Column name ScanText5 */
    public static final String COLUMNNAME_ScanText5 = "ScanText5";

	/** Set Text5	  */
	public void setScanText5 (String ScanText5);

	/** Get Text5	  */
	public String getScanText5();

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
}
