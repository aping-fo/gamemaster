DROP INDEX `idx_channel` ON `channel`;
DROP INDEX `idx_comprehensive_report_data_collection` ON `comprehensive_report_data_collection`;
DROP INDEX `idx_player_id` ON `player`;
DROP INDEX `idx_player_action_id` ON `player_action_log`;
DROP INDEX `idx_player_action_date` ON `player_action_log`;
DROP INDEX `idx_player_action_char` ON `player_action_log`;
DROP INDEX `idx_player_char_id` ON `player_character`;
DROP INDEX `idx_char_id` ON `player_character`;
DROP INDEX `idx_player_order_channel` ON `player_order`;
DROP INDEX `idx_player_order_char` ON `player_order`;
DROP INDEX `idx_recharge_daily` ON `recharge_daily`;
DROP INDEX `idx_server_id` ON `server`;
DROP INDEX `idx_user` ON `user`;
DROP INDEX `idx_recharge_monthly_id` ON `recharge_monthly`;
DROP INDEX `idx_recharge_monthly_time` ON `recharge_monthly`;
DROP INDEX `idx_recharge_monthly_day` ON `recharge_monthly_day`;
DROP INDEX `idx_player_action_daily_id` ON `player_action_daily`;
DROP INDEX `idx_pay_ltv_id` ON `pay_ltv`;
DROP INDEX `idx_pay_ltv_day` ON `pay_ltv_day`;
DROP INDEX `idx_statics_summary_id` ON `statics_summary`;
DROP INDEX `idx_server_online_id` ON `server_online_log`;
DROP INDEX `idx_character_daily_id` ON `character_daily`;

DROP TABLE `channel`;
DROP TABLE `comprehensive_report_data_collection`;
DROP TABLE `player`;
DROP TABLE `player_action_log`;
DROP TABLE `player_character`;
DROP TABLE `player_order`;
DROP TABLE `recharge_daily`;
DROP TABLE `server`;
DROP TABLE `user`;
DROP TABLE `recharge_monthly`;
DROP TABLE `recharge_monthly_day`;
DROP TABLE `player_action_daily`;
DROP TABLE `pay_ltv`;
DROP TABLE `pay_ltv_day`;
DROP TABLE `statics_summary`;
DROP TABLE `server_online_log`;
DROP TABLE `forbidden_log`;
DROP TABLE `character_daily`;

