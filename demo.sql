/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 17/04/2023 19:57:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for money
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money`  (
  `moneyid` varchar(11) CHARACTER SET utf32 COLLATE utf32_general_ci NOT NULL,
  `userid` varchar(11) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  `operate` varchar(255) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  `money` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`moneyid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf32 COLLATE = utf32_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` varchar(11) CHARACTER SET utf32 COLLATE utf32_general_ci NOT NULL,
  `money` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf32 COLLATE = utf32_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
