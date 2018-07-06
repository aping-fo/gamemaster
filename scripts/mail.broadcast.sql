DROP INDEX `idx_mail_reward_id` ON `mail_reward`;
DROP INDEX `idx_mail_character_id` ON `mail_character`;
DROP INDEX `idx_broadcast_id` ON `broadcast`;

DROP TABLE `mail_log`;
DROP TABLE `mail_reward`;
DROP TABLE `mail_character`;
DROP TABLE `broadcast`;

CREATE TABLE `mail_log` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`server_id` bigint(20) NOT NULL COMMENT '区服ID',
`mail_type` int(11) NOT NULL DEFAULT 0 COMMENT '邮件类型：1：全服发送、2：等级范围、3：指定角色',
`title` varchar(255) NULL COMMENT '标题',
`content` varchar(1000) NULL COMMENT '内容',
`vocation` int(11) NULL COMMENT 'vocation，暂时不知道什么用',
`min_lev` int(11) NULL COMMENT '最小等级',
`max_lev` int(11) NULL COMMENT '最大等级',
`sender` varchar(255) NULL COMMENT '发送人',
`status` int(11) NULL DEFAULT 1 COMMENT '记录状态',
`create_time` datetime NULL COMMENT '记录创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) 
);

CREATE TABLE `mail_reward` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`mail_id` bigint(20) NOT NULL COMMENT '邮件ID',
`reward_id` bigint(20) NULL COMMENT '奖励ID',
`reward` varchar(255) NULL COMMENT '奖励名称',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_mail_reward_id` (`mail_id` ASC)
);

CREATE TABLE `mail_character` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`mail_id` bigint(20) NOT NULL COMMENT '邮件ID',
`char_id` bigint(20) NOT NULL COMMENT '角色ID',
`char_name` varchar(255) NULL COMMENT '角色名称',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_mail_character_id` (`mail_id` ASC, `char_id` ASC)
);

CREATE TABLE `broadcast` (
`id` bigint(20) NOT NULL COMMENT '自增主键',
`channel_id` bigint(20) NOT NULL COMMENT '渠道ID',
`server_id` bigint(20) NOT NULL COMMENT '区服ID',
`broadcast_type` int(11) NOT NULL DEFAULT 0 COMMENT '广播类型，1：广播；2：公告',
`loop_times` int(11) NULL DEFAULT 1 COMMENT '循环次数',
`gap_second` int(11) NULL DEFAULT 0 COMMENT '间隔秒数',
`play_time` datetime NULL COMMENT '开始播放时间',
`title` varchar(255) NULL COMMENT '标题',
`content` varchar(2000) NULL COMMENT '内容',
`broadcast_status` int(11) NOT NULL DEFAULT 0 COMMENT '公告广播状态，1：有效；2：关闭',
`status` int(11) NULL DEFAULT 1 COMMENT '记录状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_broadcast_id` (`channel_id` ASC, `server_id` ASC, `broadcast_type` ASC, `broadcast_status` ASC)
);

