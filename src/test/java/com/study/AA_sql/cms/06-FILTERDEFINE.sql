delete from TZ_FILTERFLD_OPERATOR where FILTER_FIELD_ID in (select ID from TZ_FILTER_FLD where FILTER_ID in ('cmsFilter110000001', 'cmsFilter110000002'));
delete from TZ_FILTER_FLD where FILTER_ID in ('cmsFilter110000001', 'cmsFilter110000002');
delete from TZ_FILTER_DFN where ID in ('cmsFilter110000001', 'cmsFilter110000002');

INSERT INTO `TZ_FILTER_DFN`(`ID`, `BE_ID`, `NAME`, `RESULT_MAX_NUM`, `ADVANCE_MODEL`, `COMMENTS`, `ACTIVE_FLG`, `MODIFICATION_NUM`) VALUES
  ('cmsFilter110000001', 'cmsBE1100000000001', 'TZArtAddTypeFilter', 0, 'N', null, 'Y', 1),
  ('cmsFilter110000002', 'cmsBE1100000000002', 'TZArtAddTypeFieldFilter', 0, 'N', null, 'Y', 1)
;

INSERT INTO `TZ_FILTER_FLD`(`ID`, `FILTER_ID`, `FIELD_ID`, `FIELD_DESC`, `SEQ`, `CONTROL_TYPE`, `TRANSFORM_CODE`, `PT_BENAME`, `PT_DEF_ID`, `FLD_READONLY`, `FLD_HIDE`, `FLD_ISDOWN`, `FIELD_TAG_CODE`, `COMMENTS`, `ACTIVE_FLG`, `MODIFICATION_NUM`) VALUES
  ('cmsFltFld110000001', 'cmsFilter110000001', 'cmsField1100000002', null, 1, 'string', null, null, null, 'N', 'N', 'N', 'TZArtAddType.Name', null, 'Y', 1),
  ('cmsFltFld110000002', 'cmsFilter110000001', 'cmsField1100000003', null, 2, 'transform', 'ART_TYPE_ENABLE', null, null, 'N', 'N', 'Y', 'TZArtAddType.TypeEnable', null, 'Y', 1),
  ('cmsFltFld110000023', 'cmsFilter110000002', 'cmsField1100000033', null, 1, 'string', null, null, null, 'N', 'N', 'N', 'TZArtAddTypeField.FieldValue', null, 'Y', 1),
  ('cmsFltFld110000024', 'cmsFilter110000002', 'cmsField1100000034', null, 2, 'string', null, null, null, 'N', 'N', 'N', 'TZArtAddTypeField.FieldDesc', null, 'Y', 1),
  ('cmsFltFld110000025', 'cmsFilter110000002', 'cmsField1100000036', null, 3, 'transform', 'ART_TYPE_FIELD_ENABLE', null, null, 'N', 'N', 'Y', 'TZArtAddTypeField.FieldEnable', null, 'Y', 1)
;

INSERT INTO `TZ_FILTERFLD_OPERATOR`(`ID`, `FILTER_FIELD_ID`, `OPERTOR`, `IS_ACTIVE`, `IS_DEF_OPRT`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsFldOpr110000001', 'cmsFltFld110000001', '07', 'Y', 'Y', null, 1),
  ('cmsFldOpr110000002', 'cmsFltFld110000001', '01', 'Y', 'N', null, 1),
  ('cmsFldOpr110000003', 'cmsFltFld110000001', '02', 'Y', 'N', null, 1),
  ('cmsFldOpr110000004', 'cmsFltFld110000001', '08', 'Y', 'N', null, 1),
  ('cmsFldOpr110000005', 'cmsFltFld110000001', '09', 'Y', 'N', null, 1),
  ('cmsFldOpr110000016', 'cmsFltFld110000002', '07', 'Y', 'Y', null, 1),
  ('cmsFldOpr110000017', 'cmsFltFld110000002', '01', 'Y', 'N', null, 1),
  ('cmsFldOpr110000018', 'cmsFltFld110000002', '02', 'Y', 'N', null, 1),
  ('cmsFldOpr110000019', 'cmsFltFld110000002', '08', 'Y', 'N', null, 1),
  ('cmsFldOpr110000020', 'cmsFltFld110000002', '09', 'Y', 'N', null, 1),
  ('cmsFldOpr110000021', 'cmsFltFld110000002', '10', 'Y', 'N', null, 1),
  ('cmsFldOpr110000132', 'cmsFltFld110000023', '07', 'Y', 'Y', null, 1),
  ('cmsFldOpr110000133', 'cmsFltFld110000023', '01', 'Y', 'N', null, 1),
  ('cmsFldOpr110000134', 'cmsFltFld110000023', '02', 'Y', 'N', null, 1),
  ('cmsFldOpr110000135', 'cmsFltFld110000023', '08', 'Y', 'N', null, 1),
  ('cmsFldOpr110000136', 'cmsFltFld110000023', '09', 'Y', 'N', null, 1),
  ('cmsFldOpr110000147', 'cmsFltFld110000024', '07', 'Y', 'Y', null, 1),
  ('cmsFldOpr110000148', 'cmsFltFld110000024', '01', 'Y', 'N', null, 1),
  ('cmsFldOpr110000149', 'cmsFltFld110000024', '02', 'Y', 'N', null, 1),
  ('cmsFldOpr110000150', 'cmsFltFld110000024', '08', 'Y', 'N', null, 1),
  ('cmsFldOpr110000151', 'cmsFltFld110000024', '09', 'Y', 'N', null, 1),
  ('cmsFldOpr110000162', 'cmsFltFld110000025', '07', 'Y', 'Y', null, 1),
  ('cmsFldOpr110000163', 'cmsFltFld110000025', '01', 'Y', 'N', null, 1),
  ('cmsFldOpr110000164', 'cmsFltFld110000025', '02', 'Y', 'N', null, 1),
  ('cmsFldOpr110000165', 'cmsFltFld110000025', '08', 'Y', 'N', null, 1),
  ('cmsFldOpr110000166', 'cmsFltFld110000025', '09', 'Y', 'N', null, 1),
  ('cmsFldOpr110000167', 'cmsFltFld110000025', '10', 'Y', 'N', null, 1)
;

