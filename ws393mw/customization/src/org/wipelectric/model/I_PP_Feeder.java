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

/** Generated Interface for PP_Feeder
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_PP_Feeder 
{

    /** TableName=PP_Feeder */
    public static final String Table_Name = "PP_Feeder";

    /** AD_Table_ID=1000053 */
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

    /** Column name FeederNo */
    public static final String COLUMNNAME_FeederNo = "FeederNo";

	/** Set Feeder No	  */
	public void setFeederNo (String FeederNo);

	/** Get Feeder No	  */
	public String getFeederNo();

    /** Column name PP_Feeder_ID */
    public static final String COLUMNNAME_PP_Feeder_ID = "PP_Feeder_ID";

	/** Set Feeder	  */
	public void setPP_Feeder_ID (int PP_Feeder_ID);

	/** Get Feeder	  */
	public int getPP_Feeder_ID();

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
