delete from TZ_PAGEZONE_CONTENT where PAGEZONE_ID in (select ID from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('cmsBM0000000000001')));
delete from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('cmsBM0000000000001'));
delete from TZ_PAGE where BUSMODULE_ID in ('cmsBM0000000000001');

INSERT INTO `TZ_PAGE`(`ID`, `NAME`, `BUSMODULE_ID`, `TYPE`, `MODULE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmspage00000000001', 'TZOrgSiteListPage', 'cmsBM0000000000001', 'ListPage', 'cms', 'Y', null, 1),
  ('cmspage00000000002', 'TZOrgSiteDetailPage', 'cmsBM0000000000001', 'DetailPage', 'cms', 'Y', null, 1)
;

INSERT INTO `TZ_PAGE_ZONE`(`ID`, `NAME`, `PAGE_ID`, `TYPE`, `BE_NAME`, `DEFAULT_DISPFRAME_ID`, `DATASET_FLG`, `PAR_PAGEZONE_ID`, `SEQ`, `PERMISSION_ID`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `ACTIVE_FLG`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmspagezone0000001', 'TZOrgSiteListAdmin', 'cmspage00000000001', 'List', 'TZOrgSite', 'cmsDispFrame000002', 'N', null, 1, 'cmsPM0000000000001', 'TZOrgSite.TZOrgSite', null, 'Y', null, 1),
  ('cmspagezone0000002', 'TZOrgSiteFormAdmin', 'cmspage00000000002', 'Form', 'TZOrgSite', 'cmsDispFrame000001', 'N', null, 1, 'cmsPM0000000000001', 'TZOrgSite.TZOrgSite', null, 'Y', null, 1),
  ('cmspagezone0000003', 'TZSiteColuListAdmin', 'cmspage00000000002', 'List', 'TZSiteColu', 'cmsDispFrame000014', 'N', 'cmspagezone0000002', 2, 'cmsPM0000000000025', 'TZSiteColu.TZSiteColu', null, 'Y', null, 1),
  ('cmspagezone0000004', 'TZSiteTempListAdmin', 'cmspage00000000002', 'List', 'TZSiteTemp', 'cmsDispFrame000025', 'N', 'cmspagezone0000002', 3, 'cmsPM0000000000049', 'TZSiteTemp.TZSiteTemp', null, 'Y', null, 1)
;

