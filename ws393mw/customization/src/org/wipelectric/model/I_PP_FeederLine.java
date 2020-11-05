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

/** Generated Interface for PP_FeederLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_PP_FeederLine 
{

    /** TableName=PP_FeederLine */
    public static final String Table_Name = "PP_FeederLine";

    /** AD_Table_ID=1000054 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name PP_Feeder_ID */
    public static final String COLUMNNAME_PP_Feeder_ID = "PP_Feeder_ID";

	/** Set Feeder	  */
	public void setPP_Feeder_ID (int PP_Feeder_ID);

	/** Get Feeder	  */
	public int getPP_Feeder_ID();

	public I_PP_Feeder getPP_Feeder() throws RuntimeException;

    /** Column name PP_FeederLine_ID */
    public static final String COLUMNNAME_PP_FeederLine_ID = "PP_FeederLine_ID";

	/** Set Feeder Line	  */
	public void setPP_FeederLine_ID (int PP_FeederLine_ID);

	/** Get Feeder Line	  */
	public int getPP_FeederLine_ID();
}
