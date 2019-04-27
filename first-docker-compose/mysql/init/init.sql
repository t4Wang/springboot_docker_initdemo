-- 添加新用户
-- CREATE USER 'bloger'@'%' IDENTIFIED BY 'ALKdks348,.';
-- create database blog;
use mysql;
grant all privileges on blog.* to bloger@'%';
-- alter user 'traveler'@'%' identified with mysql_native_password by 'ALKdks348,.';
flush privileges;

-- use blog;
-- CREATE TABLE logs (
-- 	id varchar(40) primary key,			            -- 主键
-- 	name VARCHAR(20) NOT NULL DEFAULT '',			-- 名称
-- 	location varchar(100) NOT NULL DEFAULT ''	    -- 描述
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
