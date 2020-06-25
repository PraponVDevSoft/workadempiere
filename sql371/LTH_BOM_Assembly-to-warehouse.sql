/*
Reference		Search Key	Name	m_locator_id
_BOM_Assembly_L		1	SMT		1000028
_BOM_Assembly_L		2	AI		1000036
_BOM_Assembly_L		3	AS1		1000002
_BOM_Assembly_L		4	AS2 ***		1000002		มี .. record
_BOM_Assembly_L		5	QC		1000033
_BOM_Assembly_L		6	PK		1000020
_BOM_Assembly_L		A	AI,AS1		1000036		มี 1 record
_BOM_Assembly_L		L	LED		1000046


LocatorID	 replace to pp_product_bomline	Q1
1000036	iAi		Y
1000002	iAssy	Y
1000046	iLed	Y
1000020	iPk		Y
1000033	iQc		Y
1000028	iSmt	Y

smt ai as1 as2 qc pk 
led
*/
select ml.m_warehouse_id,ml.m_locator_id, ml.value  from m_locator ml 
 where ml.ad_client_id=1000003 and ml.isactive='Y'
 order by ml.m_warehouse_id

select bom_assembly from pp_product_bomline where ad_client_id=1000003 limit 300
select * from AD_Reference where AD_Reference_ID=1000005

iSmt
iQc
iLed
iAi
iPk


Issue = 0
Backflush = 1
FloorStock = 2



select issuemethod from PP_Product_BOMLine where PP_Product_BOMLine_ID=1000089
Issue = 0
Backflush = 1
FloorStock = 2

select * from AD_Preference

SELECT * FROM PP_Order_Workflow limit 100 


select * from S_ResourceType
select * from S_Resource where S_Resource.IsManufacturingResource='Y'

select * from pp_order_bomline pob limit 10 