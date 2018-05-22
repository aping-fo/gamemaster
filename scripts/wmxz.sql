DROP INDEX `idx_server_id` ON `server`;
DROP INDEX `idx_player_id` ON `player`;
DROP INDEX `idx_player_char_id` ON `player_character`;
DROP INDEX `idx_char_id` ON `player_character`;
DROP INDEX `idx_order_id` ON `player_order`;
DROP INDEX `idx_order` ON `player_order`;
DROP INDEX `idx_order_date` ON `player_order`;
DROP INDEX `idx_player_action` ON `player_action_log`;
DROP INDEX `idx_user` ON `user`;
DROP INDEX `idx_recharge_daily` ON `recharge_daily`;
DROP INDEX `idx_channel` ON `channel`;

DROP TABLE `server`;
DROP TABLE `player`;
DROP TABLE `player_character`;
DROP TABLE `player_order`;
DROP TABLE `player_action_log`;
DROP TABLE `user`;
DROP TABLE `recharge_daily`;
DROP TABLE `channel`;

CREATE TABLE `server` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`server_id` bigint(20) NOT NULL COMMENT '服务器ID',
`server_name` varchar(100) NOT NULL COMMENT '服务器名称',
`open_date` datetime NULL COMMENT '开服时间',
`server_type` varchar(10) NULL COMMENT '服务器类型',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
`server_ip` varchar(255) DEFAULT NULL COMMENT '服务器IP',
`server_port` int(11) DEFAULT NULL COMMENT '服务器端口',
PRIMARY KEY (`id`) ,
INDEX `idx_server_id` (`server_id` ASC, `status` ASC)
);

CREATE TABLE `player` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`player_id` bigint(20) NOT NULL COMMENT '玩家ID',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`channel_name` varchar(100) NULL COMMENT '渠道名称',
`username` varchar(150) NULL COMMENT '登录账号',
`mobile` varchar(50) NULL COMMENT '手机号',
`id_card` varchar(50) NULL COMMENT '实名认证身份证号',
`create_ip` varchar(30) NULL COMMENT '注册IP地址',
`create_device` varchar(255) NULL COMMENT '注册设备信息',
`create_version` varchar(255) NULL COMMENT '注册使用客户端版本号',
`create_mac` varchar(255) NULL COMMENT '注册MAC地址',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '注册时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_id` (`player_id` ASC, `status` ASC)
);

