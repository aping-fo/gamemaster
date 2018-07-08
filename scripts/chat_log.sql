DROP INDEX `idx_chat_log_id` ON `chat_log`;

DROP TABLE `chat_log`;

CREATE TABLE `chat_log` (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`server_id` bigint(20) NOT NULL COMMENT '区服ID',
`char_id` bigint(20) NOT NULL COMMENT '角色ID',
`chat_channel` int(11) NOT NULL DEFAULT 0 COMMENT '聊天频道，1：世界；2：好友；3：公会/帮派；',
`to_char_id` bigint(20) NULL COMMENT '对象角色ID',
`content` varchar(255) NULL COMMENT '聊天内容',
`chat_time` datetime NULL COMMENT '聊天时间',
`status` int(11) NULL DEFAULT 1 COMMENT '状态',
`create_time` datetime NULL COMMENT '创建时间',
`update_time` datetime NULL COMMENT '更新时间',
PRIMARY KEY (`id`) ,
INDEX `idx_chat_log_id` (`server_id` ASC, `char_id` ASC, `chat_channel` ASC)
);

