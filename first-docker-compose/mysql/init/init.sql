-- 添加新用户
-- CREATE USER 'traveler'@'%' IDENTIFIED BY 'ALKdks348,.';
-- create database blog;
use mysql;
grant all privileges on travel.* to traveler@'%';
-- alter user 'traveler'@'%' identified with mysql_native_password by 'ALKdks348,.';
flush privileges;

use travel;
CREATE TABLE logs (
	id varchar(40) primary key,			            -- 主键
	name VARCHAR(20) NOT NULL DEFAULT '',			-- 名称
	location varchar(100) NOT NULL DEFAULT ''	    -- 描述
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
