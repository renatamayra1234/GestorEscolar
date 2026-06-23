create database db_user_login;
use db_user_login;
create table usuario(
id_usuario int auto_increment primary key,
login varchar(100)not null,
senha varchar(21)not null
);
