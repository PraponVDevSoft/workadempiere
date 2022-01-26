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

/** Generated Interface for PP_MatControl_Checking
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_PP_MatControl_Checking 
{

    /** TableName=PP_MatControl_Checking */
    public static final String Table_Name = "PP_MatControl_Checking";

    /** AD_Table_ID=1000047 */
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

    /** Column name BOM_Assembly */
    public static final String COLUMNNAME_BOM_Assembly = "BOM_Assembly";

	/** Set BOM Assembly	  */
	public void setBOM_Assembly (boolean BOM_Assembly);

	/** Get BOM Assembly	  */
	public boolean isBOM_Assembly();

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

    /** Column name PP_MatControl_Checking_ID */
    public static final String COLUMNNAME_PP_MatControl_Checking_ID = "PP_MatControl_Checking_ID";

	/** Set PP_MatControl_Checking	  */
	public void setPP_MatControl_Checking_ID (int PP_MatControl_Checking_ID);

	/** Get PP_MatControl_Checking	  */
	public int getPP_MatControl_Checking_ID();

    /** Column name PP_MatControl_ID */
    public static final String COLUMNNAME_PP_MatControl_ID = "PP_MatControl_ID";

	/** Set PP_MatControl	  */
	public void setPP_MatControl_ID (int PP_MatControl_ID);

	/** Get PP_MatControl	  */
	public int getPP_MatControl_ID();

	public I_PP_MatControl getPP_MatControl() throws RuntimeException;

    /** Column name QtyCount1 */
    public static final String COLUMNNAME_QtyCount1 = "QtyCount1";

	/** Set Checking-1.
	  * R/M Checking-1
	  */
	public void setQtyCount1 (BigDecimal QtyCount1);

	/** Get Checking-1.
	  * R/M Checking-1
	  */
	public BigDecimal getQtyCount1();

    /** Column name QtyCount2 */
    public static final String COLUMNNAME_QtyCount2 = "QtyCount2";

	/** Set Checking-2.
	  * R/M Checking-2
	  */
	public void setQtyCount2 (BigDecimal QtyCount2);

	/** Get Checking-2.
	  * R/M Checking-2
	  */
	public BigDecimal getQtyCount2();

    /** Column name QtyDelivered */
    public static final String COLUMNNAME_QtyDelivered = "QtyDelivered";

	/** Set Delivered Quantity.
	  * Delivered Quantity
	  */
	public void setQtyDelivered (BigDecimal QtyDelivered);

	/** Get Delivered Quantity.
	  * Delivered Quantity
	  */
	public BigDecimal getQtyDelivered();

    /** Column name QtyRequired */
    public static final String COLUMNNAME_QtyRequired = "QtyRequired";

	/** Set Qty Required	  */
	public void setQtyRequired (BigDecimal QtyRequired);

	/** Get Qty Required	  */
	public BigDecimal getQtyRequired();

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
