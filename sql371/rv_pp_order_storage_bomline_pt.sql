/*
--CREATE OR REPLACE VIEW rv_pp_order_storage_pt AS 
SELECT obl.ad_client_id, obl.ad_org_id, obl.createdby, 
    obl.created, 
    obl.updatedby, 
    obl.updated, 
    obl.isactive, 
    p.value as ProductValue, 
    p.name as ProductName, 
    obl.pp_order_bom_id, 
    obl.pp_order_bomline_id, 
    obl.pp_order_id, 
    obl.m_product_id, 
    obl.qtybom, 
    obl.qtyentered, 
    round(obl.qtyrequired, 4) AS qtyrequired, 
    s.m_attributesetinstance_id, 
    s.m_locator_id,
    s.qtyonhand,
    s.qtyreserved,
    s.qtyonhand-s.qtyreserved AS qtyavailble,
    s.qtyordered,
    rm.c_uom_id
FROM pp_order_bomline obl
JOIN pp_order o ON o.pp_order_id = obl.pp_order_id
LEFT JOIN m_product p ON p.m_product_id = o.m_product_id
LEFT JOIN m_product rm ON rm.m_product_id = obl.m_product_id
LEFT JOIN m_storage s ON s.m_product_id = obl.m_product_id
WHERE o.PP_Order_ID=1000132    
ORDER BY
    obl.pp_order_id, 
    obl.pp_order_bomline_id, 
    obl.m_product_id, 
    s.m_attributesetinstance_id, 
    s.m_locator_id
*/
CREATE OR REPLACE VIEW rv_pp_order_storage_bomline_pt AS 
SELECT * from m_storage 
--WHERE m_product_id=1001381
ORDER BY
    m_product_id, 
    m_attributesetinstance_id, 
    m_locator_id
