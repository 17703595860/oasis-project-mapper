delete from TZ_PT_FIELD_DEF where PT_DEF_ID in ('infraPMGroup000001');
delete from TZ_PT_DEF where ID in ('infraPMGroup000001');

INSERT INTO `TZ_PT_DEF`(`ID`, `MODIFICATION_NUM`, `COMMENTS`, `NAME`, `BE_ID`, `SEARCHSPEC`, `DATASET_ID`, `LABEL_FIELD`, `VALUE_FIELD`) VALUES
  ('infraPMGroup000001', 1, null, 'permissionIdPrompt', 'SecurityBE00050001', null, null, 'SecurityField50004', 'SecurityField50001')
;

INSERT INTO `TZ_PT_FIELD_DEF`(`ID`, `MODIFICATION_NUM`, `COMMENTS`, `PT_DEF_ID`, `FIELD_ID`, `TYPE`, `DISPLAY_FLG`, `DISPLAY_ORDER`, `DISPLAY_NAME`, `TAG_CODE`, `SEARCH_FLG`, `CONTROL_TYPE`, `TRANSFORM_CODE`) VALUES
  ('infraPM00000000001', 1, null, 'infraPMGroup000001', 'SecurityField50001', 'normal', 'N', 1, null, 'TZPermission.Id', 'N', null, null),
  ('infraPM00000000002', 1, null, 'infraPMGroup000001', 'SecurityField50003', 'normal', 'Y', 2, null, 'TZPermission.Name', 'Y', null, null)
;

