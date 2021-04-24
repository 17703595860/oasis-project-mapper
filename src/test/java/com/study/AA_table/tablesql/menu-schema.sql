-- TZ_MENU_TREE
DROP TABLE IF EXISTS TZ_MENU_TREE;
CREATE TABLE TZ_MENU_TREE (
  `ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL PRIMARY KEY COMMENT '主键id,雪花算法',
  `NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '菜单树名称',
  `DESCRIPTION` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '菜单树描述',
  `ORG_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '机构,机构id',
  `MODIFICATION_NUM` int NOT NULL DEFAULT '0' COMMENT '修改记录号',
  `CREATED_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '创建人',
  `CREATED` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `LAST_UPD_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '更新人',
  `LAST_UPD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='菜单树';


-- TZ_MENU_NODE
DROP TABLE IF EXISTS TZ_MENU_NODE;
CREATE TABLE TZ_MENU_NODE (
  `ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL PRIMARY KEY COMMENT '主键,雪花算法',
  `TREE_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '菜单树,菜单树id',
  `NAME` varchar(255) CHARACTER SET ascii COLLATE ascii_general_ci NOT NULL COMMENT '菜单节点名称,英文字母',
  `DESCRIPTION` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述',
  `PARENT_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0' COMMENT '父节点,父节点id',
  `SEQUENCE` smallint unsigned NOT NULL DEFAULT 1 COMMENT '排序字段,无符号',
  `HIDDEN` tinyint unsigned NOT NULL DEFAULT 0 COMMENT '是否隐藏,1隐藏，0不隐藏，无符号',
  `TYPE` tinyint unsigned NOT NULL COMMENT '节点类型,节点类型，0目录，1菜单，2外链，无符号',
  `PATH` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '菜单路径,菜单路径，类型为1菜单时填写',
  `URL` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '外链url,外链url，如果为外部链接填写',
  `COMPONENT_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '菜单组件,菜单组件id，类型为1菜单时填写',
  `TITLE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标题',
  `TITLE_KEY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'TitleKey',
  `ICON` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '图标',
  `VARIABLES` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '变量',
  `PERMISSION_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '权限,权限id',
  `SITE_COLU_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '栏目,栏目ID',
  `SITE_TEMP_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '模板,模板id',
  `MODIFICATION_NUM` int NOT NULL DEFAULT '0' COMMENT '修改记录号',
  `CREATED_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '创建人',
  `CREATED` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `LAST_UPD_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '更新人',
  `LAST_UPD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='菜单节点';


-- TZ_COMPONENT
DROP TABLE IF EXISTS TZ_COMPONENT;
CREATE TABLE TZ_COMPONENT (
  `ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL PRIMARY KEY COMMENT '主键,雪花算法',
  `NAME` varchar(255) CHARACTER SET ascii COLLATE ascii_general_ci NOT NULL COMMENT '文件名称,英文字母',
  `DESCRIPTION` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述',
  `PATH` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '菜单路径',
  `TITLE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标题',
  `TITLE_KEY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'TitleKey',
  `ICON` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '图标',
  `VARIABLES` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '变量',
  `PERMISSION_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '权限,权限id',
  `PAGE_ID` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'Page,PageId',
  `MODIFICATION_NUM` int NOT NULL DEFAULT '0' COMMENT '修改记录号',
  `CREATED_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '创建人',
  `CREATED` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `LAST_UPD_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '更新人',
  `LAST_UPD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='菜单组件';