CREATE TABLE `channel` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
`channel_name` varchar(100) NULL DEFAULT NULL COMMENT '渠道名称',
`open_date` datetime NULL DEFAULT NULL COMMENT '开服时间',
`channel_type` varchar(10) NULL DEFAULT NULL COMMENT '渠道类型',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_channel` (`channel_id` ASC, `status` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `comprehensive_report_data_collection` (
`id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`report_date` varchar(30) CHARACTER SET utf8 NOT NULL COMMENT '日期',
`register_number` bigint(11) NULL DEFAULT NULL COMMENT '注册数',
`role_number` bigint(11) NULL DEFAULT NULL COMMENT '创角数',
`login_number` bigint(11) NULL DEFAULT NULL COMMENT '登录数',
`active_number` bigint(11) NULL DEFAULT NULL COMMENT '活跃数',
`old_player_number` bigint(11) NULL DEFAULT NULL COMMENT '老玩家',
`pay_number` bigint(11) NULL DEFAULT NULL COMMENT '付费人数',
`recharge_amount` bigint(11) NULL DEFAULT NULL COMMENT '充值金额',
`pay_rate` decimal(11,4) NULL DEFAULT NULL COMMENT '登录付费率',
`pay_arpu` decimal(11,4) NULL DEFAULT NULL COMMENT '付费ARPU',
`new_pay_number` bigint(11) NULL DEFAULT NULL COMMENT '新付费数',
`new_pay_rate` decimal(11,4) NULL DEFAULT NULL COMMENT '新付费率',
`new_recharge_amount` bigint(11) NULL DEFAULT NULL COMMENT '新充值金额',
`new_pay_arpu` decimal(11,4) NULL DEFAULT NULL COMMENT '新付费ARPU',
`old_pay_number` bigint(11) NULL DEFAULT NULL COMMENT '老付费人数',
`old_recharge_amount` bigint(11) NULL DEFAULT NULL COMMENT '老充值金额',
`old_pay_rate` decimal(11,4) NULL DEFAULT NULL COMMENT '老付费率',
`old_pay_arpu` decimal(11,4) NULL DEFAULT NULL COMMENT '老ARPU',
`next_day_avg` decimal(11,4) NULL DEFAULT NULL COMMENT '次留',
`three_day_avg` decimal(11,4) NULL DEFAULT NULL COMMENT '三留',
`seven_day_avg` decimal(11,4) NULL DEFAULT NULL COMMENT '七留',
`channel_id` bigint(11) NULL DEFAULT NULL COMMENT '渠道ID',
`server_id` bigint(11) NULL DEFAULT NULL COMMENT '服务器ID',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_comprehensive_report_data_collection` (`server_id` ASC, `channel_id` ASC, `report_date` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `player` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`player_id` bigint(20) NOT NULL COMMENT '玩家ID',
`channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
`channel_name` varchar(100) NULL DEFAULT NULL COMMENT '渠道名称',
`username` varchar(150) NULL DEFAULT NULL COMMENT '登录账号',
`mobile` varchar(50) NULL DEFAULT NULL COMMENT '手机号',
`id_card` varchar(50) NULL DEFAULT NULL COMMENT '实名认证身份证号',
`create_ip` varchar(30) NULL DEFAULT NULL COMMENT '注册IP地址',
`create_device` varchar(255) NULL DEFAULT NULL COMMENT '注册设备信息',
`create_version` varchar(255) NULL DEFAULT NULL COMMENT '注册使用客户端版本号',
`create_mac` varchar(255) NULL DEFAULT NULL COMMENT '注册MAC地址',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '注册时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_id` (`player_id` ASC, `status` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 30901
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `player_action_log` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`device_id` varchar(255) NULL DEFAULT NULL COMMENT '设备号',
`action` int(11) NULL DEFAULT NULL COMMENT '动作类型：1激活、2注册、3创建角色、4登录、5离线，更多待补充',
`action_date` datetime NULL DEFAULT NULL COMMENT '动作触发时间',
`channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
`server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器ID',
`player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家ID',
`char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
`online_time` bigint(20) NULL DEFAULT NULL COMMENT '在线时长',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_action_id` (`channel_id` ASC, `server_id` ASC),
INDEX `idx_player_action_date` (`action` ASC, `action_date` ASC),
INDEX `idx_player_action_char` (`char_id` ASC, `action_date` ASC)
)
ENGINE = InnoDB
AUTO_INCREMENT = 0
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `player_character` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家ID',
`server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
`server_name` varchar(255) NULL DEFAULT NULL COMMENT '服务器名称',
`char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
`char_name` varchar(255) NULL DEFAULT NULL COMMENT '角色名称',
`sex` varchar(10) NULL DEFAULT NULL COMMENT '性别',
`level` int(11) NULL DEFAULT NULL COMMENT '等级',
`vip_level` int(11) NULL DEFAULT NULL COMMENT 'VIP等级',
`power` int(11) NULL DEFAULT NULL COMMENT '战斗力',
`faction_id` int(11) NULL DEFAULT NULL COMMENT '帮派ID',
`faction_name` varchar(255) NULL DEFAULT NULL COMMENT '帮派名称',
`job` varchar(100) NULL DEFAULT NULL COMMENT '职业',
`exp` int(11) NULL DEFAULT NULL COMMENT '经验值',
`recharge_gold` int(11) NULL DEFAULT NULL COMMENT '充值元宝',
`recharge_times` int(11) NULL DEFAULT NULL COMMENT '充值次数',
`first_recharge_time` datetime NULL DEFAULT NULL COMMENT '首冲时间',
`last_recharge_time` datetime NULL DEFAULT NULL COMMENT '最后充值时间',
`left_gold` int(11) NULL DEFAULT NULL COMMENT '剩余元宝',
`left_special_gold` int(11) NULL DEFAULT NULL COMMENT '剩余绑定元宝',
`used_special_gold` int(11) NULL DEFAULT NULL COMMENT '消耗绑定元宝',
`left_coin` bigint(11) NULL DEFAULT NULL COMMENT '剩余铜钱',
`used_coin` bigint(11) NULL DEFAULT NULL COMMENT '消耗铜钱',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_char_id` (`player_id` ASC, `char_id` ASC, `char_name` ASC, `server_id` ASC, `status` ASC) USING BTREE,
INDEX `idx_char_id` (`char_id` ASC, `status` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 30901
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `player_order` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`order_id` bigint(20) NULL DEFAULT NULL COMMENT '订单ID',
`order_code` varchar(255) NULL DEFAULT NULL COMMENT '订单号',
`channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
`channel_name` varchar(100) NULL DEFAULT NULL COMMENT '渠道名称',
`server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器ID',
`server_name` varchar(255) NULL DEFAULT NULL COMMENT '服务器名称',
`player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家ID',
`char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
`item_id` bigint(20) NULL DEFAULT NULL COMMENT '购买商品ID',
`item_price` decimal(11,2) NULL DEFAULT NULL COMMENT '购买商品价格',
`amount` decimal(11,2) NULL DEFAULT NULL COMMENT '订单金额',
`gold_quantity` int(11) NULL DEFAULT NULL COMMENT '元宝数量',
`order_type` varchar(10) NULL DEFAULT NULL COMMENT '订单类型',
`order_status` varchar(20) NULL DEFAULT NULL COMMENT '订单状态',
`sync_status` varchar(20) NULL DEFAULT NULL COMMENT '同步状态',
`char_level` int(11) NULL DEFAULT NULL COMMENT '角色等级',
`char_gold` int(11) NULL DEFAULT NULL COMMENT '角色现有元宝',
`char_name` varchar(255) NULL DEFAULT NULL COMMENT '角色名称',
`item_name` varchar(255) NULL DEFAULT NULL COMMENT '商品名称',
`paid_date` datetime NULL DEFAULT NULL COMMENT '支付成功时间',
`recharged_date` datetime NULL DEFAULT NULL COMMENT '充值成功时间',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '订单创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_order_channel` (`channel_id` ASC, `server_id` ASC),
INDEX `idx_player_order_char` (`char_id` ASC, `player_id` ASC)
)
ENGINE = InnoDB
AUTO_INCREMENT = 5501
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `recharge_daily` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
`server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器ID',
`report_date` varchar(30) NULL DEFAULT NULL COMMENT '汇总日期',
`recharge_sum` int(11) NULL DEFAULT NULL COMMENT '充值人数（总）',
`recharge_amount` decimal(11,2) NULL DEFAULT NULL COMMENT '充值金额（总）',
`append_sum` int(11) NULL DEFAULT NULL COMMENT '新增充值人数',
`append_amount` decimal(11,2) NULL DEFAULT NULL COMMENT '新增充值金额',
`gold_sum` int(11) NULL DEFAULT NULL COMMENT '充值元宝（总）',
`gold_append` int(11) NULL DEFAULT NULL COMMENT '新增充值元宝',
`arpu_sum` decimal(11,2) NULL DEFAULT NULL COMMENT 'ARPU（总）',
`arpu_append` decimal(11,2) NULL DEFAULT NULL COMMENT '新增ARPU',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_recharge_daily` (`server_id` ASC, `channel_id` ASC, `report_date` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 211
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `server` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`server_id` bigint(20) NOT NULL COMMENT '服务器ID',
`server_name` varchar(100) NOT NULL COMMENT '服务器名称',
`open_date` datetime NULL DEFAULT NULL COMMENT '开服时间',
`server_type` varchar(10) NULL DEFAULT NULL COMMENT '服务器类型',
`ip` varchar(15) NULL COMMENT 'IP地址',
`port` int(11) NULL COMMENT '端口号',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_server_id` (`server_id` ASC, `status` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 29
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`username` varchar(100) NULL DEFAULT NULL COMMENT '用户名',
`password` varchar(100) NULL DEFAULT NULL COMMENT '密码(加密)',
`name` varchar(100) NULL DEFAULT NULL COMMENT '姓名',
`user_type` int(11) NULL DEFAULT NULL COMMENT '用户类型',
`last_login` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
`first_login` datetime NULL DEFAULT NULL COMMENT '首次登录时间',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
`update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_user` (`username` ASC, `status` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci
ROW_FORMAT = Dynamic;

CREATE TABLE `recharge_monthly` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`channel_name` varchar(100) NULL COMMENT '渠道名称',
`server_id` bigint(20) NULL COMMENT '区服ID',
`server_name` varchar(100) NULL COMMENT '区服名称',
`open_date` datetime NULL COMMENT '开服日期',
`recharge_amount` decimal(11,2) NULL COMMENT '充值总数',
`recharge_year` int(5) NULL COMMENT '年份',
`recharge_month` int(5) NULL COMMENT '月份',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_recharge_monthly_id` (`channel_id` ASC, `server_id` ASC, `status` ASC),
INDEX `idx_recharge_monthly_time` (`recharge_year` ASC, `recharge_month` ASC, `status` ASC)
);

