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

/** Generated Interface for T_Partno
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3
 */
public interface I_T_Partno 
{

    /** TableName=T_Partno */
    public static final String Table_Name = "T_Partno";

    /** AD_Table_ID=1000065 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name ma_code */
    public static final String COLUMNNAME_ma_code = "ma_code";

	/** Set ma_code	  */
	public void setma_code (String ma_code);

	/** Get ma_code	  */
	public String getma_code();

    /** Column name mb_name */
    public static final String COLUMNNAME_mb_name = "mb_name";

	/** Set mb_name	  */
	public void setmb_name (String mb_name);

	/** Get mb_name	  */
	public String getmb_name();

    /** Column name mb_seq */
    public static final String COLUMNNAME_mb_seq = "mb_seq";

	/** Set mb_seq	  */
	public void setmb_seq (int mb_seq);

	/** Get mb_seq	  */
	public int getmb_seq();

    /** Column name part_no */
    public static final String COLUMNNAME_part_no = "part_no";

	/** Set part_no	  */
	public void setpart_no (String part_no);

	/** Get part_no	  */
	public String getpart_no();

    /** Column name T_Partno_ID */
    public static final String COLUMNNAME_T_Partno_ID = "T_Partno_ID";

	/** Set T_Partno	  */
	public void setT_Partno_ID (int T_Partno_ID);

	/** Get T_Partno	  */
	public int getT_Partno_ID();
}
