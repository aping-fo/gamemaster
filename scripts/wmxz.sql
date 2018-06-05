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
`update_time` datetime NULL COMMENT '更新时间a',
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
`online_time` bigint(20) NULL DEFAULT NULL COMMENT '在线时长',
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

CREATE TABLE `comprehensive_report_data_collection`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `report_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '日期',
  `register_number` bigint(11) NULL DEFAULT NULL COMMENT '注册数',
  `role_number` bigint(11) NULL DEFAULT NULL COMMENT '创角数',
  `login_number` bigint(11) NULL DEFAULT NULL COMMENT '登录数',
  `active_number` bigint(11) NULL DEFAULT NULL COMMENT '活跃数',
  `old_player_number` bigint(11) NULL DEFAULT NULL COMMENT '老玩家',
  `pay_number` bigint(11) NULL DEFAULT NULL COMMENT '付费人数',
  `recharge_amount` bigint(11) NULL DEFAULT NULL COMMENT '充值金额',
  `pay_rate` decimal(11, 4) NULL DEFAULT NULL COMMENT '登录付费率',
  `pay_arpu` decimal(11, 4) NULL DEFAULT NULL COMMENT '付费ARPU',
  `new_pay_number` bigint(11) NULL DEFAULT NULL COMMENT '新付费数',
  `new_pay_rate` decimal(11, 4) NULL DEFAULT NULL COMMENT '新付费率',
  `new_recharge_amount` bigint(11) NULL DEFAULT NULL COMMENT '新充值金额',
  `new_pay_arpu` decimal(11, 4) NULL DEFAULT NULL COMMENT '新付费ARPU',
  `old_pay_number` bigint(11) NULL DEFAULT NULL COMMENT '老付费人数',
  `old_recharge_amount` bigint(11) NULL DEFAULT NULL COMMENT '老充值金额',
  `old_pay_rate` decimal(11, 4) NULL DEFAULT NULL COMMENT '老付费率',
  `old_pay_arpu` decimal(11, 4) NULL DEFAULT NULL COMMENT '老ARPU',
  `next_day_avg` decimal(11, 4) NULL DEFAULT NULL COMMENT '次留',
  `three_day_avg` decimal(11, 4) NULL DEFAULT NULL COMMENT '三留',
  `seven_day_avg` decimal(11, 4) NULL DEFAULT NULL COMMENT '七留',
  `channel_id` bigint(11) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(11) NULL DEFAULT NULL COMMENT '服务器ID',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  INDEX `idx_comprehensive_report_data_collection` (`server_id` ASC, `channel_id` ASC, `report_date` ASC)
)
CREATE TABLE `angle_number_analysis` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `total_creation_angle` int(11) DEFAULT NULL COMMENT '总创角数',
  `non_repeat` int(11) DEFAULT NULL COMMENT '非重复',
  `non_repeat_rate` decimal(10,4) DEFAULT NULL COMMENT '非重复比率',
  `_repeat` int(11) DEFAULT NULL COMMENT '重复数',
  `repeat_rate` decimal(10,4) DEFAULT NULL COMMENT '重复比率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
CREATE TABLE `base_information` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `char_id` int(11) DEFAULT NULL COMMENT '角色id',
  `account` varchar(255) DEFAULT NULL COMMENT '账户',
  `char_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `level` int(11) DEFAULT NULL COMMENT '等级',
  `slaughter` int(11) DEFAULT NULL COMMENT '杀戮值',
  `killing_number` int(11) DEFAULT NULL COMMENT '杀人数',
  `VIP_level` int(11) DEFAULT NULL COMMENT 'VIP等级',
  `account_authority` int(11) DEFAULT NULL COMMENT '账户权限:1普通玩家、2GM、3新手指导员、4内部玩家',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `combat_power` int(11) DEFAULT NULL COMMENT '战斗力',
  `gangs` varchar(255) DEFAULT NULL COMMENT '帮派',
  `exp` int(11) DEFAULT NULL COMMENT '经验值',
  `recharge_treasure` int(11) DEFAULT NULL COMMENT '充值元宝',
  `recharge_number` int(11) DEFAULT NULL COMMENT '充值次数',
  `first_charge_time` datetime DEFAULT NULL COMMENT '首充时间',
  `last_charge_time` datetime DEFAULT NULL COMMENT '最后一次充值时间',
  `non_recharge_days` int(11) DEFAULT NULL COMMENT '未充值天数',
  `surplus_treasure` int(11) DEFAULT NULL COMMENT '剩余元宝',
  `consumes_treasure` int(11) DEFAULT NULL COMMENT '消耗元宝',
  `surplus_binding_treasure` int(11) DEFAULT NULL COMMENT '剩余绑定元宝',
  `consumes_binding_treasure` int(11) DEFAULT NULL COMMENT '消耗绑定元宝',
  `surplus_money` int(11) DEFAULT NULL COMMENT '剩余铜钱',
  `consumes_money` int(11) DEFAULT NULL COMMENT '消耗铜钱',
  `surplus_binding_money` int(11) DEFAULT NULL COMMENT '剩余绑定铜钱',
  `consumes_binding_money` int(11) DEFAULT NULL COMMENT '消耗绑定铜钱',
  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
  `login_ip` varchar(255) DEFAULT NULL COMMENT '登录ip',
  `network_environment` varchar(255) DEFAULT NULL COMMENT '网络环境',
  `mac` varchar(255) DEFAULT NULL COMMENT 'mac',
  `model` varchar(255) DEFAULT NULL COMMENT '机型',
  `system_version` varchar(255) DEFAULT NULL COMMENT '系统版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
