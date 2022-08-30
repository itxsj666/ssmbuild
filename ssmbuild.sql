/*
 Navicat Premium Data Transfer

 Source Server         : 本地MySQL
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 28/04/2022 17:36:04
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books_copy1
-- ----------------------------
DROP TABLE IF EXISTS `books_copy1`;
CREATE TABLE `books_copy1`
(
    `bookID`     int                                                    NOT NULL AUTO_INCREMENT COMMENT '书id',
    `bookName`   varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书名',
    `bookcounts` int                                                    NOT NULL COMMENT '数量',
    `detail`     varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
    PRIMARY KEY (`bookID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books_copy1
-- ----------------------------
INSERT INTO `books_copy1`
VALUES (1, 'JAVA', 4, '从入门到放弃');
INSERT INTO `books_copy1`
VALUES (2, 'mysql', 10, '从删库到跑路');
INSERT INTO `books_copy1`
VALUES (3, 'liunx', 10, '从进门到进牢');
INSERT INTO `books_copy1`
VALUES (4, 'ggg', 4, 'gggggg');
INSERT INTO `books_copy1`
VALUES (5, 'ff', 5, 'ggggh');
INSERT INTO `books_copy1`
VALUES (6, 'fssssssss', 6, 'gffff');
INSERT INTO `books_copy1`
VALUES (8, 'ffsf', 4, '66666');
INSERT INTO `books_copy1`
VALUES (9, 'mm', 4, '1ew');

SET
FOREIGN_KEY_CHECKS = 1;
