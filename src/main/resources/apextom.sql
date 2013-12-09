# Host: 192.168.1.114  (Version: 5.5.17)
# Date: 2013-12-09 17:35:59
# Generator: MySQL-Front 5.3  (Build 2.42)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

DROP DATABASE IF EXISTS `apextom`;
CREATE DATABASE `apextom` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `apextom`;

#
# Source for table "menu"
#

DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `menu_url` varchar(255) DEFAULT NULL COMMENT '菜单链接',
  `pid` int(2) DEFAULT NULL COMMENT '父节点id',
  `menu_order` int(2) DEFAULT NULL COMMENT '菜单顺序',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='菜单';

#
# Data for table "menu"
#

INSERT INTO `menu` VALUES (1,'首页设置','/config/index',0,1),(2,'课程设置',NULL,0,2),(3,'课程1','/class/config/classid/1',2,1),(4,'课程2','/class/config/classid/2',2,2),(5,'课程3','/class/config/classid/3',2,3),(6,'课程4','/class/config/classid/4',2,4),(7,'课程5','/class/config/classid/5',2,5),(8,'课程6','/class/config/classid/6',2,6),(9,'课程7','/class/config/classid/7',2,7),(10,'课程8','/config/class/1',2,8),(11,'课程9','/config/class/1',2,9),(12,'课程10','/config/class/1',2,10),(13,'课程11','/config/class/1',2,11),(14,'课程12','/config/class/1',2,12),(15,'课程13','/config/class/1',2,13),(16,'文件下载','/config/download',0,3),(17,'系统设置','/config/system',0,4);

#
# Source for table "projects"
#

DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) NOT NULL DEFAULT '' COMMENT '栏目名称',
  `content` varchar(255) DEFAULT NULL COMMENT '描述',
  `ptype` char(1) NOT NULL DEFAULT '' COMMENT '栏目类型（0：常规栏目，1：课程类，2：其他）',
  `showflag` varchar(255) DEFAULT NULL COMMENT '展示在首页（0：不展示，1：展示）',
  `orders` int(3) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='栏目表';

#
# Data for table "projects"
#

INSERT INTO `projects` VALUES (1,'TOEFL','TOEFL','1','1',1),(2,'SAT','SAT','1','1',2),(3,'GRE','GRE','1','1',3),(4,'AP','AP','1','1',4);

#
# Source for table "sys_parms"
#

DROP TABLE IF EXISTS `sys_parms`;
CREATE TABLE `sys_parms` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `param_key` varchar(255) NOT NULL DEFAULT '' COMMENT '参数名',
  `param_value` varchar(255) NOT NULL DEFAULT '' COMMENT '参数值',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统参数表';

#
# Data for table "sys_parms"
#


#
# Source for table "users"
#

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `loginuser` varchar(50) NOT NULL DEFAULT '' COMMENT '登录名',
  `password` varchar(32) NOT NULL DEFAULT '' COMMENT '密码',
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名称',
  `rights` char(1) NOT NULL DEFAULT '0' COMMENT '权限（0：管理员，1：课程设置）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`Id`,`loginuser`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "users"
#

INSERT INTO `users` VALUES (1,'apextom','4QrcOUm6Wau+VuBX8g+IPg==','系统管理员','0','系统权限');

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
