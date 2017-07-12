create table hfsec_organize(
   hfsec_organize_id bigint(12) primary key auto_increment not null comment '组织id',
   hfsec_organize_code varchar(64) not null comment '组织编码',
   hfsec_organize_name varchar(128) not null comment '组织名称',
   hfsec_organize_type tinyint(4) comment '组织类型',
   hfsec_organize_level tinyint(4) comment '组织级别',
   parent_hfsec_organize_id bigint(12) comment '上级组织id',
   status tinyint(4) comment '状态',
   creator_id bigint(12) comment '创建人',
   create_time datetime comment '创建时间',
   modifier_id bigint(12) comment '修改人',
   modify_time datetime comment '修改时间') comment '组织';

create table hfsec_role(
   hfsec_role_id bigint(12) primary key auto_increment not null comment '角色id',
   hfsec_role_code varchar(64) not null comment '角色编码',
   hfsec_role_name varchar(128) not null comment '角色名称',
   hfsec_role_type tinyint(4) comment '角色类型',
   status tinyint(4) comment '状态',
   creator_id bigint(12) comment '创建人',
   create_time datetime comment '创建时间',
   modifier_id bigint(12) comment '修改人',
   modify_time datetime comment '修改时间') comment '角色';

create table hfsec_role_authorize(
   hfsec_role_authorize_id bigint(12) primary key auto_increment not null comment '角色授权id',
   hfsec_role_authorize_type tinyint(4) comment '角色授权类型',
   hfsec_role_id bigint(12) not null comment '角色id',
   hfsec_menu_id bigint(20) comment '菜单ID',
   status tinyint(4) comment '状态',
   creator_id bigint(12) comment '创建人',
   create_time datetime comment '创建时间',
   modifier_id bigint(12) comment '修改人',
   modify_time datetime comment '修改时间') comment '角色授权';

create table hfsec_user(
   hfsec_user_id bigint primary key auto_increment comment '用户ID',
   hfsec_user_name varchar(64) comment '用户名称',
   account varchar(64) comment '用户账号',
   password varchar(128) comment '用户密码',
   gender int(2) comment '性别',
   mobile varchar(6) comment '手机号',
   email int(2) comment '邮箱',
   addr int(2) comment '地址',
   avatar varchar(512) comment '头像',
   last_login_time datetime comment '上次登录时间',
   status int(2) comment '状态',
   hfsec_organize_id bigint(20) not null comment '组织ID',
   creator_id bigint comment '创建人',
   create_time datetime comment '创建时间',
   modifier_id bigint comment '修改人',
   modify_time datetime comment '修改时间',
   del_flag int(2) comment '删除标识') comment '用户';

create table hfsec_user_authorize(
   hfsec_user_authorize_id bigint(12) primary key auto_increment not null comment '用户授权id',
   hfsec_user_id bigint(20) comment '用户ID',
   hfsec_organize_id bigint(12) not null comment '组织id',
   hfsec_role_id bigint(12) not null comment '角色id',
   status tinyint(4) comment '状态',
   creator_id bigint(12) comment '创建人',
   create_time datetime comment '创建时间',
   modifier_id bigint(12) comment '修改人',
   modify_time datetime comment '修改时间') comment '用户授权';

create table hfsec_menu(
   hfsec_menu_id bigint(20) primary key auto_increment comment '菜单ID',
   hfsec_menu_code varchar(64) comment '菜单编码',
   hfsec_menu_name varchar(128) comment '菜单名称',
   hfsec_menu_desc varchar(128) comment '菜单描述',
   menu_level int(2) comment '菜单级别',
   icon varchar(64) not null comment '图标',
   url varchar(128) not null comment '地址',
   parent_hfsec_menu_id bigint(20) not null comment '父级菜单ID',
   pri numeric(4,2) comment '优先级',
   creator_id bigint comment '创建人',
   create_time datetime comment '创建时间',
   modifier_id bigint comment '修改人',
   modify_time datetime not null comment '修改时间',
   del_flag int(2) comment '删除标识') comment '菜单';

create table hfmd_enum_class(
   hfmd_enum_class_id bigint(20) primary key auto_increment comment '字典ID',
   hfmd_enum_class_name varchar(32) comment '字典名称',
   hfmd_enum_class_code varchar(64) comment '字典编码',
   hfmd_enum_class_desc varchar(128) comment '字典描述',
   ext1 varchar(128) comment '扩展字段1',
   ext2 varchar(128) comment '扩展字段2',
   op_id bigint(20) comment '创建人',
   create_time datetime comment '创建时间',
   modify_op_id bigint(20) comment '修改人',
   modify_time datetime comment '修改时间',
   del_flag int(2) comment '删除标识') comment '字典';

create table hfmd_enum(
   hfmd_enum_id bigint(20) primary key auto_increment comment '字典项ID',
   hfmd_enum_value varchar(32) comment '字典项值',
   hfmd_enum_text varchar(32) comment '字典项文本',
   hfmd_enum_desc varchar(128) comment '字典项描述',
   is_default int(2) comment '是否默认',
   pri numeric(4,2) comment '优先级',
   ext1 varchar(128) comment '扩展字段1',
   ext2 varchar(128) comment '扩展字段2',
   hfmd_enum_class_id bigint(20) comment '字典ID',
   hfmd_enum_class_code varchar(32),
   op_id bigint(20) comment '创建人',
   create_time datetime comment '创建时间',
   modify_op_id bigint(20) comment '修改人',
   modify_time datetime comment '修改时间',
   del_flag int(2) not null comment '删除标识') comment '字典项';

alter table hfsec_organize add constraint FK_hfsec_organize_4_parent_hfsec_organize_id foreign key (parent_hfsec_organize_id) references hfsec_organize (hfsec_organize_id) on delete restrict on update restrict;

alter table hfsec_role_authorize add constraint FK_hfsec_role_authorize_4_hfsec_role_id foreign key (hfsec_role_id) references hfsec_role (hfsec_role_id) on delete restrict on update restrict;

alter table hfsec_role_authorize add constraint FK_hfsec_role_authorize_4_hfsec_menu_id foreign key (hfsec_menu_id) references hfsec_menu (hfsec_menu_id) on delete restrict on update restrict;

alter table hfsec_user add constraint FK_hfsec_user_4_hfsec_organize_id foreign key (hfsec_organize_id) references hfsec_organize (hfsec_organize_id) on delete restrict on update restrict;

alter table hfsec_user_authorize add constraint FK_hfsec_user_authorize_4_hfsec_user_id foreign key (hfsec_user_id) references hfsec_user (hfsec_user_id) on delete restrict on update restrict;

alter table hfsec_user_authorize add constraint FK_hfsec_user_authorize_4_hfsec_organize_id foreign key (hfsec_organize_id) references hfsec_organize (hfsec_organize_id) on delete restrict on update restrict;

alter table hfsec_user_authorize add constraint FK_hfsec_user_authorize_4_hfsec_role_id foreign key (hfsec_role_id) references hfsec_role (hfsec_role_id) on delete restrict on update restrict;

alter table hfsec_menu add constraint FK_hfsec_menu_4_parent_hfsec_menu_id foreign key (parent_hfsec_menu_id) references hfsec_menu (hfsec_menu_id) on delete restrict on update restrict;

alter table hfmd_enum add constraint FK_hfmd_enum_4_hfmd_enum_class_id foreign key (hfmd_enum_class_id) references hfmd_enum_class (hfmd_enum_class_id) on delete restrict on update restrict;