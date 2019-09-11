/*
Navicat MySQL Data Transfer

Source Server         : cdb-puhlb3l3.gz.tencentcdb.com_10076
Source Server Version : 50718
Source Host           : cdb-puhlb3l3.gz.tencentcdb.com:10076
Source Database       : traceability_mall

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-06-08 21:24:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods_brand
-- ----------------------------
DROP TABLE IF EXISTS `goods_brand`;
CREATE TABLE `goods_brand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `company_id` bigint(20) DEFAULT NULL COMMENT '公司ID',
  `brand_name` varchar(50) NOT NULL COMMENT '品牌名称',
  `initial_letter` char(2) DEFAULT NULL COMMENT '品牌首字母',
  `brand_description` varchar(255) DEFAULT NULL COMMENT '品牌描述',
  `brand_logo` varchar(255) DEFAULT NULL COMMENT '品牌logo',
  `sort_weight` int(10) unsigned DEFAULT NULL COMMENT '排序权重',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` tinyint(1) DEFAULT '1' COMMENT '状态：0：终止合作；1：正常合作；2：暂停合作',
  PRIMARY KEY (`id`),
  KEY `fk_goods_brand_goods_company_1` (`company_id`),
  CONSTRAINT `fk_goods_brand_goods_company_1` FOREIGN KEY (`company_id`) REFERENCES `goods_company` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='品牌表';

-- ----------------------------
-- Records of goods_brand
-- ----------------------------

-- ----------------------------
-- Table structure for goods_category
-- ----------------------------
DROP TABLE IF EXISTS `goods_category`;
CREATE TABLE `goods_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) unsigned DEFAULT NULL COMMENT '上级分类ID',
  `is_parent` tinyint(2) DEFAULT NULL COMMENT '是否为父节点(0：否；1：是)',
  `category_name` varchar(50) NOT NULL COMMENT '分类名称',
  `category_desc` varchar(255) DEFAULT NULL COMMENT '分类描述',
  `sort_weight` int(10) unsigned DEFAULT NULL COMMENT '排序权重',
  `category_logo` varchar(255) DEFAULT NULL COMMENT '分类logo',
  `is_show` tinyint(1) DEFAULT NULL COMMENT '是否展示：0：否；1：是',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='分类表';

-- ----------------------------
-- Records of goods_category
-- ----------------------------

-- ----------------------------
-- Table structure for goods_company
-- ----------------------------
DROP TABLE IF EXISTS `goods_company`;
CREATE TABLE `goods_company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(50) NOT NULL COMMENT '公司名称',
  `company_logo` varchar(255) DEFAULT NULL COMMENT '公司logo',
  `company_home` varchar(255) DEFAULT NULL COMMENT '公司主页',
  `sort_weight` int(10) unsigned DEFAULT NULL COMMENT '排序权重',
  `company_description` varchar(255) DEFAULT NULL COMMENT '公司描述',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `mall_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` tinyint(1) unsigned DEFAULT '1' COMMENT '合作状态：0：终止合作；1：正常合作；2：暂停合作',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='公司表';

-- ----------------------------
-- Records of goods_company
-- ----------------------------

-- ----------------------------
-- Table structure for goods_order_cart
-- ----------------------------
DROP TABLE IF EXISTS `goods_order_cart`;
CREATE TABLE `goods_order_cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `sku_Id` bigint(11) DEFAULT NULL COMMENT 'sku_id',
  `member_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `shop_id` bigint(11) DEFAULT NULL COMMENT '店铺ID',
  `order_id` int(11) DEFAULT NULL COMMENT '关联订单',
  `goods_num` int(11) DEFAULT NULL COMMENT '商品数量',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态(0：已移除；1：活动中；2：已转换)',
  `total_amount` decimal(10,2) DEFAULT '0.00' COMMENT '总金额',
  `total_point` int(11) DEFAULT '0' COMMENT '总积分',
  PRIMARY KEY (`id`),
  KEY `fk_goods_order_cart_user_member_1` (`member_id`),
  KEY `fk_goods_order_cart_goods_order_info_1` (`order_id`),
  KEY `fk_goods_order_cart_goods_shop_info_1` (`shop_id`),
  KEY `fk_goods_order_cart_goods_sku_1` (`sku_Id`),
  CONSTRAINT `fk_goods_order_cart_goods_order_info_1` FOREIGN KEY (`order_id`) REFERENCES `goods_order_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_order_cart_goods_shop_info_1` FOREIGN KEY (`shop_id`) REFERENCES `goods_shop_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_order_cart_goods_sku_1` FOREIGN KEY (`sku_Id`) REFERENCES `goods_sku` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_order_cart_user_member_1` FOREIGN KEY (`member_id`) REFERENCES `user_member` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车';

-- ----------------------------
-- Records of goods_order_cart
-- ----------------------------

-- ----------------------------
-- Table structure for goods_order_info
-- ----------------------------
DROP TABLE IF EXISTS `goods_order_info`;
CREATE TABLE `goods_order_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `order_no` varchar(64) DEFAULT NULL COMMENT '订单号码(只有一个订单的时候与trade_no一样)',
  `trade_no` varchar(64) DEFAULT NULL COMMENT '交易编号',
  `shop_id` bigint(11) DEFAULT NULL COMMENT '商家ID',
  `total_amount` decimal(10,2) DEFAULT NULL COMMENT '订单总额',
  `total_point` int(11) DEFAULT NULL COMMENT '订单消耗总积分',
  `pre_state` tinyint(1) DEFAULT NULL COMMENT '上一个状态(0：待接单；1：待发货；2：待收货；3：交易完成；4：退款完成；5：退款中；6：退款退货中；7：退款退货完成)',
  `current_state` tinyint(1) DEFAULT NULL COMMENT '当前状态(0：待接单；1：待发货；2：待收货；3：交易完成；4：退款完成；5：退款中；6：退款退货中；7：退款退货完成)',
  PRIMARY KEY (`id`),
  KEY `fk_goods_order_info_goods_shop_info_1` (`shop_id`),
  KEY `fk_goods_order_info_goods_trade_info_1` (`trade_no`),
  CONSTRAINT `fk_goods_order_info_goods_shop_info_1` FOREIGN KEY (`shop_id`) REFERENCES `goods_shop_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_order_info_goods_trade_info_1` FOREIGN KEY (`trade_no`) REFERENCES `goods_trade_info` (`trade_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of goods_order_info
-- ----------------------------

-- ----------------------------
-- Table structure for goods_shop_info
-- ----------------------------
DROP TABLE IF EXISTS `goods_shop_info`;
CREATE TABLE `goods_shop_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(50) NOT NULL COMMENT '店铺名称',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='店铺表';

-- ----------------------------
-- Records of goods_shop_info
-- ----------------------------

-- ----------------------------
-- Table structure for goods_sku
-- ----------------------------
DROP TABLE IF EXISTS `goods_sku`;
CREATE TABLE `goods_sku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `sku_no` varchar(50) NOT NULL COMMENT 'sku编号,唯一',
  `sku_name` varchar(50) NOT NULL COMMENT 'sku名称(冗余spu_name)',
  `cost` decimal(10,2) unsigned DEFAULT NULL COMMENT '成本价',
  `price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '售价(价格为0时表示该商品仅支持使用积分兑换)',
  `point` int(11) DEFAULT '0' COMMENT '积分(积分为0时表示该商品仅支持用现金支付)',
  `sales_volume` int(11) unsigned DEFAULT '0' COMMENT '销量',
  `stock` int(11) NOT NULL COMMENT '库存',
  `warn_stock` int(11) DEFAULT NULL COMMENT '库存预警',
  `shop_id` bigint(20) NOT NULL COMMENT '商铺id,为0表示自营',
  `spu_id` bigint(20) NOT NULL COMMENT 'spu_id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` tinyint(1) DEFAULT NULL COMMENT '状态(0：已下架；1：已上架)',
  `gift_point` int(10) unsigned DEFAULT '0' COMMENT '赠送积分',
  PRIMARY KEY (`id`),
  KEY `fk_goods_sku_goods_spu_1` (`spu_id`),
  KEY `fk_goods_sku_shop_info_1` (`shop_id`),
  CONSTRAINT `fk_goods_sku_goods_spu_1` FOREIGN KEY (`spu_id`) REFERENCES `goods_spu` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_sku_shop_info_1` FOREIGN KEY (`shop_id`) REFERENCES `goods_shop_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='sku表';

-- ----------------------------
-- Records of goods_sku
-- ----------------------------

-- ----------------------------
-- Table structure for goods_sku_spec_value
-- ----------------------------
DROP TABLE IF EXISTS `goods_sku_spec_value`;
CREATE TABLE `goods_sku_spec_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sku_id` bigint(20) NOT NULL COMMENT 'sku_id',
  `spec_value_id` bigint(20) NOT NULL COMMENT '规格值id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_goods_sku_spec_value_goods_sku_1` (`sku_id`),
  KEY `fk_goods_sku_spec_value_goods_spec_value_1` (`spec_value_id`),
  CONSTRAINT `fk_goods_sku_spec_value_goods_sku_1` FOREIGN KEY (`sku_id`) REFERENCES `goods_sku` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_sku_spec_value_goods_spec_value_1` FOREIGN KEY (`spec_value_id`) REFERENCES `goods_spec_value` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='sku规格值';

-- ----------------------------
-- Records of goods_sku_spec_value
-- ----------------------------

-- ----------------------------
-- Table structure for goods_sku_tag
-- ----------------------------
DROP TABLE IF EXISTS `goods_sku_tag`;
CREATE TABLE `goods_sku_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `tag_id` int(11) DEFAULT NULL COMMENT '标签ID',
  `sku_id` bigint(11) DEFAULT NULL COMMENT 'sku_id',
  PRIMARY KEY (`id`),
  KEY `fk_goods_sku_tag_goods_tag_1` (`tag_id`),
  KEY `fk_goods_sku_tag_goods_sku_1` (`sku_id`),
  CONSTRAINT `fk_goods_sku_tag_goods_sku_1` FOREIGN KEY (`sku_id`) REFERENCES `goods_sku` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_sku_tag_goods_tag_1` FOREIGN KEY (`tag_id`) REFERENCES `goods_tag` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品标签中间表';

-- ----------------------------
-- Records of goods_sku_tag
-- ----------------------------

-- ----------------------------
-- Table structure for goods_spec
-- ----------------------------
DROP TABLE IF EXISTS `goods_spec`;
CREATE TABLE `goods_spec` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `spec_no` varchar(50) NOT NULL COMMENT '规格编号',
  `spec_name` varchar(50) NOT NULL COMMENT '规格名称',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='规格表';

-- ----------------------------
-- Records of goods_spec
-- ----------------------------

-- ----------------------------
-- Table structure for goods_spec_value
-- ----------------------------
DROP TABLE IF EXISTS `goods_spec_value`;
CREATE TABLE `goods_spec_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `spec_id` bigint(20) NOT NULL COMMENT '规格id',
  `spec_value` varchar(50) NOT NULL COMMENT '规格值',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_goods_spec_value_goods_spec_1` (`spec_id`),
  CONSTRAINT `fk_goods_spec_value_goods_spec_1` FOREIGN KEY (`spec_id`) REFERENCES `goods_spec` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='规格值表';

-- ----------------------------
-- Records of goods_spec_value
-- ----------------------------

-- ----------------------------
-- Table structure for goods_spu
-- ----------------------------
DROP TABLE IF EXISTS `goods_spu`;
CREATE TABLE `goods_spu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `spu_no` varchar(50) NOT NULL COMMENT '商品编号，唯一',
  `goods_name` varchar(50) NOT NULL COMMENT '商品名称',
  `low_price` decimal(9,2) NOT NULL COMMENT '最低售价',
  `category_id` bigint(20) NOT NULL COMMENT '分类id',
  `brand_id` bigint(20) NOT NULL COMMENT '品牌id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_spu_no` (`spu_no`) USING BTREE,
  KEY `fk_goods_spu_goods_category_1` (`category_id`),
  KEY `fk_goods_spu_goods_brand_1` (`brand_id`),
  CONSTRAINT `fk_goods_spu_goods_brand_1` FOREIGN KEY (`brand_id`) REFERENCES `goods_brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_spu_goods_category_1` FOREIGN KEY (`category_id`) REFERENCES `goods_category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='spu表';

-- ----------------------------
-- Records of goods_spu
-- ----------------------------

-- ----------------------------
-- Table structure for goods_spu_spec
-- ----------------------------
DROP TABLE IF EXISTS `goods_spu_spec`;
CREATE TABLE `goods_spu_spec` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `spu_id` bigint(20) NOT NULL COMMENT 'spu_id',
  `spec_id` bigint(20) NOT NULL COMMENT 'spec_id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_goods_spu_spec_goods_spec_1` (`spec_id`),
  KEY `fk_goods_spu_spec_goods_spu_1` (`spu_id`),
  CONSTRAINT `fk_goods_spu_spec_goods_spec_1` FOREIGN KEY (`spec_id`) REFERENCES `goods_spec` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_goods_spu_spec_goods_spu_1` FOREIGN KEY (`spu_id`) REFERENCES `goods_spu` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='spu规格表';

-- ----------------------------
-- Records of goods_spu_spec
-- ----------------------------

-- ----------------------------
-- Table structure for goods_tag
-- ----------------------------
DROP TABLE IF EXISTS `goods_tag`;
CREATE TABLE `goods_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `tag` varchar(50) DEFAULT NULL COMMENT '标签',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品标签';

-- ----------------------------
-- Records of goods_tag
-- ----------------------------

-- ----------------------------
-- Table structure for goods_trade_info
-- ----------------------------
DROP TABLE IF EXISTS `goods_trade_info`;
CREATE TABLE `goods_trade_info` (
  `id` int(11) NOT NULL COMMENT '自增ID',
  `trade_no` varchar(64) DEFAULT NULL COMMENT '交易编号',
  `member_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `address_id` int(11) DEFAULT NULL COMMENT '物流地址ID',
  `pay_way` tinyint(2) DEFAULT NULL COMMENT '支付方式(1：微信支付；2：支付宝支付)',
  `trade_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '交易时间',
  `out_trade_no` varchar(64) DEFAULT NULL COMMENT '调用支付接口返回的订单编号',
  `payment_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '支付时间',
  `finish_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '交易完成时间',
  `end_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '交易终止时间',
  `current_status` tinyint(2) DEFAULT NULL COMMENT '当前状态(-1：交易取消；0：待支付；1：代发货；2：待收货；3：交易完成；4：已关闭)',
  `pre_status` tinyint(2) DEFAULT NULL COMMENT '上一个状态(-1：交易取消；0：待支付；1：代发货；2：待收货；3：交易完成)',
  `total_amount` decimal(10,2) unsigned DEFAULT NULL COMMENT '交易总额',
  `total_point` int(11) unsigned DEFAULT '0' COMMENT '参与交易的积分数',
  PRIMARY KEY (`id`),
  KEY `trade_no` (`trade_no`),
  KEY `fk_goods_trade_info_user_member_1` (`member_id`),
  CONSTRAINT `fk_goods_trade_info_user_member_1` FOREIGN KEY (`member_id`) REFERENCES `user_member` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易信息表';

-- ----------------------------
-- Records of goods_trade_info
-- ----------------------------

-- ----------------------------
-- Table structure for user_address
-- ----------------------------
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `member_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `country_id` char(6) DEFAULT NULL COMMENT '国家代码',
  `province_id` char(6) DEFAULT NULL COMMENT '省份代码',
  `city_id` char(6) DEFAULT NULL COMMENT '城市代码',
  `district_id` char(6) DEFAULT NULL COMMENT '区县代码',
  `address` varchar(100) DEFAULT NULL COMMENT '详细地址',
  `consignee` varchar(20) DEFAULT NULL COMMENT '签收人',
  `mobile` char(20) DEFAULT NULL COMMENT '手机号码',
  `is_default` tinyint(1) DEFAULT NULL COMMENT '是否默认(0：否，1：是)',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态(0：禁用；1：启用)',
  PRIMARY KEY (`id`),
  KEY `fk_user_address_user_member_1` (`member_id`),
  CONSTRAINT `fk_user_address_user_member_1` FOREIGN KEY (`member_id`) REFERENCES `user_member` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_address
-- ----------------------------

-- ----------------------------
-- Table structure for user_member
-- ----------------------------
DROP TABLE IF EXISTS `user_member`;
CREATE TABLE `user_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `login_name` char(20) DEFAULT NULL COMMENT '用户名',
  `password` char(20) DEFAULT NULL COMMENT '密码',
  `realname` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `nickname` varchar(20) DEFAULT NULL COMMENT '昵称',
  `brithday` date DEFAULT NULL COMMENT '生日',
  `pic_url` char(200) DEFAULT NULL COMMENT '头像',
  `mobile` char(20) DEFAULT NULL COMMENT '手机号码',
  `cteate_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `last_login_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最近登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user_member
-- ----------------------------

-- ----------------------------
-- Table structure for user_point
-- ----------------------------
DROP TABLE IF EXISTS `user_point`;
CREATE TABLE `user_point` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `member_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `point_count` int(11) unsigned DEFAULT NULL COMMENT '积分',
  `type` tinyint(1) DEFAULT NULL COMMENT '类型(-1：积分消耗；1：积分收入)',
  `point_source` int(11) unsigned DEFAULT NULL COMMENT '订单号(收入关联订单号或消耗关联订单号)',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态(0：无效；1：有效)',
  PRIMARY KEY (`id`),
  KEY `fk_user_point_user_member_1` (`member_id`),
  CONSTRAINT `fk_user_point_user_member_1` FOREIGN KEY (`member_id`) REFERENCES `user_member` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户积分记录表';

-- ----------------------------
-- Records of user_point
-- ----------------------------
