delete from TZ_PAGEZONE_CONTENT where PAGEZONE_ID in (select ID from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('cmsBM1100000000001')));
delete from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('cmsBM1100000000001'));
delete from TZ_PAGE where BUSMODULE_ID in ('cmsBM1100000000001');

INSERT INTO `TZ_PAGE`(`ID`, `NAME`, `BUSMODULE_ID`, `TYPE`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmspage11000000001', 'TZArtAddTypeListPage', 'cmsBM1100000000001', 'ListPage', 'cms', 'Y', null, 1),
  ('cmspage11000000002', 'TZArtAddTypeDetailPage', 'cmsBM1100000000001', 'DetailPage', 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_PAGE_ZONE`(`ID`, `NAME`, `PAGE_ID`, `TYPE`, `BE_NAME`, `DEFAULT_DISPFRAME_ID`, `DATASET_FLG`, `PAR_PAGEZONE_ID`, `SEQ`, `PERMISSION_ID`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmspagezone1100001', 'TZArtAddTypeListAdmin', 'cmspage11000000001', 'List', 'TZArtAddType', 'cmsDispFrame110002', 'N', null, 1, 'cmsPM1100000000001', 'TZArtAddType.TZArtAddType', null, 'Y', null, 1),
  ('cmspagezone1100002', 'TZArtAddTypeFormAdmin', 'cmspage11000000002', 'Form', 'TZArtAddType', 'cmsDispFrame110001', 'N', null, 1, 'cmsPM1100000000001', 'TZArtAddType.TZArtAddType', null, 'Y', null, 1),
  ('cmspagezone1100003', 'TZArtAddTypeFieldListAdmin', 'cmspage11000000002', 'List', 'TZArtAddTypeField', 'cmsDispFrame110024', 'N', 'cmspagezone1100002', 2, 'cmsPM1100000000025', 'TZArtAddTypeField.TZArtAddTypeField', null, 'Y', null, 1)
;

