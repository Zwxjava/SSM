/*
SQLyog Ultimate v11.26 (32 bit)
MySQL - 5.5.13 : Database - newhelp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`newhelp` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `newhelp`;

/*Table structure for table `appointment` */

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `book_id` bigint(20) NOT NULL COMMENT '图书ID',
  `student_id` bigint(20) NOT NULL COMMENT '学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间',
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='预约图书表';

/*Data for the table `appointment` */

insert  into `appointment`(`book_id`,`student_id`,`appoint_time`,`id`) values (1000,12345678910,'2018-08-24 17:09:07',1),(1001,12345678910,'2018-08-24 17:09:07',2);

/*Table structure for table `appr` */

DROP TABLE IF EXISTS `appr`;

CREATE TABLE `appr` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `custom_service_type` varchar(200) DEFAULT NULL COMMENT '自定义服务类型',
  `service_type` int(11) DEFAULT NULL COMMENT '大事件的感恩中使用，',
  `service_time` int(11) DEFAULT NULL COMMENT '大事件的感恩中使用，单位：分钟',
  `bigevent_id` bigint(20) DEFAULT NULL,
  `occur_at` bigint(20) NOT NULL COMMENT '时间统一为UTC标准',
  `content` varchar(5000) NOT NULL,
  `address` varchar(200) NOT NULL,
  `longitude` decimal(20,10) NOT NULL,
  `latitude` decimal(20,10) NOT NULL,
  `country_id` int(11) NOT NULL,
  `province_id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  `type` smallint(6) NOT NULL COMMENT '1-个人感恩（默认），2-组织感恩，3-对内置公众人物感恩',
  `person_type` smallint(6) NOT NULL COMMENT '1-1对1（默认）,2-1对多',
  `helpers` varchar(1000) DEFAULT NULL COMMENT '确认完成后的施助方用户ID列表，使用“:"分隔',
  `helpees` varchar(1000) DEFAULT NULL COMMENT '确认完成后的受助方用户ID列表，使用“:"分隔',
  `country_code` varchar(10) NOT NULL COMMENT '国家编码，中国是cn，美国是us',
  `sn` varchar(20) NOT NULL COMMENT '感恩编号，yyMMddHHmmss+8位随机码',
  `showed` smallint(6) NOT NULL DEFAULT '0' COMMENT '0-不显示（默认），1-显示',
  `opened` smallint(6) NOT NULL DEFAULT '1' COMMENT '0-不公开，1-公开（默认）',
  `finished` smallint(6) NOT NULL DEFAULT '0' COMMENT '0-未完成(默认)，1-完成',
  `deleted` smallint(6) NOT NULL DEFAULT '0' COMMENT '0-未删除（默认），1-已删除',
  `reported` smallint(6) NOT NULL DEFAULT '0' COMMENT '0-无举报（默认），1-有举报',
  `credited` smallint(6) DEFAULT '1' COMMENT '0-失信（举报成功），1-正常（默认）',
  `pubresult` smallint(6) NOT NULL DEFAULT '1' COMMENT '所有人都确认后的结果，1-未知，2-同意，3-拒绝',
  `create_by` bigint(20) NOT NULL,
  `create_at` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='感恩内容';

/*Data for the table `appr` */

/*Table structure for table `appr_user_rel` */

DROP TABLE IF EXISTS `appr_user_rel`;

CREATE TABLE `appr_user_rel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `appr_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `role` smallint(6) NOT NULL COMMENT '1-helper, 2-helpee',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='感恩人员关系，用户与感恩的关联';

/*Data for the table `appr_user_rel` */

/*Table structure for table `assistant` */

DROP TABLE IF EXISTS `assistant`;

CREATE TABLE `assistant` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) NOT NULL,
  `middleName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `e-mail` varchar(255) NOT NULL,
  `classNumber` int(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `assistant` */

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COMMENT='图书表';

/*Data for the table `book` */

insert  into `book`(`book_id`,`name`,`number`) values (1000,'Java程序设计',9),(1001,'数据结构',9),(1002,'设计模式',10),(1003,'编译原理',10);

/*Table structure for table `classtable` */

DROP TABLE IF EXISTS `classtable`;

CREATE TABLE `classtable` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classNumber` varchar(500) NOT NULL,
  `startTime` datetime NOT NULL,
  `endTime` datetime NOT NULL,
  `professorId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `classtable` */

/*Table structure for table `professor_register` */

DROP TABLE IF EXISTS `professor_register`;

CREATE TABLE `professor_register` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `schoolName` varchar(255) NOT NULL,
  `website` varchar(255) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `middleName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `e-mail` varchar(255) NOT NULL,
  `account` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `professor_register` */

/*Table structure for table `register_data` */

DROP TABLE IF EXISTS `register_data`;

CREATE TABLE `register_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '存放注册邮箱和验证码表的id',
  `e-mail` varchar(255) NOT NULL COMMENT '邮箱',
  `code` int(11) NOT NULL COMMENT '验证码',
  `isSignedUp` int(1) NOT NULL COMMENT '是否已经注册',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `register_data` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `studentNumber` int(200) NOT NULL,
  `appUserId` bigint(20) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `middleName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `e-mail` varchar(255) NOT NULL,
  `classNumber` varchar(500) NOT NULL,
  `gender` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `student` */

insert  into `student`(`id`,`studentNumber`,`appUserId`,`firstName`,`middleName`,`lastName`,`e-mail`,`classNumber`,`gender`) values (1,20180001,1,'Tommer','stu','Stu','20180001@qq.com','20180001','female'),(2,20180002,2,'Lucy','stu','Stu','20180002@qq.com','20180001','male');

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `login_name` varchar(100) NOT NULL COMMENT '登录名，手机号码或邮箱',
  `login_password` char(32) NOT NULL,
  `type` smallint(6) NOT NULL COMMENT '1-个人用户，2-组织用户，3-圣人，如耶稣，佛祖等，这种类型的用户不能注册登录，无需确认和被通知感恩；',
  `create_at` bigint(20) NOT NULL COMMENT '毫秒',
  `update_at` bigint(20) NOT NULL COMMENT '首次更新时间=创建时间',
  `last_login_at` bigint(20) DEFAULT NULL,
  `pwdcode` char(32) DEFAULT NULL COMMENT '用户重置密码请求发出后后台更新密码的验证码和有效期',
  `pwdcode_expire` bigint(20) DEFAULT NULL COMMENT '用户重置密码请求发出后后台更新密码的验证码和有效期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ind_login_name` (`login_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户，包括组织和个人';

/*Data for the table `userinfo` */

insert  into `userinfo`(`id`,`login_name`,`login_password`,`type`,`create_at`,`update_at`,`last_login_at`,`pwdcode`,`pwdcode_expire`) values (1,'1','1',1,20180824,20180824,20180824,'qcby',30);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
