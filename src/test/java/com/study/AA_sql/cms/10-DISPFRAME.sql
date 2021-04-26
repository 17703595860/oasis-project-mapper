delete from TZ_DISPFRAME_FLDDRILLDOWN where DISPFRAME_DTL_ID in (select ID from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('cmsBE1100000000002')));
delete from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('cmsBE1100000000002'));
delete from TZ_DISPFRAME where BE_ID in ('cmsBE1100000000002');

INSERT INTO `TZ_DISPFRAME`(`ID`, `BE_ID`, `BE_NAME`, `DISPFRAME_NAME`, `TYPE`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `FILTER_DEF_ID`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsDispFrame110023', 'cmsBE1100000000002', 'TZArtAddTypeField', 'TZArtAddTypeFieldFormAdmin', 'Form', 'TZArtAddTypeField.TZArtAddTypeField', null, null, null, 1),
  ('cmsDispFrame110024', 'cmsBE1100000000002', 'TZArtAddTypeField', 'TZArtAddTypeFieldListAdmin', 'List', 'TZArtAddTypeField.TZArtAddTypeField', null, null, null, 1)
;

INSERT INTO `TZ_DISPFRAME_ELEMENT`(`ID`, `DISPFRAME_ID`, `NAME`, `TYPE`, `FIELD_ID`, `DATA_TYPE`, `TEXTLEN`, `PREC_NUM`, `SCALE`, `FLD_REQUIRED`, `CONTROL_TYPE`, `TRANSFORM_CODE`, `PT_BENAME`, `PT_DEF_ID`, `FLD_READONLY`, `FLD_HIDE`, `FLD_ISDOWN`, `FLD_DRILLDOWN`, `DRILLDOWN_SOURCE_ID`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `BUTTON_CODE`, `BUTTON_TRIGGER_FRAMEID`, `DISPLAY_ORDER`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsDispEl110000125', 'cmsDispFrame110023', 'Id', 'Field', 'cmsField1100000031', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.Id', null, null, null, 1, null, 1),
  ('cmsDispEl110000126', 'cmsDispFrame110023', 'TypeId', 'Field', 'cmsField1100000032', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.TypeId', null, null, null, 2, null, 1),
  ('cmsDispEl110000127', 'cmsDispFrame110023', 'FieldValue', 'Field', 'cmsField1100000033', 'Varchar', 10, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.FieldValue', null, null, null, 3, null, 1),
  ('cmsDispEl110000128', 'cmsDispFrame110023', 'FieldDesc', 'Field', 'cmsField1100000034', 'Varchar', 255, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.FieldDesc', null, null, null, 4, null, 1),
  ('cmsDispEl110000129', 'cmsDispFrame110023', 'Seq', 'Field', 'cmsField1100000035', 'Number', 10, 10, 0, 'Y', 'number', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.Seq', null, null, null, 5, null, 1),
  ('cmsDispEl110000130', 'cmsDispFrame110023', 'FieldEnable', 'Field', 'cmsField1100000036', 'Varchar', 1, null, 0, 'Y', 'transform', 'ART_TYPE_FIELD_ENABLE', null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.FieldEnable', null, null, null, 6, null, 1),
  ('cmsDispEl110000131', 'cmsDispFrame110023', 'Comments', 'Field', 'cmsField1100000037', 'Varchar', 255, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.Comments', null, null, null, 7, null, 1),
  ('cmsDispEl110000132', 'cmsDispFrame110023', 'ModificationNumber', 'Field', 'cmsField1100000038', 'Number', null, null, null, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.ModificationNumber', null, null, null, 8, null, 1),
  ('cmsDispEl110000133', 'cmsDispFrame110023', 'Created', 'Field', 'cmsField1100000039', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'Y', 'N', 'N', 'N', null, 'TZArtAddTypeField.Created', null, null, null, 9, null, 1),
  ('cmsDispEl110000134', 'cmsDispFrame110023', 'CreatedBy', 'Field', 'cmsField1100000040', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.CreatedBy', null, null, null, 10, null, 1),
  ('cmsDispEl110000135', 'cmsDispFrame110023', 'CreatedByName', 'Field', 'cmsField1100000041', 'Varchar', 255, null, null, 'Y', 'String', null, null, null, 'Y', 'N', 'N', 'N', null, 'TZArtAddTypeField.CreatedByName', null, null, null, 11, null, 1),
  ('cmsDispEl110000136', 'cmsDispFrame110023', 'LastUpd', 'Field', 'cmsField1100000042', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.LastUpd', null, null, null, 12, null, 1),
  ('cmsDispEl110000137', 'cmsDispFrame110023', 'LastUpdBy', 'Field', 'cmsField1100000043', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.LastUpdBy', null, null, null, 13, null, 1),
  ('cmsDispEl110000138', 'cmsDispFrame110024', 'Id', 'Field', 'cmsField1100000031', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.Id', null, null, null, 1, null, 1),
  ('cmsDispEl110000139', 'cmsDispFrame110024', 'TypeId', 'Field', 'cmsField1100000032', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.TypeId', null, null, null, 2, null, 1),
  ('cmsDispEl110000140', 'cmsDispFrame110024', 'FieldValue', 'Field', 'cmsField1100000033', 'Varchar', 10, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.FieldValue', null, null, null, 3, null, 1),
  ('cmsDispEl110000141', 'cmsDispFrame110024', 'FieldDesc', 'Field', 'cmsField1100000034', 'Varchar', 255, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.FieldDesc', null, null, null, 4, null, 1),
  ('cmsDispEl110000142', 'cmsDispFrame110024', 'Seq', 'Field', 'cmsField1100000035', 'Number', 10, 10, 0, 'Y', 'number', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.Seq', null, null, null, 5, null, 1),
  ('cmsDispEl110000143', 'cmsDispFrame110024', 'FieldEnable', 'Field', 'cmsField1100000036', 'Varchar', 1, null, 0, 'Y', 'transform', 'ART_TYPE_FIELD_ENABLE', null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.FieldEnable', null, null, null, 6, null, 1),
  ('cmsDispEl110000144', 'cmsDispFrame110024', 'Comments', 'Field', 'cmsField1100000037', 'Varchar', 255, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZArtAddTypeField.Comments', null, null, null, 7, null, 1),
  ('cmsDispEl110000145', 'cmsDispFrame110024', 'ModificationNumber', 'Field', 'cmsField1100000038', 'Number', null, null, null, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.ModificationNumber', null, null, null, 8, null, 1),
  ('cmsDispEl110000146', 'cmsDispFrame110024', 'Created', 'Field', 'cmsField1100000039', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.Created', null, null, null, 9, null, 1),
  ('cmsDispEl110000147', 'cmsDispFrame110024', 'CreatedBy', 'Field', 'cmsField1100000040', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.CreatedBy', null, null, null, 10, null, 1),
  ('cmsDispEl110000148', 'cmsDispFrame110024', 'CreatedByName', 'Field', 'cmsField1100000041', 'Varchar', 255, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.CreatedByName', null, null, null, 11, null, 1),
  ('cmsDispEl110000149', 'cmsDispFrame110024', 'LastUpd', 'Field', 'cmsField1100000042', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.LastUpd', null, null, null, 12, null, 1),
  ('cmsDispEl110000150', 'cmsDispFrame110024', 'LastUpdBy', 'Field', 'cmsField1100000043', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZArtAddTypeField.LastUpdBy', null, null, null, 13, null, 1),
  ('cmsDispEl110000151', 'cmsDispFrame110024', 'add', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'add', 'cmsDispFrame110023', null, null, 0),
  ('cmsDispEl110000152', 'cmsDispFrame110024', 'edit', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'edit', 'cmsDispFrame110023', null, null, 0),
  ('cmsDispEl110000153', 'cmsDispFrame110024', 'del', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'del', null, null, null, 0),
  ('cmsDispEl110000154', 'cmsDispFrame110024', 'query', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'query', 'cmsFilter110000002', null, null, 0)
;