CREATE TABLE `recharge_monthly_day` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`recharge_monthly_id` bigint(20) NULL COMMENT '充值汇总月份ID',
`recharge_day` int(5) NULL COMMENT '日期',
`amount` decimal(11,2) NULL COMMENT '充值汇总金额',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_recharge_monthly_day` (`recharge_monthly_id` ASC, `recharge_day` ASC, `status` ASC)
);

CREATE TABLE `player_action_daily` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`server_id` bigint(20) NULL COMMENT '区服ID',
`report_date` varchar(30) NULL COMMENT '汇总日期',
`player_count` int(11) NULL COMMENT '注册数',
`char_count` int(11) NULL COMMENT '创角数',
`login_count` int(11) NULL COMMENT '登录数',
`logoff_count` int(11) NULL COMMENT '离线数',
`online_time` bigint(20) NULL COMMENT '在线时长',
`device_count` int(11) NULL COMMENT '设备数',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_player_action_daily_id` (`channel_id` ASC, `server_id` ASC, `report_date` ASC, `status` ASC)
);

CREATE TABLE `pay_ltv` (
`id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint NULL COMMENT '渠道ID',
`server_id` bigint NULL COMMENT '区服ID',
`report_date` varchar(30) NULL COMMENT '记录日期',
`char_count` int NULL COMMENT '当日创角数',
`status` int NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_pay_ltv_id` (`channel_id` ASC, `server_id` ASC, `report_date` ASC, `status` ASC)
);

