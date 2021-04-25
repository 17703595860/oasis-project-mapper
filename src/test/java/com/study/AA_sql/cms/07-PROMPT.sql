delete from TZ_PT_FIELD_DEF where PT_DEF_ID in ('cmsPMGroup00000001', 'cmsPMGroup00000002');
delete from TZ_PT_DEF where ID in ('cmsPMGroup00000001', 'cmsPMGroup00000002');

INSERT INTO `TZ_PT_DEF`(`ID`, `MODIFICATION_NUM`, `COMMENTS`, `NAME`, `BE_ID`, `SEARCHSPEC`, `DATASET_ID`, `LABEL_FIELD`, `VALUE_FIELD`) VALUES
  ('cmsPMGroup00000001', 1, null, 'siteTempIdPrompt', 'cmsBE0000000000003', null, null, 'cmsField0000000078', 'cmsField0000000076'),
  ('cmsPMGroup00000002', 1, null, 'tzArtTypeIdPrompt', 'cmsBE1100000000001', null, null, 'cmsField1100000002', 'cmsField1100000001')
;

INSERT INTO `TZ_PT_FIELD_DEF`(`ID`, `MODIFICATION_NUM`, `COMMENTS`, `PT_DEF_ID`, `FIELD_ID`, `TYPE`, `DISPLAY_FLG`, `DISPLAY_ORDER`, `DISPLAY_NAME`, `TAG_CODE`, `SEARCH_FLG`, `CONTROL_TYPE`, `TRANSFORM_CODE`) VALUES
  ('cmsPM0000000000001', 1, null, 'cmsPMGroup00000001', 'cmsField0000000076', 'normal', 'N', 1, null, 'TZSiteTemp.Id', 'N', 'string', null),
  ('cmsPM0000000000002', 1, null, 'cmsPMGroup00000001', 'cmsField0000000078', 'normal', 'Y', 2, null, 'TZSiteTemp.Name', 'Y', 'string', null),
  ('cmsPM0000000000003', 1, null, 'cmsPMGroup00000001', 'cmsField0000000079', 'normal', 'Y', 3, null, 'TZSiteTemp.TempType', 'Y', 'transform', 'SITE_TEMP_TYPE'),
  ('cmsPM0000000000014', 1, null, 'cmsPMGroup00000002', 'cmsField1100000001', 'normal', 'N', 1, null, 'TZArtAddType.Id', 'N', 'string', null),
  ('cmsPM0000000000015', 1, null, 'cmsPMGroup00000002', 'cmsField1100000002', 'normal', 'Y', 2, null, 'TZArtAddType.Name', 'Y', 'string', null)
;

