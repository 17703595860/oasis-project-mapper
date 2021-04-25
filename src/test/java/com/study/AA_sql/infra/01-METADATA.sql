# 删除infra元数据配置
delete from TZ_LINK where MODULE = 'infra';
--
delete from TZ_JOIN_SPEC where JOIN_ID in (select ID from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'infra'));
delete from TZ_JOIN_CONSTRNT where JOIN_ID in (select ID from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'infra'));
delete from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'infra');
delete from TZ_FIELD where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = 'infra');
delete from TZ_BUSENTITY where MODULE = 'infra';
--
delete from TZ_BMENTITY where BUSMODULE_ID in (select ID from TZ_BUSMODULE where MODULE = 'infra');
delete from TZ_BUSMODULE where MODULE = 'infra';

INSERT INTO `TZ_BUSENTITY`(`ID`, `NAME`, `CLASS_NAME`, `TABLE_NAME`, `SRCHSPEC`, `DATA_SOURCE`, `EBE_FLG`, `MSG_COLLECTION_ID`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('infraBE00000000001', 'TZMenuTree', 'cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase', 'TZ_MENU_TREE', null, null, null, 'infraMsg0000000001', 'infra', 'Y', null, 1),
  ('infraBE00000000002', 'TZMenuNode', 'cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase', 'TZ_MENU_NODE', null, null, null, 'infraMsg0000000002', 'infra', 'Y', null, 1)
;

INSERT INTO `TZ_FIELD`(`ID`, `NAME`, `BUSENTITY_ID`, `JOIN_NAME`, `COL_NAME`, `CALCULATED`, `CALCVAL`, `DATA_TYPE`, `TEXTLEN`, `PREC_NUM`, `SCALE`, `REQUIRED`, `FORCEACTIVE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`, `CONTROL_TYPE`, `PT_BENAME`, `TRANSFORM_CODE`) VALUES
  ('infraField00000001', 'Id', 'infraBE00000000001', null, 'ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000002', 'Name', 'infraBE00000000001', null, 'NAME', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000003', 'Description', 'infraBE00000000001', null, 'DESCRIPTION', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000004', 'OrgId', 'infraBE00000000001', null, 'ORG_ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000005', 'ModificationNumber', 'infraBE00000000001', null, 'MODIFICATION_NUM', null, null, 'Number', null, null, null, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000006', 'Created', 'infraBE00000000001', null, 'CREATED', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('infraField00000007', 'CreatedBy', 'infraBE00000000001', null, 'CREATED_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('infraField00000008', 'CreatedByName', 'infraBE00000000001', 'ByName', 'USERNAME', null, null, 'Varchar', 255, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('infraField00000009', 'LastUpd', 'infraBE00000000001', null, 'LAST_UPD', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('infraField00000010', 'LastUpdBy', 'infraBE00000000001', null, 'LAST_UPD_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('infraField00000031', 'Id', 'infraBE00000000002', null, 'ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000032', 'TreeId', 'infraBE00000000002', null, 'TREE_ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000033', 'Name', 'infraBE00000000002', null, 'NAME', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000034', 'Description', 'infraBE00000000002', null, 'DESCRIPTION', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000035', 'ParentId', 'infraBE00000000002', null, 'PARENT_ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000036', 'Sequence', 'infraBE00000000002', null, 'SEQUENCE', null, null, 'Varchar', 5, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000037', 'Hidden', 'infraBE00000000002', null, 'HIDDEN', null, null, 'Varchar', 3, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000038', 'Type', 'infraBE00000000002', null, 'TYPE', null, null, 'Varchar', 3, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'MenuNode_Type'),
  ('infraField00000039', 'Path', 'infraBE00000000002', null, 'PATH', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000040', 'Url', 'infraBE00000000002', null, 'URL', null, null, 'Varchar', 500, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000041', 'ComponentId', 'infraBE00000000002', null, 'COMPONENT_ID', null, null, 'Varchar', 18, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000042', 'Title', 'infraBE00000000002', null, 'TITLE', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000043', 'TitleKey', 'infraBE00000000002', null, 'TITLE_KEY', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000044', 'Icon', 'infraBE00000000002', null, 'ICON', null, null, 'Varchar', 100, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000045', 'Variables', 'infraBE00000000002', null, 'VARIABLES', null, null, 'Varchar', 16383, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000046', 'PermissionId', 'infraBE00000000002', null, 'PERMISSION_ID', null, null, 'Varchar', 18, null, 0, 'N', 'N', 'Y', null, 1, 'prompt', 'TZPermission', null),
  ('infraField00000047', 'SiteColuId', 'infraBE00000000002', null, 'SITE_COLU_ID', null, null, 'Varchar', 18, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000048', 'SiteTempId', 'infraBE00000000002', null, 'SITE_TEMP_ID', null, null, 'Varchar', 18, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000049', 'ModificationNumber', 'infraBE00000000002', null, 'MODIFICATION_NUM', null, null, 'Number', null, null, null, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('infraField00000050', 'Created', 'infraBE00000000002', null, 'CREATED', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('infraField00000051', 'CreatedBy', 'infraBE00000000002', null, 'CREATED_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('infraField00000052', 'CreatedByName', 'infraBE00000000002', 'ByName', 'USERNAME', null, null, 'Varchar', 255, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('infraField00000053', 'LastUpd', 'infraBE00000000002', null, 'LAST_UPD', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('infraField00000054', 'LastUpdBy', 'infraBE00000000002', null, 'LAST_UPD_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null)
;

INSERT INTO `TZ_JOIN`(`ID`, `NAME`, `BUSENTITY_ID`, `DEST_TBL_NAME`, `OUTER_JOIN`, `EXTENSION_FLG`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('infraJoin000000001', 'ByName', 'infraBE00000000001', 'TZ_USER', 'Y', 'N', 'Y', '创建人', 1),
  ('infraJoin000000022', 'ByName', 'infraBE00000000002', 'TZ_USER', 'Y', 'N', 'Y', '创建人', 1)
;

INSERT INTO `TZ_JOIN_SPEC`(`ID`, `NAME`, `JOIN_ID`, `SRC_FLD_NAME`, `DEST_COL_NAME`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('infraSpec000000001', 'ByName', 'infraJoin000000001', 'CreatedBy', 'ID', 'Y', '创建人', 1),
  ('infraSpec000000022', 'ByName', 'infraJoin000000022', 'CreatedBy', 'ID', 'Y', '创建人', 1)
;

INSERT INTO `TZ_LINK`(`ID`, `NAME`, `SRCHSPEC`, `PARENT_BE_NAME`, `CHILD_BE_NAME`, `SRC_FLD_NAME`, `DST_FLD_NAME`, `INTER_TBL_NAME`, `IPARENT_COL_NAME`, `ICHILD_COL_NAME`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('infraLink000000001', 'TZMenuTree/TZMenuNode', null, 'TZMenuTree', 'TZMenuNode', 'Id', 'TreeId', null, null, null, 'infra', 'Y', null, 1)
;

INSERT INTO `TZ_BUSMODULE`(`ID`, `NAME`, `PR_BUSENTITY_NAME`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('infraBM00000000001', 'TZMenuTree', 'TZMenuTree', 'infra', 'Y', null, 1)
;

INSERT INTO `TZ_BMENTITY`(`ID`, `BUSMODULE_ID`, `BE_NAME`, `LINK_NAME`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('infraBMBE000000001', 'infraBM00000000001', 'TZMenuTree', null, 'Y', null, 1),
  ('infraBMBE000000002', 'infraBM00000000001', 'TZMenuNode', 'TZMenuTree/TZMenuNode', 'Y', null, 1)
;

