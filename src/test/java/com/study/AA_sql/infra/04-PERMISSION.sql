delete from TZ_PERMISSION where GROUP_ID in ('infraPMGroup000001');
delete from TZ_PERMISSION_GROUP where ID in ('infraPMGroup000001');

INSERT INTO `TZ_PERMISSION_GROUP`(`ID`, `NAME`, `DESCRIPTION`, `MODIFICATION_NUM`) VALUES
  ('infraPMGroup000001', 'infra', '组件模块', 1)
;

INSERT INTO `TZ_PERMISSION`(`ID`, `GROUP_ID`, `NAME`, `CODE`, `ACTION`, `WEB_ONLY`, `MODIFICATION_NUM`, `DESCRIPTION`) VALUES
  ('infraPM00000000001', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:查看', 'TZMenuTree:TZMenuTree:retrieve', 'retrieve', 0, 1, ''),
  ('infraPM00000000002', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:新增', 'TZMenuTree:TZMenuTree:create', 'create', 0, 1, ''),
  ('infraPM00000000003', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:修改', 'TZMenuTree:TZMenuTree:update', 'update', 0, 1, ''),
  ('infraPM00000000004', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:删除', 'TZMenuTree:TZMenuTree:delete', 'delete', 0, 1, ''),
  ('infraPM00000000025', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:TZMenuNode:查看', 'TZMenuTree:TZMenuTree:TZMenuNode:retrieve', 'retrieve', 0, 1, ''),
  ('infraPM00000000026', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:TZMenuNode:新增', 'TZMenuTree:TZMenuTree:TZMenuNode:create', 'create', 0, 1, ''),
  ('infraPM00000000027', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:TZMenuNode:修改', 'TZMenuTree:TZMenuTree:TZMenuNode:update', 'update', 0, 1, ''),
  ('infraPM00000000028', 'infraPMGroup000001', 'TZMenuTree:TZMenuTree:TZMenuNode:删除', 'TZMenuTree:TZMenuTree:TZMenuNode:delete', 'delete', 0, 1, '')
;

