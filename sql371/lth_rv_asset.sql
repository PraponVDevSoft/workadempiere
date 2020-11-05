--
drop view lth_rv_asset;
create view lth_rv_asset as
select value,
concat(
     'Name: '         ,NULLIF(name::text, '-'),
     ', Description: ',NULLIF(description::text, '-'),
     ', Location: '   ,NULLIF(Locationcomment::text, '-'),
     ', Date: '       ,to_char(a_asset_createdate, 'DD/MM/YYYY')
     ) as TextDetails,
     ad_client_id,ad_org_id,created,createdby,isactive,updated,updatedby 
from a_asset
/*where ad_client_id=1000003*/
order by updatedby desc 

/*
 * 
 select * from lth_rv_asset
 */
NULLIF(rn.name::text, bpc.name::text)


   concat(rc.name, '_', rl.desccause) AS desccause,
   NULLIF(name::text, '') AS requestname,
*/