CREATE TABLE `player_character` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`player_id` bigint(20) NULL COMMENT '玩家ID',
`server_id` bigint(20) NULL COMMENT '区服ID',
`server_name` varchar(255) NULL COMMENT '服务器名称',
`char_id` bigint(20) NULL COMMENT '角色ID',
`char_name` varchar(255) NULL COMMENT '角色名称',
`sex` varchar(10) NULL COMMENT '性别',
`level` int(11) NULL COMMENT '等级',
`vip_level` int(11) NULL COMMENT 'VIP等级',
`power` int(11) NULL COMMENT '战斗力',
`faction_id` int(11) NULL COMMENT '帮派ID',
`faction_name` varchar(255) NULL COMMENT '帮派名称',
`job` varchar(100) NULL COMMENT '职业',
`exp` int(11) NULL COMMENT '经验值',
`recharge_gold` int(11) NULL COMMENT '充值元宝',
`recharge_times` int(11) NULL COMMENT '充值次数',
`first_recharge_time` datetime NULL COMMENT '首冲时间',
`last_recharge_time` datetime NULL COMMENT '最后充值时间',
`left_gold` int(11) NULL COMMENT '剩余元宝',
`left_special_gold` int(11) NULL COMMENT '剩余绑定元宝',
`used_special_gold` int(11) NULL COMMENT '消耗绑定元宝',
`left_coin` bigint(11) NULL COMMENT '剩余铜钱',
`used_coin` bigint(11) NULL COMMENT '消耗铜钱',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_char_id` (`player_id` ASC, `char_id` ASC, `char_name` ASC, `server_id` ASC, `status` ASC),
INDEX `idx_char_id` (`char_id` ASC, `status` ASC)
);

CREATE TABLE `player_order` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`order_id` bigint(20) NULL COMMENT '订单ID',
`order_code` varchar(255) NULL COMMENT '订单号',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`channel_name` varchar(100) NULL COMMENT '渠道名称',
`server_id` bigint(20) NULL COMMENT '服务器ID',
`server_name` varchar(255) NULL COMMENT '服务器名称',
`player_id` bigint(20) NULL COMMENT '玩家ID',
`char_id` bigint(20) NULL COMMENT '角色ID',
`item_id` bigint(20) NULL COMMENT '购买商品ID',
`item_price` decimal(10,2) NULL COMMENT '购买商品价格',
`amount` decimal(10,2) NULL COMMENT '订单金额',
`gold_quantity` int(11) NULL COMMENT '元宝数量',
`order_type` varchar(10) NULL COMMENT '订单类型',
`order_status` varchar(20) NULL COMMENT '订单状态',
`sync_status` varchar(20) NULL COMMENT '同步状态',
`char_level` int(11) NULL COMMENT '角色等级',
`char_gold` int(11) NULL COMMENT '角色现有元宝',
`char_name` varchar(255) NULL COMMENT '角色名称',
`item_name` varchar(255) NULL COMMENT '商品名称',
`paid_date` datetime NULL COMMENT '支付成功时间',
`recharged_date` datetime NULL COMMENT '充值成功时间',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '订单创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_order_id` (`order_id` ASC, `status` ASC),
INDEX `idx_order` (`order_id` ASC, `server_id` ASC, `player_id` ASC, `char_id` ASC, `item_id` ASC, `status` ASC, `channel_id` ASC),
INDEX `idx_order_date` (`order_id` ASC, `create_time` ASC, `paid_date` ASC, `recharged_date` ASC, `status` ASC)
);

CREATE TABLE `player_action_log` (
`id` bigint(20) NOT NULL COMMENT '自增主键',
`device_id` varchar(255) NULL COMMENT '设备号',
`action` int(11) NULL COMMENT '动作类型：1激活、2注册、3创建角色、4登录、5离线，更多待补充',
`action_date` datetime NULL COMMENT '动作触发时间',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`server_id` bigint(20) NULL COMMENT '服务器ID',
`player_id` bigint(20) NULL COMMENT '玩家ID',
`char_id` bigint(20) NULL COMMENT '角色ID',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_action` (`device_id` ASC, `action` ASC, `status` ASC)
);

CREATE TABLE `user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`username` varchar(100) NULL COMMENT '用户名',
`password` varchar(100) NULL COMMENT '密码(加密)',
`name` varchar(100) NULL COMMENT '姓名',
`user_type` int(11) NULL COMMENT '用户类型',
`last_login` datetime NULL COMMENT '最后登录时间',
`first_login` datetime NULL COMMENT '首次登录时间',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_user` (`username` ASC, `status` ASC)
);

CREATE TABLE `recharge_daily` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`server_id` bigint(20) NULL COMMENT '服务器ID',
`report_date` varchar(30) NULL COMMENT '汇总日期',
`recharge_sum` int(11) NULL COMMENT '充值人数（总）',
`recharge_amount` numeric(11,2) NULL COMMENT '充值金额（总）',
`append_sum` int(11) NULL COMMENT '新增充值人数',
`append_amount` numeric(11,2) NULL COMMENT '新增充值金额',
`gold_sum` int(11) NULL COMMENT '充值元宝（总）',
`gold_append` int(11) NULL COMMENT '新增充值元宝',
`arpu_sum` numeric(11,2) NULL COMMENT 'ARPU（总）',
`arpu_append` numeric(11,2) NULL COMMENT '新增ARPU',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_recharge_daily` (`server_id` ASC, `channel_id` ASC, `report_date` ASC)
);

CREATE TABLE `channel` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`channel_name` varchar(100) NULL COMMENT '渠道名称',
`open_date` datetime NULL COMMENT '开服时间',
`channel_type` varchar(10) NULL COMMENT '渠道类型',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_channel` (`channel_id` ASC, `status` ASC)
);

