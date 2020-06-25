package org.wipelectric.model;

//import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.Env;
//import org.compiere.model.I_M_InventoryLine;
//import org.compiere.model.MInventoryLine;
//import org.compiere.model.MProduct;
//import org.compiere.model.MTable;
//import org.compiere.model.Query;
import org.compiere.util.DB;
//import org.eevolution.model.MPPOrder;
//import org.eevolution.model.MPPOrderBOMLine;
//import org.zkoss.zhtml.Big;
import org.adempiere.model.GridTabWrapper;

public class CalloutFIRS extends CalloutEngine {
	
	public String scanTextChanged (	Properties ctx, int WindowNo, 
										GridTab mTab, 
										GridField mField, 
										Object value) {
		if (isCalloutActive() || value == null)
			return "";

		I_PP_FIRSLine line = GridTabWrapper.create(mTab, I_PP_FIRSLine.class);

		int p_pp_order_id = Env.getContextAsInt(ctx, WindowNo, "PP_Order_ID");		
		int p_pp_firsline_id = line.getPP_FIRSLine_ID();
		int p_m_product_id = 0;
//		int i = 0;
//		int p_pp_feedersize_id = line.getPP_FeederSize_ID();  
		
//		String scantext1 = line.getScanText1();
		String scantext = (String)value;
		String colname 	= (String)mField.getColumnName();
		String col		= colname.substring(colname.length()-1);
		
		StringBuilder msg1 = new StringBuilder();
		StringBuilder msg_no = new StringBuilder();
		msg_no.append("ข้อมูล  ("+scantext+") ไม่ตรงกับรายการที่ 1, อ่านค่าจาก "+colname+"\n");
		msg_no.append("การตรวจสอบเป็น เท็จ >'N'");

		if (colname.equalsIgnoreCase("scantext1")) {
			/* 1.search M_Product_ID from text */
			String sql= "SELECT M_Product_ID INTO i FROM M_Product WHERE UPPER(TRIM(value)) = "+ scantext.toUpperCase();
	    	System.out.println(sql+"\n"+"===");
			p_m_product_id = DB.getSQLValue("i", sql);
			if (p_m_product_id<=0){
				msg1.append("รหัสวัตถุดิบ/ส่วนประกอบนี้ : ไม่ถูกต้อง\n");				//mTab.setValue("IsCheck1", "N");
				line.setIsCheck1(false);
			}else{ /* ค้นหาเจอ  */				
				/* 2.search in pp_feedersizecompo */
				sql = "SELECT COUNT(*) AS i FROM pp_feedersizecompo WHERE pp_feedersize_id=1000001 and m_product_id = "+p_m_product_id;			
				System.out.println(sql+"\n"+"===");
				if (DB.getSQLValue("i", sql)<=0){
					msg1.append("รหัสวัตถุดิบ/ส่วนประกอบนี้ ไม่มีใน Feeder Size Component\n");			
					line.setIsCheck1(false);
				}else{ /* ค้นหาเจอ  */			
					/* 2.search สินค้าในรายการของใบสั่งผลิด */																				  
					sql = "SELECT pp_order_bomline_id into i FROM pp_order_bomline"+ 
						  " WHERE pp_order_id = p_pp_order_id AND m_product_id = "+p_m_product_id;
					if (DB.getSQLValue("i", sql)<=0){
						msg1.append("รหัสวัตถุดิบ/ส่วนประกอบนี้ ไม่มีใน BOM ของใบสั่งผลิต");			
						line.setIsCheck1(false);			
					}else{
						msg1.append("รหัสวัตถุดิบ/ส่วนประกอบนี้ ถูกต้อง");			
						line.setIsCheck1(true);								
					}
				}
			}
			JOptionPane.showMessageDialog(null, msg1);
/*			
			String sql= "SELECT LTH_firsline_barcodecheck('" + scantext + "', " +
					p_pp_order_id + ", " +
					p_pp_firsline_id + ", '" +
					col + "') as i";
*/			
			
			
///			System.out.println(" PP_Order_ID "+p_pp_order_id+", FIRS Line "+p_pp_firsline_id /*+", "+@@PP_Order_ID@@ */);
			//System.out.println(" === ");
///			System.out.println(scantext+", "+colname+", "+colname.substring(colname.length()-1) );
			//	System.out.println(" === ");  PP_FeederSize_ID
/*		
			String sql= "SELECT LTH_firsline_barcodecheck('" + scantext + "', " +
				p_pp_order_id + ", " +
				p_pp_firsline_id + ", '" +
				col + "') as i";
*/				
/***			
	    	System.out.println(sql);
			System.out.println(" === ");
    		int i2 = DB.getSQLValue("i", sql);
    		if (i2<=0) {   			
				mTab.setValue("IsCheck1", "N");			
				JOptionPane.showMessageDialog(null, msg_no);
    		}else{
				mTab.setValue("IsCheck1", "Y");		  		
				//StringBuilder msg = new StringBuilder();
    			//msg.append("ข้อมูลถูกต้อง  ("+scantext+")\n");
				JOptionPane.showMessageDialog(null, "ข้อมูลถูกต้อง  ("+scantext+")");
    		}
   	
    		System.out.println(" Return : " + i2);
**/    		
		}else if (colname.equalsIgnoreCase("scantext2")) { 
			if (scantext.equalsIgnoreCase(line.getScanText1())){
				mTab.setValue("IsCheck2", "Y");			
			}else{
				mTab.setValue("IsCheck2", "N");
				mTab.setValue("ScanText2", "");
				JOptionPane.showMessageDialog(null, msg_no);
			}
		}else if (colname.equalsIgnoreCase("scantext3")) {
			if (scantext.equalsIgnoreCase(line.getScanText1())){
				mTab.setValue("IsCheck3", "Y");			
			}else{
				mTab.setValue("IsCheck3", "N");
				mTab.setValue("ScanText3", "");
				JOptionPane.showMessageDialog(null, msg_no);
			}
		}else if (colname.equalsIgnoreCase("scantext4")) {
			if (scantext.equalsIgnoreCase(line.getScanText1())){
				mTab.setValue("IsCheck4", "Y");			
			}else{
				mTab.setValue("IsCheck4", "N");
				mTab.setValue("ScanText4", "");
				JOptionPane.showMessageDialog(null, msg_no);
			}
		}else if (colname.equalsIgnoreCase("scantext5")) {
			if (scantext.equalsIgnoreCase(line.getScanText1())){
				mTab.setValue("IsCheck5", "Y");			
			}else{
				mTab.setValue("IsCheck5", "N");
				mTab.setValue("ScanText5", "");
				JOptionPane.showMessageDialog(null, msg_no);
			}
	 	} // if column	
		return "";
	}
	public static void main(String[] args) {
		
	}
}
