delete from TZ_FILTERFLD_OPERATOR where FILTER_FIELD_ID in (select ID from TZ_FILTER_FLD where FILTER_ID in ('infraFilter0000001', 'infraFilter0000002'));
delete from TZ_FILTER_FLD where FILTER_ID in ('infraFilter0000001', 'infraFilter0000002');
delete from TZ_FILTER_DFN where ID in ('infraFilter0000001', 'infraFilter0000002');

INSERT INTO `TZ_FILTER_DFN`(`ID`, `BE_ID`, `NAME`, `RESULT_MAX_NUM`, `ADVANCE_MODEL`, `COMMENTS`, `ACTIVE_FLG`, `MODIFICATION_NUM`) VALUES
  ('infraFilter0000001', 'infraBE00000000001', 'TZMenuTreeFilter', 0, 'N', null, 'Y', 1),
  ('infraFilter0000002', 'infraBE00000000002', 'TZMenuNodeFilter', 0, 'N', null, 'Y', 1)
;

INSERT INTO `TZ_FILTER_FLD`(`ID`, `FILTER_ID`, `FIELD_ID`, `FIELD_DESC`, `SEQ`, `CONTROL_TYPE`, `TRANSFORM_CODE`, `PT_BENAME`, `PT_DEF_ID`, `FLD_READONLY`, `FLD_HIDE`, `FLD_ISDOWN`, `FIELD_TAG_CODE`, `COMMENTS`, `ACTIVE_FLG`, `MODIFICATION_NUM`) VALUES
  ('infraFltFld0000001', 'infraFilter0000001', 'infraField00000002', null, 1, 'string', null, null, null, 'N', 'N', 'N', 'TZMenuTree.Name', null, 'Y', 1),
  ('infraFltFld0000002', 'infraFilter0000001', 'infraField00000003', null, 2, 'string', null, null, null, 'N', 'N', 'N', 'TZMenuTree.Description', null, 'Y', 1),
  ('infraFltFld0000023', 'infraFilter0000002', 'infraField00000033', null, 1, 'string', null, null, null, 'N', 'N', 'N', 'TZMenuNode.Name', null, 'Y', 1),
  ('infraFltFld0000024', 'infraFilter0000002', 'infraField00000034', null, 2, 'string', null, null, null, 'N', 'N', 'N', 'TZMenuNode.Description', null, 'Y', 1),
  ('infraFltFld0000025', 'infraFilter0000002', 'infraField00000038', null, 3, 'transform', 'MenuNode_Type', null, null, 'N', 'N', 'Y', 'TZMenuNode.Type', null, 'Y', 1)
;

INSERT INTO `TZ_FILTERFLD_OPERATOR`(`ID`, `FILTER_FIELD_ID`, `OPERTOR`, `IS_ACTIVE`, `IS_DEF_OPRT`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('infraFldOpr0000001', 'infraFltFld0000001', '07', 'Y', 'Y', null, 1),
  ('infraFldOpr0000002', 'infraFltFld0000001', '01', 'Y', 'N', null, 1),
  ('infraFldOpr0000003', 'infraFltFld0000001', '02', 'Y', 'N', null, 1),
  ('infraFldOpr0000004', 'infraFltFld0000001', '08', 'Y', 'N', null, 1),
  ('infraFldOpr0000005', 'infraFltFld0000001', '09', 'Y', 'N', null, 1),
  ('infraFldOpr0000016', 'infraFltFld0000002', '07', 'Y', 'Y', null, 1),
  ('infraFldOpr0000017', 'infraFltFld0000002', '01', 'Y', 'N', null, 1),
  ('infraFldOpr0000018', 'infraFltFld0000002', '02', 'Y', 'N', null, 1),
  ('infraFldOpr0000019', 'infraFltFld0000002', '08', 'Y', 'N', null, 1),
  ('infraFldOpr0000020', 'infraFltFld0000002', '09', 'Y', 'N', null, 1),
  ('infraFldOpr0000131', 'infraFltFld0000023', '07', 'Y', 'Y', null, 1),
  ('infraFldOpr0000132', 'infraFltFld0000023', '01', 'Y', 'N', null, 1),
  ('infraFldOpr0000133', 'infraFltFld0000023', '02', 'Y', 'N', null, 1),
  ('infraFldOpr0000134', 'infraFltFld0000023', '08', 'Y', 'N', null, 1),
  ('infraFldOpr0000135', 'infraFltFld0000023', '09', 'Y', 'N', null, 1),
  ('infraFldOpr0000146', 'infraFltFld0000024', '07', 'Y', 'Y', null, 1),
  ('infraFldOpr0000147', 'infraFltFld0000024', '01', 'Y', 'N', null, 1),
  ('infraFldOpr0000148', 'infraFltFld0000024', '02', 'Y', 'N', null, 1),
  ('infraFldOpr0000149', 'infraFltFld0000024', '08', 'Y', 'N', null, 1),
  ('infraFldOpr0000150', 'infraFltFld0000024', '09', 'Y', 'N', null, 1),
  ('infraFldOpr0000161', 'infraFltFld0000025', '07', 'Y', 'Y', null, 1),
  ('infraFldOpr0000162', 'infraFltFld0000025', '01', 'Y', 'N', null, 1),
  ('infraFldOpr0000163', 'infraFltFld0000025', '02', 'Y', 'N', null, 1),
  ('infraFldOpr0000164', 'infraFltFld0000025', '08', 'Y', 'N', null, 1),
  ('infraFldOpr0000165', 'infraFltFld0000025', '09', 'Y', 'N', null, 1),
  ('infraFldOpr0000166', 'infraFltFld0000025', '10', 'Y', 'N', null, 1)
;