CREATE TABLE `pay_ltv_day` (
`id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`pay_ltv_id` bigint NULL COMMENT '主表ID',
`days` int NULL COMMENT '天数',
`average` decimal(11,2) NULL COMMENT '平均值',
`summary` decimal(11,2) NULL COMMENT '汇总值',
`status` int NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_pay_ltv_day` (`pay_ltv_id` ASC, `days` ASC, `status` ASC)
);

CREATE TABLE `statics_summary` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`channel_id` bigint(20) NULL COMMENT '渠道ID',
`server_id` bigint(20) NULL COMMENT '区服ID',
`report_date` varchar(30) NULL COMMENT '报告日期',
`player_count` int(11) NULL COMMENT '新增注册数',
`char_count` int(11) NULL COMMENT '新增创角数',
`login_count` int(11) NULL COMMENT '登录角色数',
`online_count` int(11) NULL COMMENT '最高在线数',
`active_char_count` int(11) NULL COMMENT '活跃角色数',
`recharge_sum` decimal(11,2) NULL COMMENT '收入',
`recharge_count` int(11) NULL COMMENT '付费人数',
`arpu` decimal(11,2) NULL COMMENT 'ARPU值',
`new_recharge_count` int(11) NULL COMMENT '新增付费人数',
`new_recharge_rate` decimal(11,2) NULL COMMENT '新增付费率',
`stay2d` decimal(11,2) NULL COMMENT '次日留存',
`stay3d` decimal(11,2) NULL COMMENT '三日留存',
`stay7d` decimal(11,2) NULL COMMENT '七日留存',
`status` int(11) NULL COMMENT '记录状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_statics_summary_id` (`channel_id` ASC, `server_id` ASC, `report_date` ASC)
);

CREATE TABLE `server_online_log` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`server_id` bigint(20) NULL COMMENT '区服ID',
`report_date` varchar(30) NULL COMMENT '记录年月日',
`report_hour` int(11) NULL COMMENT '记录小时',
`online_count` int(11) NULL COMMENT '在线人数',
`max_online_count` int(11) NULL COMMENT '最大在线人数',
`status` int(11) NULL COMMENT '记录状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_server_online_id` (`server_id` ASC, `report_date` ASC, `report_hour` ASC)
);

CREATE TABLE `forbidden_log` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`server_id` bigint(11) NULL COMMENT '区服ID',
`player_id` bigint(20) NULL COMMENT '玩家ID',
`char_id` bigint(20) NULL COMMENT '角色ID',
`ip_address` varchar(15) NULL COMMENT 'IP地址',
`forbidden_type` int(11) NULL COMMENT '封禁类型，1、禁止登录(封号)；2、禁止聊天(禁言)；',
`expire_time` datetime NULL COMMENT '过期时间',
`reason` varchar(255) NULL COMMENT '原因',
`operate_type` int(11) NULL COMMENT '操作类型：1封禁、2解封',
`operate_time` datetime NULL COMMENT '操作时间',
`status` int(11) NULL COMMENT '记录状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) 
);

CREATE TABLE `character_daily` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`char_id` bigint(20) NULL COMMENT '角色ID',
`report_date` varchar(30) NULL COMMENT '报表日期',
`login_times` int(11) NULL COMMENT '今日登陆次数',
`online_time` int(11) NULL COMMENT '在线时长',
`recharge_amount` decimal(11,2) NULL COMMENT '充值金额',
`status` int(11) NULL COMMENT '记录状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_character_daily_id` (`char_id` ASC, `report_date` ASC)
);

