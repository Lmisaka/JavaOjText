CREATE TABLE admin_user
(
    ad_username VARCHAR(25) PRIMARY KEY NOT NULL,
    ad_password VARCHAR(25) NOT NULL,
    tel VARCHAR(11) NOT NULL,
    email VARCHAR(25) NOT NULL
);
CREATE UNIQUE INDEX `·admin_user``_``ad_username``_uindex` ON admin_user (ad_username);
CREATE UNIQUE INDEX `·admin_user``_``email``_uindex` ON admin_user (email);
CREATE UNIQUE INDEX `·admin_user``_``tel``_uindex` ON admin_user (tel);
CREATE TABLE blank_problem
(
    blank_detail TEXT NOT NULL,
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    key_word TEXT NOT NULL
);
CREATE TABLE login_user
(
    username VARCHAR(25) PRIMARY KEY NOT NULL,
    password VARCHAR(25) NOT NULL,
    statis INT(1) DEFAULT '1' NOT NULL
);
CREATE INDEX ```login_user``_user_info_password_fk` ON login_user (password);
CREATE UNIQUE INDEX ```login_user``_``username``_uindex` ON login_user (username);
CREATE TABLE programme_problem
(
    detail TEXT NOT NULL,
    time_limit INT(5) DEFAULT '2000',
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    out_put TEXT NOT NULL
);
CREATE TABLE select_problem
(
    detail TEXT NOT NULL,
    select_a TEXT NOT NULL,
    select_b TEXT NOT NULL,
    select_c TEXT NOT NULL,
    select_d TEXT NOT NULL,
    correct INT(2) NOT NULL,
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT
);
CREATE TABLE un_programme_detail
(
    detail TEXT NOT NULL,
    answer TEXT NOT NULL,
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT
);
CREATE TABLE user_info
(
    username VARCHAR(25) PRIMARY KEY NOT NULL,
    password VARCHAR(25) NOT NULL,
    qq_number VARCHAR(15) NOT NULL,
    tel_number VARCHAR(11) NOT NULL
);
CREATE UNIQUE INDEX ```user_info``_``qq_number``_uindex` ON user_info (qq_number);
CREATE UNIQUE INDEX ```user_info``_``tel_number``_uindex` ON user_info (tel_number);
CREATE UNIQUE INDEX ```user_info``_``username``_uindex` ON user_info (username);