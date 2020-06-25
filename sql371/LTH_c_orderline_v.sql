
select a.name,/*av.m_attribute_id,av.value,*/ '1.'||av.name as name2, av.description 
from m_attributevalue av
left join m_attribute a on av.m_attribute_id=a.m_attribute_id
order by av.m_attribute_id;

--update m_attributevalue set name = '1.'||name 



select * from c_order_header_v cohv limit 10
select * from LTH_c_orderline_vt order by created desc limit 10

/*********************/

drop view LTH_c_orderline_v;
create  view LTH_c_orderline_v as 
  select o.*, 'en_US'::text AS ad_language, 
     p.value as ProductValue,
     COALESCE(oi.logo_id, ci.logo_id) AS logo_id
  from c_orderline o
     JOIN ad_orginfo oi ON o.ad_org_id = oi.ad_org_id
     JOIN ad_clientinfo ci ON o.ad_client_id = ci.ad_client_id
     join m_product p on o.m_product_id = p.m_product_id 
    limit 10;
    
     

  (SELECT Value FROM M_Product v WHERE v.M_Product_ID=C_OrderLine.M_Product_ID)
  
drop view LTH_c_orderline_vt;
create  view LTH_c_orderline_vt as 
   select o.*, 'th_TH'::text AS ad_language,
     p.value as ProductValue,
     COALESCE(oi.logo_id, ci.logo_id) AS logo_id   
   from c_orderline o
     JOIN ad_orginfo oi ON o.ad_org_id = oi.ad_org_id
     JOIN ad_clientinfo ci ON o.ad_client_id = ci.ad_client_id
     join m_product p on o.m_product_id = p.m_product_id 
     limit 10;

  
  
select * from c_orderline order by created desc limit 10

/**********************/


select * from m_inout_line_v order by created desc limit 10
select * from LTH_c_orderline_v  order by created desc limit 10
select * from LTH_c_orderline_vt  order by created desc limit 10


select * from AD_PrintFormat where  AD_PrintFormat_ID=1000505
select * from AD_PrintFormatItem 
	where  AD_PrintFormat_ID=1000505
	--where AD_PrintFormatItem_ID=1018205
	
	AD_PrintFormatItem 
---update AD_PrintFormatItem set ad_org_id = 0 where  AD_PrintFormat_ID=1000505
	--where AD_PrintFormatItem_ID=1018205
	
	