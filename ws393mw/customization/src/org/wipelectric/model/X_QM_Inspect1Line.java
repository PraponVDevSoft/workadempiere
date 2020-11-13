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
/** Generated Model - DO NOT CHANGE */
package org.wipelectric.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for QM_Inspect1Line
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_QM_Inspect1Line extends PO implements I_QM_Inspect1Line, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631111L;

    /** Standard Constructor */
    public X_QM_Inspect1Line (Properties ctx, int QM_Inspect1Line_ID, String trxName)
    {
      super (ctx, QM_Inspect1Line_ID, trxName);
      /** if (QM_Inspect1Line_ID == 0)
        {
			setLine (0);
// @SQL=SELECT COALESCE(MAX(Line),0)+1 AS DefaultValue FROM QM_Inspect1Line WHERE M_InOutLine_ID=@M_InOutLine_ID@
			setMeasureValue1 (Env.ZERO);
// 0
			setMeasureValue2 (Env.ZERO);
// 0
			setMeasureValue3 (Env.ZERO);
// 0
			setMeasureValue4 (Env.ZERO);
// 0
			setMeasureValue5 (Env.ZERO);
// 0
			setM_InOutLine_ID (0);
			setQM_Inspect1Line_ID (0);
        } */
    }

    /** Load Constructor */
    public X_QM_Inspect1Line (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_QM_Inspect1Line[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException
    {
		return (org.compiere.model.I_A_Asset)MTable.get(getCtx(), org.compiere.model.I_A_Asset.Table_Name)
			.getPO(getA_Asset_ID(), get_TrxName());	}

	/** Set Fixed Asset.
		@param A_Asset_ID 
		Fixed Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Fixed Asset.
		@return Fixed Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException
    {
		return (org.compiere.model.I_C_UOM)MTable.get(getCtx(), org.compiere.model.I_C_UOM.Table_Name)
			.getPO(getC_UOM_ID(), get_TrxName());	}

	/** Set UOM.
		@param C_UOM_ID 
		Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get UOM.
		@return Unit of Measure
	  */
	public int getC_UOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set IsPass.
		@param IsPass IsPass	  */
	public void setIsPass (boolean IsPass)
	{
		set_Value (COLUMNNAME_IsPass, Boolean.valueOf(IsPass));
	}

	/** Get IsPass.
		@return IsPass	  */
	public boolean isPass () 
	{
		Object oo = get_Value(COLUMNNAME_IsPass);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MeasureValue1.
		@param MeasureValue1 MeasureValue1	  */
	public void setMeasureValue1 (BigDecimal MeasureValue1)
	{
		set_Value (COLUMNNAME_MeasureValue1, MeasureValue1);
	}

	/** Get MeasureValue1.
		@return MeasureValue1	  */
	public BigDecimal getMeasureValue1 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureValue1);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MeasureValue2.
		@param MeasureValue2 MeasureValue2	  */
	public void setMeasureValue2 (BigDecimal MeasureValue2)
	{
		set_Value (COLUMNNAME_MeasureValue2, MeasureValue2);
	}

	/** Get MeasureValue2.
		@return MeasureValue2	  */
	public BigDecimal getMeasureValue2 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureValue2);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MeasureValue3.
		@param MeasureValue3 MeasureValue3	  */
	public void setMeasureValue3 (BigDecimal MeasureValue3)
	{
		set_Value (COLUMNNAME_MeasureValue3, MeasureValue3);
	}

	/** Get MeasureValue3.
		@return MeasureValue3	  */
	public BigDecimal getMeasureValue3 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureValue3);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MeasureValue4.
		@param MeasureValue4 MeasureValue4	  */
	public void setMeasureValue4 (BigDecimal MeasureValue4)
	{
		set_Value (COLUMNNAME_MeasureValue4, MeasureValue4);
	}

	/** Get MeasureValue4.
		@return MeasureValue4	  */
	public BigDecimal getMeasureValue4 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureValue4);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MeasureValue5.
		@param MeasureValue5 MeasureValue5	  */
	public void setMeasureValue5 (BigDecimal MeasureValue5)
	{
		set_Value (COLUMNNAME_MeasureValue5, MeasureValue5);
	}

	/** Get MeasureValue5.
		@return MeasureValue5	  */
	public BigDecimal getMeasureValue5 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureValue5);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_M_InOutLine getM_InOutLine() throws RuntimeException
    {
		return (org.compiere.model.I_M_InOutLine)MTable.get(getCtx(), org.compiere.model.I_M_InOutLine.Table_Name)
			.getPO(getM_InOutLine_ID(), get_TrxName());	}

	/** Set Shipment/Receipt Line.
		@param M_InOutLine_ID 
		Line on Shipment or Receipt document
	  */
	public void setM_InOutLine_ID (int M_InOutLine_ID)
	{
		if (M_InOutLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
	}

	/** Get Shipment/Receipt Line.
		@return Line on Shipment or Receipt document
	  */
	public int getM_InOutLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Inspect1Line.
		@param QM_Inspect1Line_ID Inspect1Line	  */
	public void setQM_Inspect1Line_ID (int QM_Inspect1Line_ID)
	{
		if (QM_Inspect1Line_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_QM_Inspect1Line_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_QM_Inspect1Line_ID, Integer.valueOf(QM_Inspect1Line_ID));
	}

	/** Get Inspect1Line.
		@return Inspect1Line	  */
	public int getQM_Inspect1Line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QM_Inspect1Line_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Inspection Item.
		@param QM_InspectItem_ID Inspection Item	  */
	public void setQM_InspectItem_ID (int QM_InspectItem_ID)
	{
		if (QM_InspectItem_ID < 1) 
			set_Value (COLUMNNAME_QM_InspectItem_ID, null);
		else 
			set_Value (COLUMNNAME_QM_InspectItem_ID, Integer.valueOf(QM_InspectItem_ID));
	}

	/** Get Inspection Item.
		@return Inspection Item	  */
	public int getQM_InspectItem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QM_InspectItem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SpecType1.
		@param SpecType1 SpecType1	  */
	public void setSpecType1 (String SpecType1)
	{
		set_Value (COLUMNNAME_SpecType1, SpecType1);
	}

	/** Get SpecType1.
		@return SpecType1	  */
	public String getSpecType1 () 
	{
		return (String)get_Value(COLUMNNAME_SpecType1);
	}

	/** Set SpecType2.
		@param SpecType2 SpecType2	  */
	public void setSpecType2 (String SpecType2)
	{
		set_Value (COLUMNNAME_SpecType2, SpecType2);
	}

	/** Get SpecType2.
		@return SpecType2	  */
	public String getSpecType2 () 
	{
		return (String)get_Value(COLUMNNAME_SpecType2);
	}

	/** Set SpecType3.
		@param SpecType3 SpecType3	  */
	public void setSpecType3 (String SpecType3)
	{
		set_Value (COLUMNNAME_SpecType3, SpecType3);
	}

	/** Get SpecType3.
		@return SpecType3	  */
	public String getSpecType3 () 
	{
		return (String)get_Value(COLUMNNAME_SpecType3);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}