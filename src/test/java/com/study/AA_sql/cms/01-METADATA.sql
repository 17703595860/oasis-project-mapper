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
  ('cmsBE1100000000001', 'TZArtAddType', 'cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase', 'TZ_ART_ADD_TYPE', null, null, null, 'cmsMsg110000000001', 'cms', 'Y', null, 1),
  ('cmsBE1100000000002', 'TZArtAddTypeField', 'cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase', 'TZ_ART_ADD_TYPE_FIELD', null, null, null, 'cmsMsg110000000002', 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_FIELD`(`ID`, `NAME`, `BUSENTITY_ID`, `JOIN_NAME`, `COL_NAME`, `CALCULATED`, `CALCVAL`, `DATA_TYPE`, `TEXTLEN`, `PREC_NUM`, `SCALE`, `REQUIRED`, `FORCEACTIVE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`, `CONTROL_TYPE`, `PT_BENAME`, `TRANSFORM_CODE`) VALUES
  ('cmsField1100000001', 'Id', 'cmsBE1100000000001', null, 'ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000002', 'Name', 'cmsBE1100000000001', null, 'NAME', null, null, 'Varchar', 50, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000003', 'TypeEnable', 'cmsBE1100000000001', null, 'TYPE_ENABLE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'ART_TYPE_ENABLE'),
  ('cmsField1100000004', 'Comments', 'cmsBE1100000000001', null, 'COMMENTS', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000005', 'ModificationNumber', 'cmsBE1100000000001', null, 'MODIFICATION_NUM', null, null, 'Number', null, null, null, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000006', 'Created', 'cmsBE1100000000001', null, 'CREATED', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField1100000007', 'CreatedBy', 'cmsBE1100000000001', null, 'CREATED_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField1100000008', 'CreatedByName', 'cmsBE1100000000001', 'ByName', 'USERNAME', null, null, 'Varchar', 255, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField1100000009', 'LastUpd', 'cmsBE1100000000001', null, 'LAST_UPD', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField1100000010', 'LastUpdBy', 'cmsBE1100000000001', null, 'LAST_UPD_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField1100000031', 'Id', 'cmsBE1100000000002', null, 'ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000032', 'TypeId', 'cmsBE1100000000002', null, 'TYPE_ID', null, null, 'Varchar', 18, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000033', 'FieldValue', 'cmsBE1100000000002', null, 'FIELD_VALUE', null, null, 'Varchar', 10, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000034', 'FieldDesc', 'cmsBE1100000000002', null, 'FIELD_DESC', null, null, 'Varchar', 255, null, 0, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000035', 'Seq', 'cmsBE1100000000002', null, 'SEQ', null, null, 'Number', 10, 10, 0, 'Y', 'N', 'Y', null, 1, 'number', null, null),
  ('cmsField1100000036', 'FieldEnable', 'cmsBE1100000000002', null, 'FIELD_ENABLE', null, null, 'Varchar', 1, null, 0, 'Y', 'N', 'Y', null, 1, 'transform', null, 'ART_TYPE_FIELD_ENABLE'),
  ('cmsField1100000037', 'Comments', 'cmsBE1100000000002', null, 'COMMENTS', null, null, 'Varchar', 255, null, 0, 'N', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000038', 'ModificationNumber', 'cmsBE1100000000002', null, 'MODIFICATION_NUM', null, null, 'Number', null, null, null, 'Y', 'N', 'Y', null, 1, 'string', null, null),
  ('cmsField1100000039', 'Created', 'cmsBE1100000000002', null, 'CREATED', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField1100000040', 'CreatedBy', 'cmsBE1100000000002', null, 'CREATED_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField1100000041', 'CreatedByName', 'cmsBE1100000000002', 'ByName', 'USERNAME', null, null, 'Varchar', 255, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null),
  ('cmsField1100000042', 'LastUpd', 'cmsBE1100000000002', null, 'LAST_UPD', null, null, 'DateTime', null, null, null, 'Y', 'N', 'Y', null, 1, 'datetime', null, null),
  ('cmsField1100000043', 'LastUpdBy', 'cmsBE1100000000002', null, 'LAST_UPD_BY', null, null, 'Varchar', 18, null, null, 'Y', 'N', 'Y', null, 1, 'String', null, null)
;

INSERT INTO `TZ_JOIN`(`ID`, `NAME`, `BUSENTITY_ID`, `DEST_TBL_NAME`, `OUTER_JOIN`, `EXTENSION_FLG`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsJoin11000000001', 'ByName', 'cmsBE1100000000001', 'TZ_USER', 'Y', 'N', 'Y', '创建人', 1),
  ('cmsJoin11000000022', 'ByName', 'cmsBE1100000000002', 'TZ_USER', 'Y', 'N', 'Y', '创建人', 1)
;

INSERT INTO `TZ_JOIN_SPEC`(`ID`, `NAME`, `JOIN_ID`, `SRC_FLD_NAME`, `DEST_COL_NAME`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsSpec11000000001', 'ByName', 'cmsJoin11000000001', 'CreatedBy', 'ID', 'Y', '创建人', 1),
  ('cmsSpec11000000022', 'ByName', 'cmsJoin11000000022', 'CreatedBy', 'ID', 'Y', '创建人', 1)
;

INSERT INTO `TZ_LINK`(`ID`, `NAME`, `SRCHSPEC`, `PARENT_BE_NAME`, `CHILD_BE_NAME`, `SRC_FLD_NAME`, `DST_FLD_NAME`, `INTER_TBL_NAME`, `IPARENT_COL_NAME`, `ICHILD_COL_NAME`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsLink11000000001', 'TZArtAddType/TZArtAddTypeField', null, 'TZArtAddType', 'TZArtAddTypeField', 'Id', 'TypeId', null, null, null, 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_BUSMODULE`(`ID`, `NAME`, `PR_BUSENTITY_NAME`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsBM1100000000001', 'TZArtAddType', 'TZArtAddType', 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_BMENTITY`(`ID`, `BUSMODULE_ID`, `BE_NAME`, `LINK_NAME`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsBMBE11000000001', 'cmsBM1100000000001', 'TZArtAddType', null, 'Y', null, 1),
  ('cmsBMBE11000000002', 'cmsBM1100000000001', 'TZArtAddTypeField', 'TZArtAddType/TZArtAddTypeField', 'Y', null, 1)
;