CREATE TABLE `calendar` (
  `datelist` date DEFAULT NULL COMMENT '日期'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `giftpackage_add` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '礼包名称',
  `des` varchar(255) DEFAULT NULL COMMENT '礼包描述',
  `isBinding` int(11) DEFAULT NULL COMMENT '是否绑定',
  `goods0_name` varchar(255) DEFAULT NULL COMMENT '物品1',
  `goods0_count` int(11) DEFAULT NULL COMMENT '物品1数量',
  `goods1_name` varchar(255) DEFAULT NULL COMMENT '物品2',
  `goods1_count` int(11) DEFAULT NULL COMMENT '物品2数量',
  `goods2_name` varchar(255) DEFAULT NULL COMMENT '物品3',
  `goods2_count` int(11) DEFAULT NULL COMMENT '物品3数量',
  `goods3_name` varchar(255) DEFAULT NULL COMMENT '物品4',
  `goods3_count` int(11) DEFAULT NULL COMMENT '物品4数量',
  `goods4_name` varchar(255) DEFAULT NULL COMMENT '物品5',
  `goods4_count` int(11) DEFAULT NULL COMMENT '物品5数量',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
CREATE TABLE `giftpackage_sync` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `card_file` varchar(255) DEFAULT NULL COMMENT '卡号文件',
  `activity_id` int(11) DEFAULT NULL COMMENT '礼包活动id',
  `min_term_validity` datetime DEFAULT NULL COMMENT '有效期开始',
  `max_term_validity` datetime DEFAULT NULL COMMENT '有效期结束',
  `is_exclusive_giftbag` int(11) DEFAULT NULL COMMENT '是否独家礼包',
  `card_type` varchar(255) DEFAULT NULL COMMENT '卡号类型',
  `card_count` int(11) DEFAULT NULL COMMENT '卡号数量',
  `is_activation` int(11) DEFAULT NULL COMMENT '是否激活',
  `generate_time` datetime DEFAULT NULL COMMENT '生成时间',
  `generate_type` varchar(255) DEFAULT NULL COMMENT '生成类型',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
CREATE TABLE `integrated_online` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `max_role_count` int(11) DEFAULT NULL COMMENT '最大角色数',
  `avg_role_count` int(11) DEFAULT NULL COMMENT '平均角色数',
  `min_role_count` int(11) DEFAULT NULL COMMENT '最小角色数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
CREATE TABLE `integrated_online_service` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `total_creation_angle` int(11) DEFAULT NULL COMMENT '前5天总充值数',
  `max_role_count` int(11) DEFAULT NULL COMMENT '最大角色数',
  `avg_role_count` int(11) DEFAULT NULL COMMENT '平均角色数',
  `min_role_count` int(11) DEFAULT NULL COMMENT '最小角色数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
CREATE TABLE `new_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `first_charge_count` int(11) DEFAULT NULL COMMENT '首充玩家数量',
  `new_user_count` int(11) DEFAULT NULL COMMENT '当日新增人数',
  `new_pay_sum` int(11) DEFAULT NULL COMMENT '当日新增付费额度',
  `new_pay_rate` decimal(11,4) DEFAULT NULL COMMENT '当日新增用户付费率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
CREATE TABLE `num` (
  `i` int(11) DEFAULT NULL COMMENT '日历表辅助数字'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `online` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `max_role_count` varchar(255) DEFAULT NULL COMMENT '最大角色数',
  `avg_role_count` varchar(255) DEFAULT NULL COMMENT '平均角色数',
  `min_role_count` varchar(255) DEFAULT NULL COMMENT '最小角色数',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
CREATE TABLE `online_now` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `char_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `char_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `user_name` varchar(255) DEFAULT NULL COMMENT '账号',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `max_online_length` int(11) DEFAULT NULL COMMENT '累计在线时长',
  `map_id` int(11) DEFAULT NULL COMMENT '该玩家所在的/下线的地图ID',
  `player_ip` int(11) DEFAULT NULL COMMENT '该玩家登录的IP地址',
  `online` int(11) DEFAULT NULL COMMENT '0离线、1在线',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `server_id` int(11) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` int(11) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;
CREATE TABLE `pay_retention_rate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `report_date` datetime DEFAULT NULL COMMENT '付费日期',
  `user_count` int(11) DEFAULT NULL COMMENT '用户数',
  `one_day` decimal(11,4) DEFAULT NULL COMMENT '一天留存',
  `two_day` decimal(11,4) DEFAULT NULL COMMENT '二天留存',
  `three_day` decimal(11,4) DEFAULT NULL COMMENT '三天留存',
  `four_day` decimal(11,4) DEFAULT NULL COMMENT '四天留存',
  `five_day` decimal(11,4) DEFAULT NULL COMMENT '五天留存',
  `six_day` decimal(11,4) DEFAULT NULL COMMENT '六天留存',
  `seven_day` decimal(11,4) DEFAULT NULL COMMENT '七天留存',
  `two_weeks` decimal(11,4) DEFAULT NULL COMMENT '二周留存',
  `one_month` decimal(11,4) DEFAULT NULL COMMENT '一月留存',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL,
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=350 DEFAULT CHARSET=utf8;
CREATE TABLE `prop_flow` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '状态:1活动、2丢失',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `type` int(11) DEFAULT NULL COMMENT '类型:1装备、2道具',
  `name` varchar(255) DEFAULT NULL COMMENT '装备/道具名称',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `strengthening_grade` int(11) DEFAULT NULL COMMENT '强化等级',
  `strengthening_degree_completion` decimal(10,4) DEFAULT NULL COMMENT '强化完成度',
  `lucky_value` int(255) DEFAULT NULL COMMENT '幸运值',
  `set` varchar(255) DEFAULT NULL COMMENT '镶嵌',
  `clear` varchar(255) DEFAULT NULL COMMENT '洗练',
  `ultimate_attribute` varchar(255) DEFAULT NULL COMMENT '极品属性',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
CREATE TABLE `recharge_erroneous_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(255) DEFAULT NULL COMMENT '订单号',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道',
  `user_name` varchar(255) DEFAULT NULL COMMENT '账号',
  `char_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `char_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `amount` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `error_message` varchar(255) DEFAULT NULL COMMENT '错误信息',
  `status` int(11) DEFAULT NULL COMMENT '状态:1支付失败、2支付成功',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `player_id` bigint(20) DEFAULT NULL COMMENT '玩家id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `report_date` datetime DEFAULT NULL COMMENT '订单时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;
CREATE TABLE `recharge_failed_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(255) DEFAULT NULL COMMENT '订单号',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '账号',
  `char_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `char_level` int(11) DEFAULT NULL COMMENT '等级',
  `gold_quantity` int(11) DEFAULT NULL COMMENT '元宝',
  `amount` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `reason` int(11) DEFAULT NULL COMMENT '失败原因:1服务器不正确、2账号或角色不存在',
  `status` int(11) DEFAULT NULL COMMENT '状态：',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `report_date` datetime DEFAULT NULL COMMENT '订单时间',
  `char_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `player_id` bigint(20) DEFAULT NULL COMMENT '玩家id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;
CREATE TABLE `registered_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `equipment_count` int(11) DEFAULT NULL COMMENT '设备数',
  `activation_count` int(11) DEFAULT NULL COMMENT '激活数',
  `loss_rate` decimal(10,4) DEFAULT NULL COMMENT '页面流失率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;