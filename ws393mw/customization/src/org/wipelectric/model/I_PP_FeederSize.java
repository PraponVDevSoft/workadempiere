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

/** Generated Interface for PP_FeederSize
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_PP_FeederSize 
{

    /** TableName=PP_FeederSize */
    public static final String Table_Name = "PP_FeederSize";

    /** AD_Table_ID=1000055 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name PP_FeederSize_ID */
    public static final String COLUMNNAME_PP_FeederSize_ID = "PP_FeederSize_ID";

	/** Set Feeder Size	  */
	public void setPP_FeederSize_ID (int PP_FeederSize_ID);

	/** Get Feeder Size	  */
	public int getPP_FeederSize_ID();

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
