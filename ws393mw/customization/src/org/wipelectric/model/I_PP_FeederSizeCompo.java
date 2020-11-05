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
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for PP_FeederSizeCompo
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_PP_FeederSizeCompo 
{

    /** TableName=PP_FeederSizeCompo */
    public static final String Table_Name = "PP_FeederSizeCompo";

    /** AD_Table_ID=1000056 */
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

    /** Column name PP_FeederSizeCompo_ID */
    public static final String COLUMNNAME_PP_FeederSizeCompo_ID = "PP_FeederSizeCompo_ID";

	/** Set Component Size	  */
	public void setPP_FeederSizeCompo_ID (int PP_FeederSizeCompo_ID);

	/** Get Component Size	  */
	public int getPP_FeederSizeCompo_ID();

    /** Column name PP_FeederSize_ID */
    public static final String COLUMNNAME_PP_FeederSize_ID = "PP_FeederSize_ID";

	/** Set Feeder Size	  */
	public void setPP_FeederSize_ID (int PP_FeederSize_ID);

	/** Get Feeder Size	  */
	public int getPP_FeederSize_ID();

	public I_PP_FeederSize getPP_FeederSize() throws RuntimeException;

    /** Column name Size */
    public static final String COLUMNNAME_Size = "Size";

	/** Set Size.
	  * Size
	  */
	public void setSize (String Size);

	/** Get Size.
	  * Size
	  */
	public String getSize();
}
