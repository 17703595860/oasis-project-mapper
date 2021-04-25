delete from TZ_PERMISSION where GROUP_ID in ('cmsPMGroup00000001');
delete from TZ_PERMISSION_GROUP where ID in ('cmsPMGroup00000001');

INSERT INTO `TZ_PERMISSION_GROUP`(`ID`, `NAME`, `DESCRIPTION`, `MODIFICATION_NUM`) VALUES
  ('cmsPMGroup00000001', 'cms', '站点模块', 1)
;

INSERT INTO `TZ_PERMISSION`(`ID`, `GROUP_ID`, `NAME`, `CODE`, `ACTION`, `WEB_ONLY`, `MODIFICATION_NUM`, `DESCRIPTION`) VALUES
  ('cmsPM0000000000001', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:查看', 'TZOrgSite:TZOrgSite:retrieve', 'retrieve', 0, 1, ''),
  ('cmsPM0000000000002', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:新增', 'TZOrgSite:TZOrgSite:create', 'create', 0, 1, ''),
  ('cmsPM0000000000003', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:修改', 'TZOrgSite:TZOrgSite:update', 'update', 0, 1, ''),
  ('cmsPM0000000000004', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:删除', 'TZOrgSite:TZOrgSite:delete', 'delete', 0, 1, ''),
  ('cmsPM0000000000025', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteColu:查看', 'TZOrgSite:TZOrgSite:TZSiteColu:retrieve', 'retrieve', 0, 1, ''),
  ('cmsPM0000000000026', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteColu:新增', 'TZOrgSite:TZOrgSite:TZSiteColu:create', 'create', 0, 1, ''),
  ('cmsPM0000000000027', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteColu:修改', 'TZOrgSite:TZOrgSite:TZSiteColu:update', 'update', 0, 1, ''),
  ('cmsPM0000000000028', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteColu:删除', 'TZOrgSite:TZOrgSite:TZSiteColu:delete', 'delete', 0, 1, ''),
  ('cmsPM0000000000049', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteTemp:查看', 'TZOrgSite:TZOrgSite:TZSiteTemp:retrieve', 'retrieve', 0, 1, ''),
  ('cmsPM0000000000050', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteTemp:新增', 'TZOrgSite:TZOrgSite:TZSiteTemp:create', 'create', 0, 1, ''),
  ('cmsPM0000000000051', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteTemp:修改', 'TZOrgSite:TZOrgSite:TZSiteTemp:update', 'update', 0, 1, ''),
  ('cmsPM0000000000052', 'cmsPMGroup00000001', 'TZOrgSite:TZOrgSite:TZSiteTemp:删除', 'TZOrgSite:TZOrgSite:TZSiteTemp:delete', 'delete', 0, 1, '')
;

