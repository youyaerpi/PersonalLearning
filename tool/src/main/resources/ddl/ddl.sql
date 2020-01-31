ALTER TABLE `eusdk`.`uadmin`
MODIFY COLUMN `adminGames` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '管理游戏' AFTER `adminRoleName`;

ALTER TABLE `eusdk`.`uadmin`
MODIFY COLUMN

`adminGames` varchar(2048) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理游戏' AFTER `adminRoleName`;



UPDATE `pay_provider_param_tmpl` set `param_key` ='signCert' where id=14 and `param_key` ='acpProdSign'