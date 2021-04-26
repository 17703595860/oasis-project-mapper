delete from TZ_DISPFRAME_FLDDRILLDOWN where DISPFRAME_DTL_ID in (select ID from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('cmsBE0000000000002')));
delete from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('cmsBE0000000000002'));
delete from TZ_DISPFRAME where BE_ID in ('cmsBE0000000000002');

INSERT INTO `TZ_DISPFRAME`(`ID`, `BE_ID`, `BE_NAME`, `DISPFRAME_NAME`, `TYPE`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `FILTER_DEF_ID`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsDispFrame000013', 'cmsBE0000000000002', 'TZSiteColu', 'TZSiteColuFormAdmin', 'Form', 'TZSiteColu.TZSiteColu', null, null, null, 1),
  ('cmsDispFrame000014', 'cmsBE0000000000002', 'TZSiteColu', 'TZSiteColuListAdmin', 'List', 'TZSiteColu.TZSiteColu', null, null, null, 1)
;

INSERT INTO `TZ_DISPFRAME_ELEMENT`(`ID`, `DISPFRAME_ID`, `NAME`, `TYPE`, `FIELD_ID`, `DATA_TYPE`, `TEXTLEN`, `PREC_NUM`, `SCALE`, `FLD_REQUIRED`, `CONTROL_TYPE`, `TRANSFORM_CODE`, `PT_BENAME`, `PT_DEF_ID`, `FLD_READONLY`, `FLD_HIDE`, `FLD_ISDOWN`, `FLD_DRILLDOWN`, `DRILLDOWN_SOURCE_ID`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `BUTTON_CODE`, `BUTTON_TRIGGER_FRAMEID`, `DISPLAY_ORDER`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsDispEl000000141', 'cmsDispFrame000013', 'Id', 'Field', 'cmsField0000000039', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.Id', null, null, null, 1, null, 1),
  ('cmsDispEl000000142', 'cmsDispFrame000013', 'SiteId', 'Field', 'cmsField0000000040', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.SiteId', null, null, null, 2, null, 1),
  ('cmsDispEl000000143', 'cmsDispFrame000013', 'Name', 'Field', 'cmsField0000000041', 'Varchar', 100, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.Name', null, null, null, 3, null, 1),
  ('cmsDispEl000000144', 'cmsDispFrame000013', 'ColuType', 'Field', 'cmsField0000000042', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_COLU_TYPE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColuType', null, null, null, 4, null, 1),
  ('cmsDispEl000000145', 'cmsDispFrame000013', 'ColuEnable', 'Field', 'cmsField0000000043', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_COLU_ENABLE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColuEnable', null, null, null, 5, null, 1),
  ('cmsDispEl000000146', 'cmsDispFrame000013', 'ColePath', 'Field', 'cmsField0000000044', 'Varchar', 255, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColePath', null, null, null, 6, null, 1),
  ('cmsDispEl000000147', 'cmsDispFrame000013', 'TempId', 'Field', 'cmsField0000000045', 'Varchar', 18, null, 0, 'Y', 'prompt', null, 'TZSiteTemp', null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.TempId', null, null, null, 7, null, 1),
  ('cmsDispEl000000148', 'cmsDispFrame000013', 'ArtTypeId', 'Field', 'cmsField0000000046', 'Varchar', 18, null, 0, 'N', 'prompt', null, 'TZArtAddType', null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ArtTypeId', null, null, null, 8, null, 1),
  ('cmsDispEl000000149', 'cmsDispFrame000013', 'FColuId', 'Field', 'cmsField0000000047', 'Varchar', 18, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.FColuId', null, null, null, 9, null, 1),
  ('cmsDispEl000000150', 'cmsDispFrame000013', 'ColuLevel', 'Field', 'cmsField0000000048', 'Number', 10, 10, 0, 'Y', 'number', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColuLevel', null, null, null, 10, null, 1),
  ('cmsDispEl000000151', 'cmsDispFrame000013', 'Comments', 'Field', 'cmsField0000000049', 'Varchar', 255, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.Comments', null, null, null, 11, null, 1),
  ('cmsDispEl000000152', 'cmsDispFrame000013', 'ModificationNumber', 'Field', 'cmsField0000000050', 'Number', null, null, null, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.ModificationNumber', null, null, null, 12, null, 1),
  ('cmsDispEl000000153', 'cmsDispFrame000013', 'Created', 'Field', 'cmsField0000000051', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'Y', 'N', 'N', 'N', null, 'TZSiteColu.Created', null, null, null, 13, null, 1),
  ('cmsDispEl000000154', 'cmsDispFrame000013', 'CreatedBy', 'Field', 'cmsField0000000052', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.CreatedBy', null, null, null, 14, null, 1),
  ('cmsDispEl000000155', 'cmsDispFrame000013', 'CreatedByName', 'Field', 'cmsField0000000053', 'Varchar', 255, null, null, 'Y', 'String', null, null, null, 'Y', 'N', 'N', 'N', null, 'TZSiteColu.CreatedByName', null, null, null, 15, null, 1),
  ('cmsDispEl000000156', 'cmsDispFrame000013', 'LastUpd', 'Field', 'cmsField0000000054', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.LastUpd', null, null, null, 16, null, 1),
  ('cmsDispEl000000157', 'cmsDispFrame000013', 'LastUpdBy', 'Field', 'cmsField0000000055', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.LastUpdBy', null, null, null, 17, null, 1),
  ('cmsDispEl000000158', 'cmsDispFrame000014', 'Id', 'Field', 'cmsField0000000039', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.Id', null, null, null, 1, null, 1),
  ('cmsDispEl000000159', 'cmsDispFrame000014', 'SiteId', 'Field', 'cmsField0000000040', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.SiteId', null, null, null, 2, null, 1),
  ('cmsDispEl000000160', 'cmsDispFrame000014', 'Name', 'Field', 'cmsField0000000041', 'Varchar', 100, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.Name', null, null, null, 3, null, 1),
  ('cmsDispEl000000161', 'cmsDispFrame000014', 'ColuType', 'Field', 'cmsField0000000042', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_COLU_TYPE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColuType', null, null, null, 4, null, 1),
  ('cmsDispEl000000162', 'cmsDispFrame000014', 'ColuEnable', 'Field', 'cmsField0000000043', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_COLU_ENABLE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColuEnable', null, null, null, 5, null, 1),
  ('cmsDispEl000000163', 'cmsDispFrame000014', 'ColePath', 'Field', 'cmsField0000000044', 'Varchar', 255, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColePath', null, null, null, 6, null, 1),
  ('cmsDispEl000000164', 'cmsDispFrame000014', 'TempId', 'Field', 'cmsField0000000045', 'Varchar', 18, null, 0, 'Y', 'prompt', null, 'TZSiteTemp', null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.TempId', null, null, null, 7, null, 1),
  ('cmsDispEl000000165', 'cmsDispFrame000014', 'ArtTypeId', 'Field', 'cmsField0000000046', 'Varchar', 18, null, 0, 'N', 'prompt', null, 'TZArtAddType', null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ArtTypeId', null, null, null, 8, null, 1),
  ('cmsDispEl000000166', 'cmsDispFrame000014', 'FColuId', 'Field', 'cmsField0000000047', 'Varchar', 18, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.FColuId', null, null, null, 9, null, 1),
  ('cmsDispEl000000167', 'cmsDispFrame000014', 'ColuLevel', 'Field', 'cmsField0000000048', 'Number', 10, 10, 0, 'Y', 'number', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.ColuLevel', null, null, null, 10, null, 1),
  ('cmsDispEl000000168', 'cmsDispFrame000014', 'Comments', 'Field', 'cmsField0000000049', 'Varchar', 255, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteColu.Comments', null, null, null, 11, null, 1),
  ('cmsDispEl000000169', 'cmsDispFrame000014', 'ModificationNumber', 'Field', 'cmsField0000000050', 'Number', null, null, null, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.ModificationNumber', null, null, null, 12, null, 1),
  ('cmsDispEl000000170', 'cmsDispFrame000014', 'Created', 'Field', 'cmsField0000000051', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.Created', null, null, null, 13, null, 1),
  ('cmsDispEl000000171', 'cmsDispFrame000014', 'CreatedBy', 'Field', 'cmsField0000000052', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.CreatedBy', null, null, null, 14, null, 1),
  ('cmsDispEl000000172', 'cmsDispFrame000014', 'CreatedByName', 'Field', 'cmsField0000000053', 'Varchar', 255, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.CreatedByName', null, null, null, 15, null, 1),
  ('cmsDispEl000000173', 'cmsDispFrame000014', 'LastUpd', 'Field', 'cmsField0000000054', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.LastUpd', null, null, null, 16, null, 1),
  ('cmsDispEl000000174', 'cmsDispFrame000014', 'LastUpdBy', 'Field', 'cmsField0000000055', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteColu.LastUpdBy', null, null, null, 17, null, 1),
  ('cmsDispEl000000175', 'cmsDispFrame000014', 'add', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'add', 'cmsDispFrame000013', null, null, 0),
  ('cmsDispEl000000176', 'cmsDispFrame000014', 'edit', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'edit', 'cmsDispFrame000013', null, null, 0),
  ('cmsDispEl000000177', 'cmsDispFrame000014', 'del', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'del', null, null, null, 0),
  ('cmsDispEl000000178', 'cmsDispFrame000014', 'query', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'query', 'cmsFilter000000002', null, null, 0)
;

