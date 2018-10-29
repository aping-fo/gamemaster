/*
 Navicat Premium Data Transfer

 Source Server         : 乐起科技
 Source Server Type    : MySQL
 Source Server Version : 50543
 Source Host           : localhost:3306
 Source Schema         : wmxz

 Target Server Type    : MySQL
 Target Server Version : 50543
 File Encoding         : 65001

 Date: 17/10/2018 11:06:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account_log
-- ----------------------------
DROP TABLE IF EXISTS `account_log`;
CREATE TABLE `account_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `account_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1331 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for activation_code
-- ----------------------------
DROP TABLE IF EXISTS `activation_code`;
CREATE TABLE `activation_code`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `invalid_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生效时间',
  `overdue_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '过期时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `universal` int(11) NULL DEFAULT NULL COMMENT '万能码：0否、1是',
  `use_time` datetime NULL DEFAULT NULL COMMENT '激活码使用时间',
  `use_player_id` int(11) NULL DEFAULT NULL COMMENT '使用玩家id',
  `use_player_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '使用玩家名称',
  `use_player_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '使用者账户',
  `use_server_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '使用服务器id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '激活码名称',
  `rewards` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物品',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1294 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `classification` int(11) NULL DEFAULT NULL COMMENT '分类',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `start_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开始时间',
  `end_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '结束时间',
  `activity_status` int(11) NULL DEFAULT NULL COMMENT '活动状态',
  `type` int(11) NULL DEFAULT NULL COMMENT '活动类型',
  `creater` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `auditor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审核人',
  `auditor_time` datetime NULL DEFAULT NULL COMMENT '审核时间',
  `des` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动内容',
  `completion_conditions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '完成条件',
  `reward` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '奖励',
  `sort` int(11) NULL DEFAULT NULL COMMENT '活动排序',
  `is_open` int(11) NULL DEFAULT NULL COMMENT '是否开启',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for angle_number_analysis
-- ----------------------------
DROP TABLE IF EXISTS `angle_number_analysis`;
CREATE TABLE `angle_number_analysis`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `total_creation_angle` int(11) NULL DEFAULT NULL COMMENT '总创角数',
  `non_repeat` int(11) NULL DEFAULT NULL COMMENT '非重复',
  `non_repeat_rate` decimal(10, 4) NULL DEFAULT NULL COMMENT '非重复比率',
  `_repeat` int(11) NULL DEFAULT NULL COMMENT '重复数',
  `repeat_rate` decimal(10, 4) NULL DEFAULT NULL COMMENT '重复比率',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for base_information
-- ----------------------------
DROP TABLE IF EXISTS `base_information`;
CREATE TABLE `base_information`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `char_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户',
  `char_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `slaughter` int(11) NULL DEFAULT NULL COMMENT '杀戮值',
  `killing_number` int(11) NULL DEFAULT NULL COMMENT '杀人数',
  `VIP_level` int(11) NULL DEFAULT NULL COMMENT 'VIP等级',
  `account_authority` int(11) NULL DEFAULT NULL COMMENT '账户权限:1普通玩家、2GM、3新手指导员、4内部玩家',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `combat_power` int(11) NULL DEFAULT NULL COMMENT '战斗力',
  `gangs` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '帮派',
  `exp` int(11) NULL DEFAULT NULL COMMENT '经验值',
  `recharge_treasure` int(11) NULL DEFAULT NULL COMMENT '充值元宝',
  `recharge_number` int(11) NULL DEFAULT NULL COMMENT '充值次数',
  `first_charge_time` datetime NULL DEFAULT NULL COMMENT '首充时间',
  `last_charge_time` datetime NULL DEFAULT NULL COMMENT '最后一次充值时间',
  `non_recharge_days` int(11) NULL DEFAULT NULL COMMENT '未充值天数',
  `surplus_treasure` int(11) NULL DEFAULT NULL COMMENT '剩余元宝',
  `consumes_treasure` int(11) NULL DEFAULT NULL COMMENT '消耗元宝',
  `surplus_binding_treasure` int(11) NULL DEFAULT NULL COMMENT '剩余绑定元宝',
  `consumes_binding_treasure` int(11) NULL DEFAULT NULL COMMENT '消耗绑定元宝',
  `surplus_money` int(11) NULL DEFAULT NULL COMMENT '剩余铜钱',
  `consumes_money` int(11) NULL DEFAULT NULL COMMENT '消耗铜钱',
  `surplus_binding_money` int(11) NULL DEFAULT NULL COMMENT '剩余绑定铜钱',
  `consumes_binding_money` int(11) NULL DEFAULT NULL COMMENT '消耗绑定铜钱',
  `login_time` datetime NULL DEFAULT NULL COMMENT '登录时间',
  `login_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录ip',
  `network_environment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网络环境',
  `mac` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'mac',
  `model` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机型',
  `system_version` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '系统版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for broadcast
-- ----------------------------
DROP TABLE IF EXISTS `broadcast`;
CREATE TABLE `broadcast`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `broadcast_type` int(11) NULL DEFAULT 0 COMMENT '广播类型，1：广播；2：公告',
  `loop_times` int(11) NULL DEFAULT 1 COMMENT '循环次数',
  `gap_second` int(11) NULL DEFAULT 0 COMMENT '间隔秒数',
  `play_time` datetime NULL DEFAULT NULL COMMENT '开始播放时间',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `broadcast_status` int(11) NULL DEFAULT 0 COMMENT '公告广播状态，1：有效；2：关闭',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作理由',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_broadcast_id`(`channel_id`, `server_id`, `broadcast_type`, `broadcast_status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for broadcast_new
-- ----------------------------
DROP TABLE IF EXISTS `broadcast_new`;
CREATE TABLE `broadcast_new`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `content` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `notify_type` int(11) NULL DEFAULT 0 COMMENT '广播类型，1通用提示、2江湖传闻、3系统公告',
  `status` int(11) NULL DEFAULT 1 COMMENT '记录状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_broadcast_id`(`channel_id`, `server_id`, `notify_type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for calendar
-- ----------------------------
DROP TABLE IF EXISTS `calendar`;
CREATE TABLE `calendar`  (
  `datelist` date NULL DEFAULT NULL COMMENT '日期'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for channel
-- ----------------------------
DROP TABLE IF EXISTS `channel`;
CREATE TABLE `channel`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `channel_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `open_date` datetime NULL DEFAULT NULL COMMENT '开服时间',
  `channel_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道类型',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `server_id` int(11) NULL DEFAULT NULL COMMENT '服务器ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_channel`(`channel_id`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for channel_bag
-- ----------------------------
DROP TABLE IF EXISTS `channel_bag`;
CREATE TABLE `channel_bag`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包名',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_channel`(`channel_id`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for character_daily
-- ----------------------------
DROP TABLE IF EXISTS `character_daily`;
CREATE TABLE `character_daily`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `report_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '报表日期',
  `login_times` int(11) NULL DEFAULT NULL COMMENT '今日登陆次数',
  `online_time` int(11) NULL DEFAULT NULL COMMENT '在线时长',
  `recharge_amount` decimal(11, 2) NULL DEFAULT NULL COMMENT '充值金额',
  `status` int(11) NULL DEFAULT NULL COMMENT '记录状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_character_daily_id`(`char_id`, `report_date`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for character_transfer
-- ----------------------------
DROP TABLE IF EXISTS `character_transfer`;
CREATE TABLE `character_transfer`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL,
  `server_id` bigint(20) NULL DEFAULT NULL,
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `channel_id` bigint(20) NULL DEFAULT NULL,
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` date NULL DEFAULT NULL,
  `update_time` date NULL DEFAULT NULL,
  `player_id` bigint(20) NOT NULL COMMENT '角色id',
  `current_id` bigint(20) NOT NULL COMMENT '原账号id',
  `to_id` bigint(20) NOT NULL COMMENT '目标账号id',
  `operator` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作者',
  UNIQUE INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for charge_log
-- ----------------------------
DROP TABLE IF EXISTS `charge_log`;
CREATE TABLE `charge_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `charge_id` int(11) NULL DEFAULT NULL COMMENT '充值id',
  `charge_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '充值类型',
  `amount` float(10, 2) NULL DEFAULT NULL COMMENT '金额',
  `channel_id` int(11) NULL DEFAULT NULL COMMENT '区服id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '充值时间',
  `payment_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付方式',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 305 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '充值日志' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for chat_log
-- ----------------------------
DROP TABLE IF EXISTS `chat_log`;
CREATE TABLE `chat_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `server_id` bigint(20) NOT NULL COMMENT '区服ID',
  `char_id` bigint(20) NOT NULL COMMENT '角色ID',
  `chat_channel` int(11) NOT NULL DEFAULT 0 COMMENT '聊天频道，1：世界；2：好友；3：公会/帮派；',
  `to_char_id` bigint(20) NULL DEFAULT NULL COMMENT '对象角色ID',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '聊天内容',
  `chat_time` datetime NULL DEFAULT NULL COMMENT '聊天时间',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_chat_log_id`(`server_id`, `char_id`, `chat_channel`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for chat_settings
-- ----------------------------
DROP TABLE IF EXISTS `chat_settings`;
CREATE TABLE `chat_settings`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `chat_channel` int(11) NULL DEFAULT 1 COMMENT '聊天频道:1私聊、2世界、3帮派',
  `chat_level` int(11) NULL DEFAULT 110 COMMENT '等级',
  `chat_vip` int(11) NULL DEFAULT 0 COMMENT 'vip等级:0不限制',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for comprehensive_report_data_collection
-- ----------------------------
DROP TABLE IF EXISTS `comprehensive_report_data_collection`;
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
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `package_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包名称',
  `package_id` int(11) NULL DEFAULT NULL COMMENT '包id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_comprehensive_report_data_collection`(`report_date`, `channel_id`, `server_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for create_role_manage
-- ----------------------------
DROP TABLE IF EXISTS `create_role_manage`;
CREATE TABLE `create_role_manage`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `create_role` int(11) NULL DEFAULT 1 COMMENT '创建角色：0关闭、1开启',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for email_flow
-- ----------------------------
DROP TABLE IF EXISTS `email_flow`;
CREATE TABLE `email_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `email_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮件类型',
  `indexes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '索引',
  `conten` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `send` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发件人',
  `addressee` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件人',
  `send_time` datetime NULL DEFAULT NULL COMMENT '发送时间',
  `read_time` datetime NULL DEFAULT NULL COMMENT '读取时间',
  `enclosure` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '附件',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for equipment_flow
-- ----------------------------
DROP TABLE IF EXISTS `equipment_flow`;
CREATE TABLE `equipment_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态:1活动、2丢失',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型:1装备、2道具',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '装备/道具名称',
  `count` int(11) NULL DEFAULT NULL COMMENT '数量',
  `strengthening_grade` int(11) NULL DEFAULT NULL COMMENT '强化等级',
  `strengthening_degree_completion` decimal(10, 4) NULL DEFAULT NULL COMMENT '强化完成度',
  `lucky_value` int(255) NULL DEFAULT NULL COMMENT '幸运值',
  `set` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '镶嵌',
  `clear` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '洗练',
  `ultimate_attribute` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '极品属性',
  `char_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for forbidden_log
-- ----------------------------
DROP TABLE IF EXISTS `forbidden_log`;
CREATE TABLE `forbidden_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `server_id` bigint(11) NULL DEFAULT NULL COMMENT '区服ID',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家ID',
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `ip_address` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'IP地址',
  `forbidden_type` int(11) NULL DEFAULT NULL COMMENT '封禁类型，1、禁止登录(封号)；2、禁止聊天(禁言)；',
  `expire_time` datetime NULL DEFAULT NULL COMMENT '过期时间',
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原因',
  `operate_type` int(11) NULL DEFAULT NULL COMMENT '操作类型：1封禁、0解封',
  `operate_time` datetime NULL DEFAULT NULL COMMENT '操作时间',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `player_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玩家名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for giftpackage_add
-- ----------------------------
DROP TABLE IF EXISTS `giftpackage_add`;
CREATE TABLE `giftpackage_add`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '礼包名称',
  `des` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '礼包描述',
  `goods` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物品(名称、数量、是否绑定)',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for giftpackage_sync
-- ----------------------------
DROP TABLE IF EXISTS `giftpackage_sync`;
CREATE TABLE `giftpackage_sync`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `min_term_validity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '有效期开始',
  `max_term_validity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '有效期结束',
  `card_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '卡号类型',
  `card_count` int(11) NULL DEFAULT NULL COMMENT '卡号数量',
  `generate_time` datetime NULL DEFAULT NULL COMMENT '生成时间',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for goods_recovery
-- ----------------------------
DROP TABLE IF EXISTS `goods_recovery`;
CREATE TABLE `goods_recovery`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家id',
  `goods` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '回收物品',
  `reason` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '操作原因',
  `state` int(11) NULL DEFAULT NULL COMMENT '状态:1已回收、2玩家id不存在、3物品不存在',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器id',
  `player_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玩家姓名',
  UNIQUE INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for integrated_online
-- ----------------------------
DROP TABLE IF EXISTS `integrated_online`;
CREATE TABLE `integrated_online`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `max_role_count` int(11) NULL DEFAULT NULL COMMENT '最大角色数',
  `avg_role_count` int(11) NULL DEFAULT NULL COMMENT '平均角色数',
  `min_role_count` int(11) NULL DEFAULT NULL COMMENT '最小角色数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for integrated_online_service
-- ----------------------------
DROP TABLE IF EXISTS `integrated_online_service`;
CREATE TABLE `integrated_online_service`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `total_creation_angle` int(11) NULL DEFAULT NULL COMMENT '前5天总充值数',
  `max_role_count` int(11) NULL DEFAULT NULL COMMENT '最大角色数',
  `avg_role_count` int(11) NULL DEFAULT NULL COMMENT '平均角色数',
  `min_role_count` int(11) NULL DEFAULT NULL COMMENT '最小角色数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for item_log
-- ----------------------------
DROP TABLE IF EXISTS `item_log`;
CREATE TABLE `item_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `player_id` int(11) NULL DEFAULT NULL COMMENT '玩家ID',
  `op` int(11) NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL COMMENT '数量',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `goods_id` int(11) NULL DEFAULT NULL COMMENT '道具ID',
  `goods_type` int(11) NULL DEFAULT NULL COMMENT '货币类型',
  `create_time` datetime NULL DEFAULT NULL,
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 341 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for level_flow
-- ----------------------------
DROP TABLE IF EXISTS `level_flow`;
CREATE TABLE `level_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for login_flow
-- ----------------------------
DROP TABLE IF EXISTS `login_flow`;
CREATE TABLE `login_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ip',
  `login_time` datetime NULL DEFAULT NULL COMMENT '登入时间',
  `logout_time` datetime NULL DEFAULT NULL COMMENT '登出时间',
  `online_time_length` double(11, 2) NULL DEFAULT NULL COMMENT '在线时长',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for logon_statistics
-- ----------------------------
DROP TABLE IF EXISTS `logon_statistics`;
CREATE TABLE `logon_statistics`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `logon_count` int(11) NULL DEFAULT NULL COMMENT '登录人数',
  `logon_number` int(11) NULL DEFAULT NULL COMMENT '登录次数',
  `avg_logon_number` decimal(11, 4) NULL DEFAULT NULL COMMENT '平均登录次数',
  `old_player_count` int(11) NULL DEFAULT NULL COMMENT '老玩家数',
  `old_player_online_time` int(11) NULL DEFAULT NULL COMMENT '老玩家在线时长',
  `old_player_avg_online_time` decimal(11, 4) NULL DEFAULT NULL COMMENT '老玩家平均时长',
  `old_player_arpu` decimal(11, 4) NULL DEFAULT NULL COMMENT '老玩家留存',
  `active_player_count` int(11) NULL DEFAULT NULL COMMENT '活跃玩家数',
  `loyal_player_count` int(11) NULL DEFAULT NULL COMMENT '忠实玩家数',
  `total_registration` int(11) NULL DEFAULT NULL COMMENT '总注册量',
  `old_player_equipment` int(11) NULL DEFAULT NULL COMMENT '老玩家设备数',
  `package_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包名称',
  `package_id` int(11) NULL DEFAULT NULL COMMENT '包id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for mail_character
-- ----------------------------
DROP TABLE IF EXISTS `mail_character`;
CREATE TABLE `mail_character`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `mail_id` bigint(20) NOT NULL COMMENT '邮件ID',
  `char_id` bigint(20) NOT NULL COMMENT '角色ID',
  `char_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_mail_character_id`(`mail_id`, `char_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for mail_log
-- ----------------------------
DROP TABLE IF EXISTS `mail_log`;
CREATE TABLE `mail_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `server_id` bigint(20) NOT NULL COMMENT '区服ID',
  `mail_type` int(11) NOT NULL DEFAULT 0 COMMENT '邮件类型：1：全服发送、2：等级范围、3：指定角色',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `vocation` int(11) NULL DEFAULT NULL COMMENT 'vocation，暂时不知道什么用',
  `min_lev` int(11) NULL DEFAULT NULL COMMENT '最小等级',
  `max_lev` int(11) NULL DEFAULT NULL COMMENT '最大等级',
  `sender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发送人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '记录创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `rewards` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '奖励',
  `playerids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玩家',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 164 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for mail_reward
-- ----------------------------
DROP TABLE IF EXISTS `mail_reward`;
CREATE TABLE `mail_reward`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `mail_id` bigint(20) NOT NULL COMMENT '邮件ID',
  `reward_id` bigint(20) NULL DEFAULT NULL COMMENT '奖励ID',
  `reward` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '奖励名称',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_mail_reward_id`(`mail_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for money_flow
-- ----------------------------
DROP TABLE IF EXISTS `money_flow`;
CREATE TABLE `money_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `money_type` int(11) NULL DEFAULT NULL COMMENT '金钱类型',
  `change_money` int(11) NULL DEFAULT NULL COMMENT '变动的金钱',
  `change_bind_gold` int(11) NULL DEFAULT NULL COMMENT '变动的绑金',
  `left_gold` int(11) NULL DEFAULT NULL COMMENT '剩余的金钱',
  `left_bind_gold` int(11) NULL DEFAULT NULL COMMENT '剩余的绑金',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for new_user
-- ----------------------------
DROP TABLE IF EXISTS `new_user`;
CREATE TABLE `new_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `first_charge_count` int(11) NULL DEFAULT NULL COMMENT '首充玩家数量',
  `new_user_count` int(11) NULL DEFAULT NULL COMMENT '当日新增人数',
  `new_pay_sum` int(11) NULL DEFAULT NULL COMMENT '当日新增付费额度',
  `new_pay_rate` decimal(11, 4) NULL DEFAULT NULL COMMENT '当日新增用户付费率',
  `package_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包名称',
  `package_id` int(11) NULL DEFAULT NULL COMMENT '包id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `enable` int(11) NULL DEFAULT NULL COMMENT '0不启用、1启用',
  `start_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开始时间',
  `end_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for num
-- ----------------------------
DROP TABLE IF EXISTS `num`;
CREATE TABLE `num`  (
  `i` int(11) NULL DEFAULT NULL COMMENT '日历表辅助数字'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for online
-- ----------------------------
DROP TABLE IF EXISTS `online`;
CREATE TABLE `online`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `max_role_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最大角色数',
  `avg_role_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '平均角色数',
  `min_role_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最小角色数',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 503 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for online_now
-- ----------------------------
DROP TABLE IF EXISTS `online_now`;
CREATE TABLE `online_now`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色id',
  `char_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `last_login_time` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
  `max_online_length` int(11) NULL DEFAULT NULL COMMENT '累计在线时长',
  `map_id` int(11) NULL DEFAULT NULL COMMENT '该玩家所在的/下线的地图ID',
  `player_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '该玩家登录的IP地址',
  `online` int(11) NULL DEFAULT NULL COMMENT '0离线、1在线',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `server_id` int(11) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` int(11) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for other_flow
-- ----------------------------
DROP TABLE IF EXISTS `other_flow`;
CREATE TABLE `other_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `sub_type` int(11) NULL DEFAULT NULL COMMENT '子类型',
  `change_value` int(11) NULL DEFAULT NULL COMMENT '变化值',
  `extended_value1` int(11) NULL DEFAULT NULL COMMENT '扩展值1',
  `extended_value2` int(11) NULL DEFAULT NULL COMMENT '扩展值2',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for pay_ltv
-- ----------------------------
DROP TABLE IF EXISTS `pay_ltv`;
CREATE TABLE `pay_ltv`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `report_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '记录日期',
  `char_count` int(11) NULL DEFAULT NULL COMMENT '当日创角数',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_pay_ltv_id`(`channel_id`, `server_id`, `report_date`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for pay_ltv_day
-- ----------------------------
DROP TABLE IF EXISTS `pay_ltv_day`;
CREATE TABLE `pay_ltv_day`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `pay_ltv_id` bigint(20) NULL DEFAULT NULL COMMENT '主表ID',
  `days` int(11) NULL DEFAULT NULL COMMENT '天数',
  `average` decimal(11, 2) NULL DEFAULT NULL COMMENT '平均值',
  `summary` decimal(11, 2) NULL DEFAULT NULL COMMENT '汇总值',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_pay_ltv_day`(`pay_ltv_id`, `days`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for pay_retention_rate
-- ----------------------------
DROP TABLE IF EXISTS `pay_retention_rate`;
CREATE TABLE `pay_retention_rate`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `report_date` datetime NULL DEFAULT NULL COMMENT '付费日期',
  `user_count` int(11) NULL DEFAULT NULL COMMENT '用户数',
  `one_day` decimal(11, 4) NULL DEFAULT NULL COMMENT '一天留存',
  `two_day` decimal(11, 4) NULL DEFAULT NULL COMMENT '二天留存',
  `three_day` decimal(11, 4) NULL DEFAULT NULL COMMENT '三天留存',
  `four_day` decimal(11, 4) NULL DEFAULT NULL COMMENT '四天留存',
  `five_day` decimal(11, 4) NULL DEFAULT NULL COMMENT '五天留存',
  `six_day` decimal(11, 4) NULL DEFAULT NULL COMMENT '六天留存',
  `seven_day` decimal(11, 4) NULL DEFAULT NULL COMMENT '七天留存',
  `two_weeks` decimal(11, 4) NULL DEFAULT NULL COMMENT '二周留存',
  `one_month` decimal(11, 4) NULL DEFAULT NULL COMMENT '一月留存',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `status` int(11) NULL DEFAULT NULL,
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `package_id` int(11) NULL DEFAULT NULL COMMENT '包id',
  `package_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for player_action_daily
-- ----------------------------
DROP TABLE IF EXISTS `player_action_daily`;
CREATE TABLE `player_action_daily`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `report_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '汇总日期',
  `player_count` int(11) NULL DEFAULT NULL COMMENT '注册数',
  `char_count` int(11) NULL DEFAULT NULL COMMENT '创角数',
  `login_count` int(11) NULL DEFAULT NULL COMMENT '登录数',
  `logoff_count` int(11) NULL DEFAULT NULL COMMENT '离线数',
  `online_time` bigint(20) NULL DEFAULT NULL COMMENT '在线时长',
  `device_count` int(11) NULL DEFAULT NULL COMMENT '设备数',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_player_action_daily_id`(`channel_id`, `server_id`, `report_date`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for player_action_log
-- ----------------------------
DROP TABLE IF EXISTS `player_action_log`;
CREATE TABLE `player_action_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `device_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备号',
  `action` int(11) NULL DEFAULT NULL COMMENT '动作类型：1激活、2注册、3创建角色、4登录、5离线、6增钻石、7减钻石、8加金币、9减金币、10增物品、11减物品、12加体力、13减体力、14加成就、15减成就、16加货币、17减货币、18加经验、19加通用物品、20减通用物品、21充值、22增加仙晶、23减少仙晶、24增加绑定仙晶、25减少绑定仙晶',
  `action_value` int(11) NULL DEFAULT NULL COMMENT '动作值',
  `action_date` datetime NULL DEFAULT NULL COMMENT '动作触发时间',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器ID',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家ID',
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `online_time` bigint(20) NULL DEFAULT NULL COMMENT '在线时长',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_player_action`(`device_id`, `action`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for player_character
-- ----------------------------
DROP TABLE IF EXISTS `player_character`;
CREATE TABLE `player_character`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器名称',
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `char_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `vip_level` int(11) NULL DEFAULT NULL COMMENT 'VIP等级',
  `power` int(11) NULL DEFAULT NULL COMMENT '战斗力',
  `faction_id` int(11) NULL DEFAULT NULL COMMENT '帮派ID',
  `faction_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '帮派名称',
  `job` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职业',
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
  `status` int(11) NULL DEFAULT 1 COMMENT '状态:2封禁',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `operate_status` int(11) NULL DEFAULT 1 COMMENT '状态:1正常、2封禁',
  `package_id` int(11) NULL DEFAULT NULL COMMENT '包id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_player_char_id`(`player_id`, `char_id`, `char_name`, `server_id`, `status`) USING BTREE,
  INDEX `idx_char_id`(`char_id`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for player_new
-- ----------------------------
DROP TABLE IF EXISTS `player_new`;
CREATE TABLE `player_new`  (
  `player_id` bigint(20) UNSIGNED NULL DEFAULT NULL,
  `accName` varchar(63) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `vocation` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `exp` int(10) UNSIGNED NULL DEFAULT 0,
  `coin` int(10) UNSIGNED NULL DEFAULT 0,
  `diamond` int(10) UNSIGNED NULL DEFAULT 0,
  `chargeDiamond` int(10) UNSIGNED NULL DEFAULT 0,
  `vip` int(10) UNSIGNED NULL DEFAULT 0,
  `energy` int(10) UNSIGNED NULL DEFAULT 0,
  `regTime` datetime NULL DEFAULT NULL,
  `lastLoginTime` datetime NULL DEFAULT NULL,
  `lastLogoutTime` datetime NULL DEFAULT NULL,
  `ip` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sceneId` int(10) UNSIGNED NULL DEFAULT 0,
  `x` float NULL DEFAULT 0,
  `y` float NULL DEFAULT 0,
  `lastSceneId` int(10) UNSIGNED NULL DEFAULT 0,
  `lev` smallint(5) UNSIGNED NULL DEFAULT 1,
  `crit` int(10) UNSIGNED NULL DEFAULT 0,
  `hp` int(10) UNSIGNED NULL DEFAULT 0,
  `symptom` int(10) UNSIGNED NULL DEFAULT 0,
  `fu` int(10) UNSIGNED NULL DEFAULT 0,
  `fight` int(10) UNSIGNED NULL DEFAULT 0,
  `z` float NULL DEFAULT 0,
  `fashionId` int(10) UNSIGNED NULL DEFAULT 0,
  `gangId` int(10) UNSIGNED NULL DEFAULT 0,
  `totalCoin` int(10) UNSIGNED NULL DEFAULT 0,
  `weaponId` int(10) UNSIGNED NULL DEFAULT 0,
  `energyTime` bigint(20) UNSIGNED NULL DEFAULT 0,
  `totalDiamond` int(10) UNSIGNED NULL DEFAULT 0,
  `channel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `attack` int(10) UNSIGNED NULL DEFAULT 0,
  `defense` int(10) UNSIGNED NULL DEFAULT 0,
  `title` int(10) UNSIGNED NULL DEFAULT 0,
  `achievement` int(11) NULL DEFAULT 0 COMMENT '成就点',
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` bigint(20) NULL DEFAULT NULL COMMENT '充值模式',
  `amount` bigint(20) NULL DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `Index_accName`(`accName`) USING BTREE,
  INDEX `Index_name`(`name`) USING BTREE,
  INDEX `Index_fight`(`fight`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '玩家表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for player_order
-- ----------------------------
DROP TABLE IF EXISTS `player_order`;
CREATE TABLE `player_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `order_id` bigint(20) NULL DEFAULT NULL COMMENT '订单ID',
  `order_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `channel_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器ID',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器名称',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家ID',
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `item_id` bigint(20) NULL DEFAULT NULL COMMENT '购买商品ID',
  `item_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '购买商品价格',
  `amount` decimal(10, 2) NULL DEFAULT NULL COMMENT '订单金额',
  `gold_quantity` int(11) NULL DEFAULT NULL COMMENT '元宝数量',
  `order_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单类型',
  `order_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单状态',
  `sync_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '同步状态',
  `char_level` int(11) NULL DEFAULT NULL COMMENT '角色等级',
  `char_gold` int(11) NULL DEFAULT NULL COMMENT '角色现有元宝',
  `char_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `item_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `paid_date` datetime NULL DEFAULT NULL COMMENT '支付成功时间',
  `recharged_date` datetime NULL DEFAULT NULL COMMENT '充值成功时间',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态;1成功、2失败、3错误',
  `create_time` datetime NULL DEFAULT NULL COMMENT '订单创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_order_id`(`order_id`, `status`) USING BTREE,
  INDEX `idx_order`(`order_id`, `server_id`, `player_id`, `char_id`, `item_id`, `status`, `channel_id`) USING BTREE,
  INDEX `idx_order_date`(`order_id`, `create_time`, `paid_date`, `recharged_date`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for players_diamond_logs
-- ----------------------------
DROP TABLE IF EXISTS `players_diamond_logs`;
CREATE TABLE `players_diamond_logs`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `player_id` int(11) NULL DEFAULT NULL,
  `item_id` int(11) NULL DEFAULT NULL,
  `op_type` int(11) NULL DEFAULT NULL COMMENT '1增加、2减少',
  `param` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `count` int(10) UNSIGNED NULL DEFAULT NULL,
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '钻石日志' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for prohibition
-- ----------------------------
DROP TABLE IF EXISTS `prohibition`;
CREATE TABLE `prohibition`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器id',
  `closure_type` int(11) NULL DEFAULT NULL COMMENT '1封禁操作，2解封操作',
  `closure_way` int(11) NULL DEFAULT NULL COMMENT '封禁类型：1禁言, 2封号，3禁ip，4禁IMEI，5 踢下线',
  `closure_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '需要封禁或解禁的目标，根据封禁类型值不同：1禁言：角色ID，2封号：玩家账号，3禁IP：IP，4禁IMEI：IMEI，5 踢下线：角色ID',
  `closure_time` bigint(20) NULL DEFAULT NULL COMMENT '封禁时间（按秒数，-1为永久封禁），解封操作时传0',
  `end_time` datetime NULL DEFAULT NULL COMMENT '封禁结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for prop_flow
-- ----------------------------
DROP TABLE IF EXISTS `prop_flow`;
CREATE TABLE `prop_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `sub_type` int(11) NULL DEFAULT NULL COMMENT '子类型',
  `prop_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '道具名称',
  `count` int(11) NULL DEFAULT NULL COMMENT '数量',
  `binding_status` int(11) NULL DEFAULT NULL COMMENT '绑定状态',
  `trading_party` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易方',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ranking
-- ----------------------------
DROP TABLE IF EXISTS `ranking`;
CREATE TABLE `ranking`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `player_id` int(11) NULL DEFAULT NULL COMMENT '玩家id',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '排行类型:1玩家战力、2无尽试炼、3玩家等级、4仙盟排行、5宠物、6坐骑、7羽翼等级排行、8送花排行、9收花排行、10恶人榜排行、11英雄榜排行、12竞技场排行',
  `sort_value` int(11) NULL DEFAULT NULL COMMENT '排序值',
  `contrast_value` int(11) NULL DEFAULT NULL COMMENT '对比值',
  `extra_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '额外值:1过关时间、2仙盟战力',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_player_action`(`player_id`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '排行表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for rankings_flow
-- ----------------------------
DROP TABLE IF EXISTS `rankings_flow`;
CREATE TABLE `rankings_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `numerical_value` int(11) NULL DEFAULT NULL COMMENT '数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for recharge_daily
-- ----------------------------
DROP TABLE IF EXISTS `recharge_daily`;
CREATE TABLE `recharge_daily`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '服务器ID',
  `report_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '汇总日期',
  `recharge_sum` int(11) NULL DEFAULT NULL COMMENT '充值人数（总）',
  `recharge_amount` decimal(11, 2) NULL DEFAULT NULL COMMENT '充值金额（总）',
  `append_sum` int(11) NULL DEFAULT NULL COMMENT '新增充值人数',
  `append_amount` decimal(11, 2) NULL DEFAULT NULL COMMENT '新增充值金额',
  `gold_sum` int(11) NULL DEFAULT NULL COMMENT '充值元宝（总）',
  `gold_append` int(11) NULL DEFAULT NULL COMMENT '新增充值元宝',
  `arpu_sum` decimal(11, 2) NULL DEFAULT NULL COMMENT 'ARPU（总）',
  `arpu_append` decimal(11, 2) NULL DEFAULT NULL COMMENT '新增ARPU',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_recharge_daily`(`server_id`, `channel_id`, `report_date`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for recharge_erroneous_order
-- ----------------------------
DROP TABLE IF EXISTS `recharge_erroneous_order`;
CREATE TABLE `recharge_erroneous_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色id',
  `char_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `amount` decimal(10, 2) NULL DEFAULT NULL COMMENT '金额',
  `error_message` int(11) NULL DEFAULT NULL COMMENT '错误信息:1签名错误、2签名失败、3订单已存在',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `report_date` datetime NULL DEFAULT NULL COMMENT '订单时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for recharge_failed_order
-- ----------------------------
DROP TABLE IF EXISTS `recharge_failed_order`;
CREATE TABLE `recharge_failed_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `char_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `char_level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `gold_quantity` int(11) NULL DEFAULT NULL COMMENT '元宝',
  `amount` decimal(10, 2) NULL DEFAULT NULL COMMENT '金额',
  `reason` int(11) NULL DEFAULT 1 COMMENT '失败原因:1服务器不正确、2账号或角色不存在、3需重新同步(即可补单)',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态：',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `report_date` datetime NULL DEFAULT NULL COMMENT '订单时间',
  `char_id` bigint(20) NULL DEFAULT NULL COMMENT '角色id',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '玩家id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for recharge_monthly
-- ----------------------------
DROP TABLE IF EXISTS `recharge_monthly`;
CREATE TABLE `recharge_monthly`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `channel_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `server_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `open_date` datetime NULL DEFAULT NULL COMMENT '开服日期',
  `recharge_amount` decimal(11, 2) NULL DEFAULT NULL COMMENT '充值总数',
  `recharge_year` int(5) NULL DEFAULT NULL COMMENT '年份',
  `recharge_month` int(5) NULL DEFAULT NULL COMMENT '月份',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_recharge_monthly_id`(`channel_id`, `server_id`, `status`) USING BTREE,
  INDEX `idx_recharge_monthly_time`(`recharge_year`, `recharge_month`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for recharge_monthly_day
-- ----------------------------
DROP TABLE IF EXISTS `recharge_monthly_day`;
CREATE TABLE `recharge_monthly_day`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `recharge_monthly_id` bigint(20) NULL DEFAULT NULL COMMENT '充值汇总月份ID',
  `recharge_day` int(5) NULL DEFAULT NULL COMMENT '日期',
  `amount` decimal(11, 2) NULL DEFAULT NULL COMMENT '充值汇总金额',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_recharge_monthly_day`(`recharge_monthly_id`, `recharge_day`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for recharge_simulation
-- ----------------------------
DROP TABLE IF EXISTS `recharge_simulation`;
CREATE TABLE `recharge_simulation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `server_id` bigint(20) NULL DEFAULT NULL,
  `channel_id` bigint(20) NULL DEFAULT NULL,
  `server_name` char(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器',
  `user_name` char(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `player_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `date` date NULL DEFAULT NULL COMMENT '时间',
  `operater` char(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作创建人',
  `charge_amount` bigint(20) NULL DEFAULT NULL COMMENT '充值元宝',
  `charge_type` int(11) NULL DEFAULT NULL COMMENT '充值模式',
  `status` int(11) NULL DEFAULT 0 COMMENT '状态',
  `state` int(11) NULL DEFAULT 0 COMMENT '订单状态',
  `create_time` date NULL DEFAULT NULL,
  `update_time` date NULL DEFAULT NULL,
  UNIQUE INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for registered_data
-- ----------------------------
DROP TABLE IF EXISTS `registered_data`;
CREATE TABLE `registered_data`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `equipment_count` int(11) NULL DEFAULT NULL COMMENT '设备数',
  `activation_count` int(11) NULL DEFAULT NULL COMMENT '激活数',
  `loss_rate` decimal(10, 4) NULL DEFAULT NULL COMMENT '页面流失率',
  `package_id` int(11) NULL DEFAULT NULL COMMENT '包id',
  `package_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for server
-- ----------------------------
DROP TABLE IF EXISTS `server`;
CREATE TABLE `server`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `server_id` bigint(20) NOT NULL COMMENT '区服id',
  `server_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '服务器名称',
  `server_state` int(11) NULL DEFAULT 4 COMMENT '服务器状态:1开放、2维护、3隐藏、4关闭',
  `show_number` int(11) NULL DEFAULT NULL COMMENT '显示编号',
  `label` int(255) NULL DEFAULT NULL COMMENT '标签:1一般、2火爆、3爆满、4新服、5推荐、6审核服、7代理服',
  `ip` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'IP地址',
  `port` int(11) NULL DEFAULT NULL COMMENT '端口号',
  `pay_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '付费通知地址',
  `open_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '开服时间',
  `close_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关服时间',
  `remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `white_list` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '白名单',
  `white_list_enable` int(11) NULL DEFAULT NULL COMMENT '白名单启用:0关闭、1启用',
  `maintenance_tips` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '维护提示',
  `gm_port` int(11) NULL DEFAULT NULL COMMENT '后台端口',
  `server_group` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '组',
  `channel` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '渠道',
  `open` int(11) NULL DEFAULT NULL COMMENT '0关闭、1开启',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_server_id`(`server_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for server_online_log
-- ----------------------------
DROP TABLE IF EXISTS `server_online_log`;
CREATE TABLE `server_online_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `report_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '记录年月日',
  `report_hour` int(11) NULL DEFAULT NULL COMMENT '记录小时',
  `online_count` int(11) NULL DEFAULT NULL COMMENT '在线人数',
  `max_online_count` int(11) NULL DEFAULT NULL COMMENT '最大在线人数',
  `status` int(11) NULL DEFAULT NULL COMMENT '记录状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_server_online_id`(`server_id`, `report_date`, `report_hour`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for single_service_bag
-- ----------------------------
DROP TABLE IF EXISTS `single_service_bag`;
CREATE TABLE `single_service_bag`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `number_background_activation_codes` int(11) NULL DEFAULT NULL COMMENT '后台激活码数量',
  `number_single_service_activation_codes` int(11) NULL DEFAULT NULL COMMENT '单服激活码数量',
  `differential_batch` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '差异批次',
  `single_service_status` int(11) NULL DEFAULT NULL COMMENT '单服状态',
  `single_service_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单服名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for statics_summary
-- ----------------------------
DROP TABLE IF EXISTS `statics_summary`;
CREATE TABLE `statics_summary`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道ID',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服ID',
  `report_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '报告日期',
  `player_count` int(11) NULL DEFAULT NULL COMMENT '新增注册数',
  `char_count` int(11) NULL DEFAULT NULL COMMENT '新增创角数',
  `login_count` int(11) NULL DEFAULT NULL COMMENT '登录角色数',
  `online_count` int(11) NULL DEFAULT NULL COMMENT '最高在线数',
  `active_char_count` int(11) NULL DEFAULT NULL COMMENT '活跃角色数',
  `recharge_sum` decimal(11, 2) NULL DEFAULT NULL COMMENT '收入',
  `recharge_count` int(11) NULL DEFAULT NULL COMMENT '付费人数',
  `arpu` decimal(11, 2) NULL DEFAULT NULL COMMENT 'ARPU值',
  `new_recharge_count` int(11) NULL DEFAULT NULL COMMENT '新增付费人数',
  `new_recharge_rate` decimal(11, 2) NULL DEFAULT NULL COMMENT '新增付费率',
  `stay2d` decimal(11, 2) NULL DEFAULT NULL COMMENT '次日留存',
  `stay3d` decimal(11, 2) NULL DEFAULT NULL COMMENT '三日留存',
  `stay7d` decimal(11, 2) NULL DEFAULT NULL COMMENT '七日留存',
  `status` int(11) NULL DEFAULT NULL COMMENT '记录状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_statics_summary_id`(`channel_id`, `server_id`, `report_date`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for task_flow
-- ----------------------------
DROP TABLE IF EXISTS `task_flow`;
CREATE TABLE `task_flow`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `server_id` bigint(20) NULL DEFAULT NULL COMMENT '区服id',
  `server_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区服名称',
  `channel_id` bigint(20) NULL DEFAULT NULL COMMENT '渠道id',
  `channel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '渠道名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `task_id` int(11) NULL DEFAULT NULL COMMENT '任务id',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码(加密)',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `user_type` int(11) NULL DEFAULT NULL COMMENT '用户类型',
  `last_login` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
  `first_login` datetime NULL DEFAULT NULL COMMENT '首次登录时间',
  `status` int(11) NULL DEFAULT 1 COMMENT '状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_user`(`username`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Procedure structure for channel_daily_import
-- ----------------------------
DROP PROCEDURE IF EXISTS `channel_daily_import`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `channel_daily_import`(IN `startDate` varchar(255),IN `endDate` varchar(255),IN `type` int(10))
BEGIN
	DECLARE i int(10);#定义i变量
	DECLARE j int(10);#定义j变量
	DECLARE dateTemp varchar(400);#日期
	DECLARE dayLength int(10);#日期区间的天数
	DECLARE typeTemp varchar(255);#类型
	DECLARE symbol varchar(255);#符号--末尾无逗号
	SET i =0;	
	SELECT DATEDIFF(endDate,startDate) INTO dayLength;#获取日期区间的天数
	
	set @SQL = 'select channel_id,sum( t1.';
	set symbol='",';
	
	if type = 1 then
		set typeTemp='recharge_amount';
	else
		set typeTemp='register_number';
	end if;
	
	set @SQL = concat(@SQL,typeTemp,' ) as summary,');
	
	while(i<=dayLength) do
		SELECT datelist INTO dateTemp FROM calendar WHERE datelist = DATE_ADD(startDate,INTERVAL i DAY);#将查询结果赋值给dateTemp
		
		if i=dayLength then
			set symbol='"';
		end if;
		
		set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="',dateTemp,'" then ',typeTemp,' else 0 end)"',dateTemp,symbol);
					
		SET i = i+1;
		
	end while;
	
	set @SQL= concat(@SQL,' from comprehensive_report_data_collection t1 WHERE ');
	set @SQL= concat(@SQL,' DATE_FORMAT( report_date, "%Y-%m-%d" ) >= "',startDate,'"');
	set @SQL= concat(@SQL,' AND DATE_FORMAT( report_date, "%Y-%m-%d" ) <= "',endDate,'"' ); 
	set @SQL= concat(@SQL,' group by channel_id');
	
	prepare stmt from @SQL;#预处理需要执行的动态SQL，其中stmt是一个变量
	EXECUTE stmt;#执行SQL语句
	deallocate prepare stmt;#释放掉预处理段
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for channel_daily_import2
-- ----------------------------
DROP PROCEDURE IF EXISTS `channel_daily_import2`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `channel_daily_import2`(IN `startDate` varchar(255),IN `endDate` varchar(255),IN `type` int(10))
BEGIN
	DECLARE i int(10);#定义i变量
	DECLARE j int(10);#定义j变量
	DECLARE dateTemp varchar(400);#日期
	DECLARE dayLength int(10);#日期区间的天数
	DECLARE typeTemp varchar(255);#类型
	DECLARE symbol varchar(255);#符号--末尾无逗号
	SET i =0;	
	SELECT DATEDIFF(endDate,startDate) INTO dayLength;#获取日期区间的天数
	
	set @SQL = 'select t2.channel_id,t1.* from(select channel_id,sum( t1.';
	set symbol='",';
	
	if type = 1 then
		set typeTemp='recharge_amount';
	else
		set typeTemp='register_number';
	end if;
	
	set @SQL = concat(@SQL,typeTemp,' ) as summary,');
	
	while(i<=dayLength) do
		SELECT datelist INTO dateTemp FROM calendar WHERE datelist = DATE_ADD(startDate,INTERVAL i DAY);#将查询结果赋值给dateTemp
		
		if i=dayLength then
			set symbol='"';
		end if;
		
		set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="',dateTemp,'" then ',typeTemp,' else 0 end)"',dateTemp,symbol);
					
		SET i = i+1;
		
	end while;
	
	set @SQL= concat(@SQL,' from comprehensive_report_data_collection t1 WHERE ');
	set @SQL= concat(@SQL,' DATE_FORMAT( report_date, "%Y-%m-%d" ) >= "',startDate,'"');
	set @SQL= concat(@SQL,' AND DATE_FORMAT( report_date, "%Y-%m-%d" ) <= "',endDate,'"' ); 
	set @SQL= concat(@SQL,' group by channel_id) t1');
	set @SQL= concat(@SQL,' RIGHT JOIN channel t2 ON t1.channel_id=t2.channel_id');
	
	prepare stmt from @SQL;#预处理需要执行的动态SQL，其中stmt是一个变量
	EXECUTE stmt;#执行SQL语句
	deallocate prepare stmt;#释放掉预处理段
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for NewProc
-- ----------------------------
DROP PROCEDURE IF EXISTS `NewProc`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc`()
BEGIN
  DECLARE result varchar(4000) ;
  DECLARE result2 varchar(4000) ;
	DECLARE i int(10);	#定义i变量
	DECLARE j int(10);	#定义j变量
	DECLARE date2 varchar(400);	#日期
	SET i =0;
	SET j =30;
	SET @dateSql = 'SELECT ';
	SET @dateSql2 = '';
	SET @SQL = 'select channel_id,';

	while(i<j) do
		SELECT datelist INTO date2 FROM calendar WHERE datelist = curdate()+i;
		#SELECT date2;
		
		if i=j-1 then
			set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="',date2,'" then recharge_amount else 0 end)"',date2,'"');
		else
			set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="',date2,'" then recharge_amount else 0 end)"',date2,'",');
		end if;
		
		SET i = i+1;
		
	end while;
	
	set @SQL= concat(@SQL,' from comprehensive_report_data_collection group by channel_id');
	prepare stmt from @SQL;## 预处理需要执行的动态SQL，其中stmt是一个变量
	EXECUTE stmt;## 执行SQL语句
	deallocate prepare stmt;## 释放掉预处理段
	SELECT result;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for NewProc2
-- ----------------------------
DROP PROCEDURE IF EXISTS `NewProc2`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc2`()
BEGIN
  DECLARE result varchar(4000) ;
	DECLARE i int(10);	#定义i变量
	DECLARE j int(10);	#定义j变量
	DECLARE date varchar(4000);	#日期
	SET i =0;
	SET j =5;
	SET @dateSql = 'SELECT datelist FROM calendar WHERE datelist = curdate()';
	SET @dateSql2 = '';
	SET @SQL = 'select channel_id,';

	while(i<j) do
		set @dateSql2=concat(@dateSql,'+',i);
		prepare stmt from @dateSql2;
		EXECUTE stmt;
		deallocate prepare stmt;
		set date = @SQL;
		
		if i=j-1 then
			set @SQL= concat(@SQL , 'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="' , date ,'" then recharge_amount else 0 end)"',date,'"');
		else
			set @SQL= concat(@SQL , 'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="' , date ,'" then recharge_amount else 0 end)"',date,'",');
		end if;
		
		SET i = i+1;
		
	end while;
	
	set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="2018-06-10" then recharge_amount else 0 end)"2018-06-10"');
	
	
	set @SQL= concat(@SQL,' from comprehensive_report_data_collection group by channel_id');
	prepare stmt from @SQL;## 预处理需要执行的动态SQL，其中stmt是一个变量
	EXECUTE stmt;## 执行SQL语句
	deallocate prepare stmt;## 释放掉预处理段
	set result = @SQL;
	SELECT result;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for NewProc3
-- ----------------------------
DROP PROCEDURE IF EXISTS `NewProc3`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc3`()
BEGIN
  DECLARE c varchar(4000) ;
	SET @SQL = 'select channel_id,';	
	set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="2018-06-10" then recharge_amount else 0 end)"2018-06-10"');
	set @SQL= concat(@SQL,' from comprehensive_report_data_collection group by channel_id');
	prepare stmt from @SQL;## 预处理需要执行的动态SQL，其中stmt是一个变量
	EXECUTE stmt;## 执行SQL语句
	deallocate prepare stmt;## 释放掉预处理段
	set c = @SQL;
	SELECT c;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for NewProc4
-- ----------------------------
DROP PROCEDURE IF EXISTS `NewProc4`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc4`()
BEGIN
	DECLARE date2 varchar(400);	#日期	
	SELECT datelist INTO date2 FROM calendar WHERE datelist = curdate();
	SELECT date2;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for NewProc5
-- ----------------------------
DROP PROCEDURE IF EXISTS `NewProc5`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc5`(IN `startDate` varchar(255),IN `endDate` varchar(255))
BEGIN
  DECLARE result varchar(4000) ;
  DECLARE result2 varchar(4000) ;
	DECLARE i int(10);#定义i变量
	DECLARE j int(10);#定义j变量
	DECLARE dateTemp varchar(400);#日期
	DECLARE dayLength int(10);#日期区间的天数
	SET i =0;	
	SELECT DATEDIFF(endDate,startDate) INTO dayLength;#获取日期区间的天数
	
	SET @SQL = 'select channel_id,';
	
	while(i<=dayLength) do
		SELECT datelist INTO dateTemp FROM calendar WHERE datelist = DATE_ADD(startDate,INTERVAL i DAY);#将查询结果赋值给dateTemp
		
		if i=dayLength then
			set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="',dateTemp,'" then recharge_amount else 0 end)"',dateTemp,'"');
		else
			set @SQL= concat(@SQL,'sum(case when DATE_FORMAT(report_date,"%Y-%m-%d")="',dateTemp,'" then recharge_amount else 0 end)"',dateTemp,'",');
		end if;
		
		SET i = i+1;
		
	end while;
	
	set @SQL= concat(@SQL,' from comprehensive_report_data_collection group by channel_id');
	prepare stmt from @SQL;#预处理需要执行的动态SQL，其中stmt是一个变量
	EXECUTE stmt;#执行SQL语句
	deallocate prepare stmt;#释放掉预处理段
	SELECT result;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test
-- ----------------------------
DROP PROCEDURE IF EXISTS `test`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test`(IN `a` int(10),IN `b` int(10))
BEGIN
	DECLARE c int(10);
	SET c =a+b;	
	SELECT c;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
