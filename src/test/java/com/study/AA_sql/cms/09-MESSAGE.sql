delete from TZ_MESSAGE_INFO where COLLECTION_ID in ('cmsMsg110000000001', 'cmsMsg110000000002');
delete from TZ_MESSAGE_COLLECTION where ID in ('cmsMsg110000000001', 'cmsMsg110000000002');

INSERT INTO `TZ_MESSAGE_COLLECTION`(`ID`, `COLLECTION_CODE`, `COLLECTION_DESC`, `ACTIVE_FLG`, `MODIFICATION_NUM`) VALUES
  ('cmsMsg110000000001', 'TZArtAddType', 'TZArtAddType', 'Y', 1),
  ('cmsMsg110000000002', 'TZArtAddTypeField', 'TZArtAddTypeField', 'Y', 1)
;

INSERT INTO `TZ_MESSAGE_INFO`(`ID`, `COLLECTION_ID`, `LANGUAGE`, `MESSAGE_CODE`, `TAG_CODE`, `MESSAGE_DESC`, `ACTIVE_FLG`, `MODIFICATION_NUM`) VALUES
  ('cmsMsgInf110000001', 'cmsMsg110000000001', 'ZHS', 'TZArtAddType', 'TZArtAddType.TZArtAddType', '内容类型', 'Y', 1),
  ('cmsMsgInf110000002', 'cmsMsg110000000001', 'ENG', 'TZArtAddType', 'TZArtAddType.TZArtAddType', 'TZArtAddType', 'Y', 1),
  ('cmsMsgInf110000003', 'cmsMsg110000000001', 'ZHS', 'CreatedBy', 'TZArtAddType.CreatedBy', '创建人', 'Y', 1),
  ('cmsMsgInf110000004', 'cmsMsg110000000001', 'ENG', 'CreatedBy', 'TZArtAddType.CreatedBy', 'CreatedBy', 'Y', 1),
  ('cmsMsgInf110000005', 'cmsMsg110000000001', 'ZHS', 'Comments', 'TZArtAddType.Comments', '备注', 'Y', 1),
  ('cmsMsgInf110000006', 'cmsMsg110000000001', 'ENG', 'Comments', 'TZArtAddType.Comments', 'Comments', 'Y', 1),
  ('cmsMsgInf110000007', 'cmsMsg110000000001', 'ZHS', 'LastUpd', 'TZArtAddType.LastUpd', '更新时间', 'Y', 1),
  ('cmsMsgInf110000008', 'cmsMsg110000000001', 'ENG', 'LastUpd', 'TZArtAddType.LastUpd', 'LastUpd', 'Y', 1),
  ('cmsMsgInf110000009', 'cmsMsg110000000001', 'ZHS', 'LastUpdBy', 'TZArtAddType.LastUpdBy', '更新人', 'Y', 1),
  ('cmsMsgInf110000010', 'cmsMsg110000000001', 'ENG', 'LastUpdBy', 'TZArtAddType.LastUpdBy', 'LastUpdBy', 'Y', 1),
  ('cmsMsgInf110000011', 'cmsMsg110000000001', 'ZHS', 'TypeEnable', 'TZArtAddType.TypeEnable', '是否启用', 'Y', 1),
  ('cmsMsgInf110000012', 'cmsMsg110000000001', 'ENG', 'TypeEnable', 'TZArtAddType.TypeEnable', 'TypeEnable', 'Y', 1),
  ('cmsMsgInf110000013', 'cmsMsg110000000001', 'ZHS', 'Id', 'TZArtAddType.Id', '主键', 'Y', 1),
  ('cmsMsgInf110000014', 'cmsMsg110000000001', 'ENG', 'Id', 'TZArtAddType.Id', 'Id', 'Y', 1),
  ('cmsMsgInf110000015', 'cmsMsg110000000001', 'ZHS', 'ModificationNumber', 'TZArtAddType.ModificationNumber', '修改记录号', 'Y', 1),
  ('cmsMsgInf110000016', 'cmsMsg110000000001', 'ENG', 'ModificationNumber', 'TZArtAddType.ModificationNumber', 'ModificationNumber', 'Y', 1),
  ('cmsMsgInf110000017', 'cmsMsg110000000001', 'ZHS', 'Created', 'TZArtAddType.Created', '创建时间', 'Y', 1),
  ('cmsMsgInf110000018', 'cmsMsg110000000001', 'ENG', 'Created', 'TZArtAddType.Created', 'Created', 'Y', 1),
  ('cmsMsgInf110000019', 'cmsMsg110000000001', 'ZHS', 'Name', 'TZArtAddType.Name', '名称', 'Y', 1),
  ('cmsMsgInf110000020', 'cmsMsg110000000001', 'ENG', 'Name', 'TZArtAddType.Name', 'Name', 'Y', 1),
  ('cmsMsgInf110000021', 'cmsMsg110000000001', 'ZHS', 'CreatedByName', 'TZArtAddType.CreatedByName', '创建人名称', 'Y', 1),
  ('cmsMsgInf110000022', 'cmsMsg110000000001', 'ENG', 'CreatedByName', 'TZArtAddType.CreatedByName', 'CreatedByName', 'Y', 1),
  ('cmsMsgInf110000073', 'cmsMsg110000000002', 'ZHS', 'TZArtAddTypeField', 'TZArtAddTypeField.TZArtAddTypeField', '内容类型字段', 'Y', 1),
  ('cmsMsgInf110000074', 'cmsMsg110000000002', 'ENG', 'TZArtAddTypeField', 'TZArtAddTypeField.TZArtAddTypeField', 'TZArtAddTypeField', 'Y', 1),
  ('cmsMsgInf110000075', 'cmsMsg110000000002', 'ZHS', 'TypeId', 'TZArtAddTypeField.TypeId', '内容类型', 'Y', 1),
  ('cmsMsgInf110000076', 'cmsMsg110000000002', 'ENG', 'TypeId', 'TZArtAddTypeField.TypeId', 'TypeId', 'Y', 1),
  ('cmsMsgInf110000077', 'cmsMsg110000000002', 'ZHS', 'CreatedBy', 'TZArtAddTypeField.CreatedBy', '创建人', 'Y', 1),
  ('cmsMsgInf110000078', 'cmsMsg110000000002', 'ENG', 'CreatedBy', 'TZArtAddTypeField.CreatedBy', 'CreatedBy', 'Y', 1),
  ('cmsMsgInf110000079', 'cmsMsg110000000002', 'ZHS', 'Comments', 'TZArtAddTypeField.Comments', '备注', 'Y', 1),
  ('cmsMsgInf110000080', 'cmsMsg110000000002', 'ENG', 'Comments', 'TZArtAddTypeField.Comments', 'Comments', 'Y', 1),
  ('cmsMsgInf110000081', 'cmsMsg110000000002', 'ZHS', 'LastUpd', 'TZArtAddTypeField.LastUpd', '更新时间', 'Y', 1),
  ('cmsMsgInf110000082', 'cmsMsg110000000002', 'ENG', 'LastUpd', 'TZArtAddTypeField.LastUpd', 'LastUpd', 'Y', 1),
  ('cmsMsgInf110000083', 'cmsMsg110000000002', 'ZHS', 'LastUpdBy', 'TZArtAddTypeField.LastUpdBy', '更新人', 'Y', 1),
  ('cmsMsgInf110000084', 'cmsMsg110000000002', 'ENG', 'LastUpdBy', 'TZArtAddTypeField.LastUpdBy', 'LastUpdBy', 'Y', 1),
  ('cmsMsgInf110000085', 'cmsMsg110000000002', 'ZHS', 'FieldValue', 'TZArtAddTypeField.FieldValue', '类型的值', 'Y', 1),
  ('cmsMsgInf110000086', 'cmsMsg110000000002', 'ENG', 'FieldValue', 'TZArtAddTypeField.FieldValue', 'FieldValue', 'Y', 1),
  ('cmsMsgInf110000087', 'cmsMsg110000000002', 'ZHS', 'Id', 'TZArtAddTypeField.Id', '主键', 'Y', 1),
  ('cmsMsgInf110000088', 'cmsMsg110000000002', 'ENG', 'Id', 'TZArtAddTypeField.Id', 'Id', 'Y', 1),
  ('cmsMsgInf110000089', 'cmsMsg110000000002', 'ZHS', 'ModificationNumber', 'TZArtAddTypeField.ModificationNumber', '修改记录号', 'Y', 1),
  ('cmsMsgInf110000090', 'cmsMsg110000000002', 'ENG', 'ModificationNumber', 'TZArtAddTypeField.ModificationNumber', 'ModificationNumber', 'Y', 1),
  ('cmsMsgInf110000091', 'cmsMsg110000000002', 'ZHS', 'FieldEnable', 'TZArtAddTypeField.FieldEnable', '是否启用', 'Y', 1),
  ('cmsMsgInf110000092', 'cmsMsg110000000002', 'ENG', 'FieldEnable', 'TZArtAddTypeField.FieldEnable', 'FieldEnable', 'Y', 1),
  ('cmsMsgInf110000093', 'cmsMsg110000000002', 'ZHS', 'Seq', 'TZArtAddTypeField.Seq', '显示的排序', 'Y', 1),
  ('cmsMsgInf110000094', 'cmsMsg110000000002', 'ENG', 'Seq', 'TZArtAddTypeField.Seq', 'Seq', 'Y', 1),
  ('cmsMsgInf110000095', 'cmsMsg110000000002', 'ZHS', 'Created', 'TZArtAddTypeField.Created', '创建时间', 'Y', 1),
  ('cmsMsgInf110000096', 'cmsMsg110000000002', 'ENG', 'Created', 'TZArtAddTypeField.Created', 'Created', 'Y', 1),
  ('cmsMsgInf110000097', 'cmsMsg110000000002', 'ZHS', 'FieldDesc', 'TZArtAddTypeField.FieldDesc', '类型的描述', 'Y', 1),
  ('cmsMsgInf110000098', 'cmsMsg110000000002', 'ENG', 'FieldDesc', 'TZArtAddTypeField.FieldDesc', 'FieldDesc', 'Y', 1),
  ('cmsMsgInf110000099', 'cmsMsg110000000002', 'ZHS', 'CreatedByName', 'TZArtAddTypeField.CreatedByName', '创建人名称', 'Y', 1),
  ('cmsMsgInf110000100', 'cmsMsg110000000002', 'ENG', 'CreatedByName', 'TZArtAddTypeField.CreatedByName', 'CreatedByName', 'Y', 1)
;

