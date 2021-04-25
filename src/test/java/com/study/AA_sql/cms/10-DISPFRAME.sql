delete from TZ_DISPFRAME_FLDDRILLDOWN where DISPFRAME_DTL_ID in (select ID from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('cmsBE0000000000003')));
delete from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('cmsBE0000000000003'));
delete from TZ_DISPFRAME where BE_ID in ('cmsBE0000000000003');

INSERT INTO `TZ_DISPFRAME`(`ID`, `BE_ID`, `BE_NAME`, `DISPFRAME_NAME`, `TYPE`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `FILTER_DEF_ID`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsDispFrame000024', 'cmsBE0000000000003', 'TZSiteTemp', 'TZSiteTempFormAdmin', 'Form', 'TZSiteTemp.TZSiteTemp', null, null, null, 1),
  ('cmsDispFrame000025', 'cmsBE0000000000003', 'TZSiteTemp', 'TZSiteTempListAdmin', 'List', 'TZSiteTemp.TZSiteTemp', null, null, null, 1)
;

INSERT INTO `TZ_DISPFRAME_ELEMENT`(`ID`, `DISPFRAME_ID`, `NAME`, `TYPE`, `FIELD_ID`, `DATA_TYPE`, `TEXTLEN`, `PREC_NUM`, `SCALE`, `FLD_REQUIRED`, `CONTROL_TYPE`, `TRANSFORM_CODE`, `PT_BENAME`, `PT_DEF_ID`, `FLD_READONLY`, `FLD_HIDE`, `FLD_ISDOWN`, `FLD_DRILLDOWN`, `DRILLDOWN_SOURCE_ID`, `LABEL_MESSAGE_CODE`, `LABEL_OVERRIDE`, `BUTTON_CODE`, `BUTTON_TRIGGER_FRAMEID`, `DISPLAY_ORDER`, `COMMENTS`, `MODIFICATION_NUM`) VALUES
  ('cmsDispEl000000279', 'cmsDispFrame000024', 'Id', 'Field', 'cmsField0000000076', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.Id', null, null, null, 1, null, 1),
  ('cmsDispEl000000280', 'cmsDispFrame000024', 'SiteId', 'Field', 'cmsField0000000077', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.SiteId', null, null, null, 2, null, 1),
  ('cmsDispEl000000281', 'cmsDispFrame000024', 'Name', 'Field', 'cmsField0000000078', 'Varchar', 100, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.Name', null, null, null, 3, null, 1),
  ('cmsDispEl000000282', 'cmsDispFrame000024', 'TempType', 'Field', 'cmsField0000000079', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_TEMP_TYPE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TempType', null, null, null, 4, null, 1),
  ('cmsDispEl000000283', 'cmsDispFrame000024', 'TempEnable', 'Field', 'cmsField0000000080', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_TEMP_ENABLE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TempEnable', null, null, null, 5, null, 1),
  ('cmsDispEl000000284', 'cmsDispFrame000024', 'TzTempPccode', 'Field', 'cmsField0000000081', 'Varchar', 536870911, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TzTempPccode', null, null, null, 6, null, 1),
  ('cmsDispEl000000285', 'cmsDispFrame000024', 'TzTempMscode', 'Field', 'cmsField0000000082', 'Varchar', 536870911, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TzTempMscode', null, null, null, 7, null, 1),
  ('cmsDispEl000000286', 'cmsDispFrame000024', 'Comments', 'Field', 'cmsField0000000083', 'Varchar', 255, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.Comments', null, null, null, 8, null, 1),
  ('cmsDispEl000000287', 'cmsDispFrame000024', 'ModificationNumber', 'Field', 'cmsField0000000084', 'Number', null, null, null, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.ModificationNumber', null, null, null, 9, null, 1),
  ('cmsDispEl000000288', 'cmsDispFrame000024', 'Created', 'Field', 'cmsField0000000085', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'Y', 'N', 'N', 'N', null, 'TZSiteTemp.Created', null, null, null, 10, null, 1),
  ('cmsDispEl000000289', 'cmsDispFrame000024', 'CreatedBy', 'Field', 'cmsField0000000086', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.CreatedBy', null, null, null, 11, null, 1),
  ('cmsDispEl000000290', 'cmsDispFrame000024', 'CreatedByName', 'Field', 'cmsField0000000087', 'Varchar', 255, null, null, 'Y', 'String', null, null, null, 'Y', 'N', 'N', 'N', null, 'TZSiteTemp.CreatedByName', null, null, null, 12, null, 1),
  ('cmsDispEl000000291', 'cmsDispFrame000024', 'LastUpd', 'Field', 'cmsField0000000088', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.LastUpd', null, null, null, 13, null, 1),
  ('cmsDispEl000000292', 'cmsDispFrame000024', 'LastUpdBy', 'Field', 'cmsField0000000089', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.LastUpdBy', null, null, null, 14, null, 1),
  ('cmsDispEl000000293', 'cmsDispFrame000025', 'Id', 'Field', 'cmsField0000000076', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.Id', null, null, null, 1, null, 1),
  ('cmsDispEl000000294', 'cmsDispFrame000025', 'SiteId', 'Field', 'cmsField0000000077', 'Varchar', 18, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.SiteId', null, null, null, 2, null, 1),
  ('cmsDispEl000000295', 'cmsDispFrame000025', 'Name', 'Field', 'cmsField0000000078', 'Varchar', 100, null, 0, 'Y', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.Name', null, null, null, 3, null, 1),
  ('cmsDispEl000000296', 'cmsDispFrame000025', 'TempType', 'Field', 'cmsField0000000079', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_TEMP_TYPE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TempType', null, null, null, 4, null, 1),
  ('cmsDispEl000000297', 'cmsDispFrame000025', 'TempEnable', 'Field', 'cmsField0000000080', 'Varchar', 1, null, 0, 'Y', 'transform', 'SITE_TEMP_ENABLE', null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TempEnable', null, null, null, 5, null, 1),
  ('cmsDispEl000000298', 'cmsDispFrame000025', 'TzTempPccode', 'Field', 'cmsField0000000081', 'Varchar', 536870911, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TzTempPccode', null, null, null, 6, null, 1),
  ('cmsDispEl000000299', 'cmsDispFrame000025', 'TzTempMscode', 'Field', 'cmsField0000000082', 'Varchar', 536870911, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.TzTempMscode', null, null, null, 7, null, 1),
  ('cmsDispEl000000300', 'cmsDispFrame000025', 'Comments', 'Field', 'cmsField0000000083', 'Varchar', 255, null, 0, 'N', 'string', null, null, null, 'N', 'N', 'N', 'N', null, 'TZSiteTemp.Comments', null, null, null, 8, null, 1),
  ('cmsDispEl000000301', 'cmsDispFrame000025', 'ModificationNumber', 'Field', 'cmsField0000000084', 'Number', null, null, null, 'Y', 'string', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.ModificationNumber', null, null, null, 9, null, 1),
  ('cmsDispEl000000302', 'cmsDispFrame000025', 'Created', 'Field', 'cmsField0000000085', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.Created', null, null, null, 10, null, 1),
  ('cmsDispEl000000303', 'cmsDispFrame000025', 'CreatedBy', 'Field', 'cmsField0000000086', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.CreatedBy', null, null, null, 11, null, 1),
  ('cmsDispEl000000304', 'cmsDispFrame000025', 'CreatedByName', 'Field', 'cmsField0000000087', 'Varchar', 255, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.CreatedByName', null, null, null, 12, null, 1),
  ('cmsDispEl000000305', 'cmsDispFrame000025', 'LastUpd', 'Field', 'cmsField0000000088', 'DateTime', null, null, null, 'Y', 'datetime', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.LastUpd', null, null, null, 13, null, 1),
  ('cmsDispEl000000306', 'cmsDispFrame000025', 'LastUpdBy', 'Field', 'cmsField0000000089', 'Varchar', 18, null, null, 'Y', 'String', null, null, null, 'N', 'Y', 'N', 'N', null, 'TZSiteTemp.LastUpdBy', null, null, null, 14, null, 1),
  ('cmsDispEl000000307', 'cmsDispFrame000025', 'add', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'add', 'cmsDispFrame000024', null, null, 0),
  ('cmsDispEl000000308', 'cmsDispFrame000025', 'edit', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'edit', 'cmsDispFrame000024', null, null, 0),
  ('cmsDispEl000000309', 'cmsDispFrame000025', 'del', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'del', null, null, null, 0),
  ('cmsDispEl000000310', 'cmsDispFrame000025', 'query', 'Button', null, null, null, null, null, 'N', null, null, null, null, null, null, null, null, null, null, null, 'query', 'cmsFilter000000003', null, null, 0)
;

