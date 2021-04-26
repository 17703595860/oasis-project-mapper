# 删除cms元数据配置
delete from TZ_LINK where MODULE = 'cms';
--
delete from TZ_JOIN_SPEC where JOIN_ID in (select ID from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'cms'));
delete from TZ_JOIN_CONSTRNT where JOIN_ID in (select ID from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'cms'));
delete from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'cms');
delete from TZ_FIELD where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'cms');
delete from TZ_BUSENTITY where MODULE = 'cms';
--
delete from TZ_BMENTITY where BUSMODULE_ID in (select ID from TZ_BUSMODULE where MODULE = 'cms');
delete from TZ_BUSMODULE where MODULE = 'cms';

INSERT INTO `TZ_BUSENTITY`(`ID`, `NAME`, `CLASS_NAME`, `TABLE_NAME`, `SRCHSPEC`, `DATA_SOURCE`, `EBE_FLG`, `MSG_COLLECTION_ID`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsBE0000000000001', 'TZOrgSite', 'cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase', 'TZ_ORGANIZATION_SITE', null, null, null, 'cmsMsg000000000001', 'cms', 'Y', null, 1),
  ('cmsBE0000000000002', 'TZSiteColu', 'cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase', 'TZ_SITE_COLU', null, null, null, 'cmsMsg000000000002', 'cms', 'Y', null, 1),
  ('cmsBE0000000000003', 'TZSiteTemp', 'cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase', 'TZ_SITE_TEMP', null, null, null, 'cmsMsg000000000003', 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_FIELD`(`ID`, `NAME`, `BUSENTITY_ID`, `JOIN_NAME`, `COL_NAME`, `CALCULATED`, `CALCVAL`, `DATA_TYPE`, `TEXTLEN`, `PREC_NUM`, `SCALE`, `REQUIRED`, `FORCEACTIVE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`, `CONTROL_TYPE`, `PT_BENAME`, `TRANSFORM_CODE`) VALUES
  ('cmsField0000000001', 'Id', 'cmsBE0000000000001', null, 'ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000002', 'OrganizationCode', 'cmsBE0000000000001', null, 'ORGANIZATION_CODE', null, null, 'Varchar', 15, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000003', 'Name', 'cmsBE0000000000001', null, 'NAME', null, null, 'Varchar', 100, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000004', 'SiteName', 'cmsBE0000000000001', null, 'SITE_NAME', null, null, 'Varchar', 20, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000005', 'SiteType', 'cmsBE0000000000001', null, 'SITE_TYPE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'SITE_TYPE'),
  ('cmsField0000000006', 'SiteDesc', 'cmsBE0000000000001', null, 'SITE_DESC', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000007', 'SiteEnable', 'cmsBE0000000000001', null, 'SITE_ENABLE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'SITE_ENABLE'),
  ('cmsField0000000008', 'SitePath', 'cmsBE0000000000001', null, 'SITE_PATH', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000009', 'SiteCss', 'cmsBE0000000000001', null, 'SITE_CSS', null, null, 'Varchar', 536870911, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000010', 'SitePhoneCss', 'cmsBE0000000000001', null, 'SITE_PHONE_CSS', null, null, 'Varchar', 536870911, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000011', 'SiteIssue', 'cmsBE0000000000001', null, 'SITE_ISSUE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'SITE_ISSUE'),
  ('cmsField0000000012', 'Comments', 'cmsBE0000000000001', null, 'COMMENTS', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000013', 'ModificationNumber', 'cmsBE0000000000001', null, 'MODIFICATION_NUM', null, null, 'Number', null, null, null, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000014', 'Created', 'cmsBE0000000000001', null, 'CREATED', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField0000000015', 'CreatedBy', 'cmsBE0000000000001', null, 'CREATED_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000016', 'CreatedByName', 'cmsBE0000000000001', 'ByName', 'USERNAME', null, null, 'Varchar', 255, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000017', 'LastUpd', 'cmsBE0000000000001', null, 'LAST_UPD', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField0000000018', 'LastUpdBy', 'cmsBE0000000000001', null, 'LAST_UPD_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000039', 'Id', 'cmsBE0000000000002', null, 'ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000040', 'SiteId', 'cmsBE0000000000002', null, 'SITE_ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000041', 'Name', 'cmsBE0000000000002', null, 'NAME', null, null, 'Varchar', 100, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000042', 'ColuType', 'cmsBE0000000000002', null, 'COLU_TYPE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'SITE_COLU_TYPE'),
  ('cmsField0000000043', 'ColuEnable', 'cmsBE0000000000002', null, 'COLU_ENABLE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'SITE_COLU_ENABLE'),
  ('cmsField0000000044', 'ColePath', 'cmsBE0000000000002', null, 'COLE_PATH', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000045', 'TempId', 'cmsBE0000000000002', null, 'TEMP_ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'prompt', 'TZSiteTemp', null),
  ('cmsField0000000046', 'ArtTypeId', 'cmsBE0000000000002', null, 'ART_TYPE_ID', null, null, 'Varchar', 18, null, 0, 'N', 'N', 'Y', null, 1, 'prompt', 'TZArtAddType', null),
  ('cmsField0000000047', 'FColuId', 'cmsBE0000000000002', null, 'F_COLU_ID', null, null, 'Varchar', 18, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000048', 'ColuLevel', 'cmsBE0000000000002', null, 'COLU_LEVEL', null, null, 'Number', 10, 10, 0, 'Y', 'N', 'Y', null, 1, 'number', null, null),
  ('cmsField0000000049', 'Comments', 'cmsBE0000000000002', null, 'COMMENTS', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000050', 'ModificationNumber', 'cmsBE0000000000002', null, 'MODIFICATION_NUM', null, null, 'Number', null, null, null, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000051', 'Created', 'cmsBE0000000000002', null, 'CREATED', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField0000000052', 'CreatedBy', 'cmsBE0000000000002', null, 'CREATED_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000053', 'CreatedByName', 'cmsBE0000000000002', 'ByName', 'USERNAME', null, null, 'Varchar', 255, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000054', 'LastUpd', 'cmsBE0000000000002', null, 'LAST_UPD', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField0000000055', 'LastUpdBy', 'cmsBE0000000000002', null, 'LAST_UPD_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000076', 'Id', 'cmsBE0000000000003', null, 'ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000077', 'SiteId', 'cmsBE0000000000003', null, 'SITE_ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000078', 'Name', 'cmsBE0000000000003', null, 'NAME', null, null, 'Varchar', 100, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000079', 'TempType', 'cmsBE0000000000003', null, 'TEMP_TYPE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'SITE_TEMP_TYPE'),
  ('cmsField0000000080', 'TempEnable', 'cmsBE0000000000003', null, 'TEMP_ENABLE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'SITE_TEMP_ENABLE'),
  ('cmsField0000000081', 'TzTempPccode', 'cmsBE0000000000003', null, 'TZ_TEMP_PCCODE', null, null, 'Varchar', 536870911, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000082', 'TzTempMscode', 'cmsBE0000000000003', null, 'TZ_TEMP_MSCODE', null, null, 'Varchar', 536870911, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000083', 'Comments', 'cmsBE0000000000003', null, 'COMMENTS', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000084', 'ModificationNumber', 'cmsBE0000000000003', null, 'MODIFICATION_NUM', null, null, 'Number', null, null, null, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField0000000085', 'Created', 'cmsBE0000000000003', null, 'CREATED', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField0000000086', 'CreatedBy', 'cmsBE0000000000003', null, 'CREATED_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000087', 'CreatedByName', 'cmsBE0000000000003', 'ByName', 'USERNAME', null, null, 'Varchar', 255, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField0000000088', 'LastUpd', 'cmsBE0000000000003', null, 'LAST_UPD', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField0000000089', 'LastUpdBy', 'cmsBE0000000000003', null, 'LAST_UPD_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null)
;

INSERT INTO `TZ_JOIN`(`ID`, `NAME`, `BUSENTITY_ID`, `DEST_TBL_NAME`, `OUTER_JOIN`, `EXTENSION_FLG`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsJoin00000000001', 'ByName', 'cmsBE0000000000001', 'TZ_USER', 'Y', 'N', 'Y', '创建人', 1),
  ('cmsJoin00000000022', 'ByName', 'cmsBE0000000000002', 'TZ_USER', 'Y', 'N', 'Y', '创建人', 1),
  ('cmsJoin00000000043', 'ByName', 'cmsBE0000000000003', 'TZ_USER', 'Y', 'N', 'Y', '创建人', 1)
;

INSERT INTO `TZ_JOIN_SPEC`(`ID`, `NAME`, `JOIN_ID`, `SRC_FLD_NAME`, `DEST_COL_NAME`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsSpec00000000001', 'ByName', 'cmsJoin00000000001', 'CreatedBy', 'ID', 'Y', '创建人', 1),
  ('cmsSpec00000000022', 'ByName', 'cmsJoin00000000022', 'CreatedBy', 'ID', 'Y', '创建人', 1),
  ('cmsSpec00000000043', 'ByName', 'cmsJoin00000000043', 'CreatedBy', 'ID', 'Y', '创建人', 1)
;

INSERT INTO `TZ_LINK`(`ID`, `NAME`, `SRCHSPEC`, `PARENT_BE_NAME`, `CHILD_BE_NAME`, `SRC_FLD_NAME`, `DST_FLD_NAME`, `INTER_TBL_NAME`, `IPARENT_COL_NAME`, `ICHILD_COL_NAME`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsLink00000000001', 'TZOrgSite/TZSiteColu', null, 'TZOrgSite', 'TZSiteColu', 'Id', 'SiteId', null, null, null, 'cms', 'Y', null, 1),
  ('cmsLink00000000002', 'TZOrgSite/TZSiteTemp', null, 'TZOrgSite', 'TZSiteTemp', 'Id', 'SiteId', null, null, null, 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_BUSMODULE`(`ID`, `NAME`, `PR_BUSENTITY_NAME`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsBM0000000000001', 'TZOrgSite', 'TZOrgSite', 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_BMENTITY`(`ID`, `BUSMODULE_ID`, `BE_NAME`, `LINK_NAME`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsBMBE00000000001', 'cmsBM0000000000001', 'TZOrgSite', null, 'Y', null, 1),
  ('cmsBMBE00000000002', 'cmsBM0000000000001', 'TZSiteColu', 'TZOrgSite/TZSiteColu', 'Y', null, 1),
  ('cmsBMBE00000000003', 'cmsBM0000000000001', 'TZSiteTemp', 'TZOrgSite/TZSiteTemp', 'Y', null, 1)
;

