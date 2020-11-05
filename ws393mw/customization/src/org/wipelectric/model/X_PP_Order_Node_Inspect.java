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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for PP_Order_Node_Inspect
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_PP_Order_Node_Inspect extends PO implements I_PP_Order_Node_Inspect, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25631105L;

    /** Standard Constructor */
    public X_PP_Order_Node_Inspect (Properties ctx, int PP_Order_Node_Inspect_ID, String trxName)
    {
      super (ctx, PP_Order_Node_Inspect_ID, trxName);
      /** if (PP_Order_Node_Inspect_ID == 0)
        {
			setIsValid (true);
// Y
			setPP_Order_ID (0);
			setPP_Order_Node_ID (0);
			setPP_Order_Node_Inspect_ID (0);
			setPP_Order_Workflow_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PP_Order_Node_Inspect (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PP_Order_Node_Inspect[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Valid.
		@param IsValid 
		Element is valid
	  */
	public void setIsValid (boolean IsValid)
	{
		set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
	}

	/** Get Valid.
		@return Element is valid
	  */
	public boolean isValid () 
	{
		Object oo = get_Value(COLUMNNAME_IsValid);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException
    {
		return (org.eevolution.model.I_PP_Order)MTable.get(getCtx(), org.eevolution.model.I_PP_Order.Table_Name)
			.getPO(getPP_Order_ID(), get_TrxName());	}

	/** Set Manufacturing Order.
		@param PP_Order_ID 
		Manufacturing Order
	  */
	public void setPP_Order_ID (int PP_Order_ID)
	{
		if (PP_Order_ID < 1) 
			set_Value (COLUMNNAME_PP_Order_ID, null);
		else 
			set_Value (COLUMNNAME_PP_Order_ID, Integer.valueOf(PP_Order_ID));
	}

	/** Get Manufacturing Order.
		@return Manufacturing Order
	  */
	public int getPP_Order_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Order_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_PP_Order_Node getPP_Order_Node() throws RuntimeException
    {
		return (org.eevolution.model.I_PP_Order_Node)MTable.get(getCtx(), org.eevolution.model.I_PP_Order_Node.Table_Name)
			.getPO(getPP_Order_Node_ID(), get_TrxName());	}

	/** Set Manufacturing Order Activity.
		@param PP_Order_Node_ID 
		Workflow Node (activity), step or process
	  */
	public void setPP_Order_Node_ID (int PP_Order_Node_ID)
	{
		if (PP_Order_Node_ID < 1) 
			set_Value (COLUMNNAME_PP_Order_Node_ID, null);
		else 
			set_Value (COLUMNNAME_PP_Order_Node_ID, Integer.valueOf(PP_Order_Node_ID));
	}

	/** Get Manufacturing Order Activity.
		@return Workflow Node (activity), step or process
	  */
	public int getPP_Order_Node_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Order_Node_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufacturing Order Activity Inspection.
		@param PP_Order_Node_Inspect_ID Manufacturing Order Activity Inspection	  */
	public void setPP_Order_Node_Inspect_ID (int PP_Order_Node_Inspect_ID)
	{
		if (PP_Order_Node_Inspect_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_PP_Order_Node_Inspect_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_PP_Order_Node_Inspect_ID, Integer.valueOf(PP_Order_Node_Inspect_ID));
	}

	/** Get Manufacturing Order Activity Inspection.
		@return Manufacturing Order Activity Inspection	  */
	public int getPP_Order_Node_Inspect_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Order_Node_Inspect_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_PP_Order_Workflow getPP_Order_Workflow() throws RuntimeException
    {
		return (org.eevolution.model.I_PP_Order_Workflow)MTable.get(getCtx(), org.eevolution.model.I_PP_Order_Workflow.Table_Name)
			.getPO(getPP_Order_Workflow_ID(), get_TrxName());	}

	/** Set Manufacturing Order Workflow.
		@param PP_Order_Workflow_ID Manufacturing Order Workflow	  */
	public void setPP_Order_Workflow_ID (int PP_Order_Workflow_ID)
	{
		if (PP_Order_Workflow_ID < 1) 
			set_Value (COLUMNNAME_PP_Order_Workflow_ID, null);
		else 
			set_Value (COLUMNNAME_PP_Order_Workflow_ID, Integer.valueOf(PP_Order_Workflow_ID));
	}

	/** Get Manufacturing Order Workflow.
		@return Manufacturing Order Workflow	  */
	public int getPP_Order_Workflow_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PP_Order_Workflow_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_QM_NGRemark getQM_NGRemark() throws RuntimeException
    {
		return (I_QM_NGRemark)MTable.get(getCtx(), I_QM_NGRemark.Table_Name)
			.getPO(getQM_NGRemark_ID(), get_TrxName());	}

	/** Set NG Remark.
		@param QM_NGRemark_ID NG Remark	  */
	public void setQM_NGRemark_ID (int QM_NGRemark_ID)
	{
		if (QM_NGRemark_ID < 1) 
			set_Value (COLUMNNAME_QM_NGRemark_ID, null);
		else 
			set_Value (COLUMNNAME_QM_NGRemark_ID, Integer.valueOf(QM_NGRemark_ID));
	}

	/** Get NG Remark.
		@return NG Remark	  */
	public int getQM_NGRemark_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QM_NGRemark_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sequence.
		@param SeqNo 
		Method of ordering records; lowest number comes first
	  */
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
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