create database db_user_login;
use db_user_login;
create table login(
id_usuario int auto_increment primary key,
usuario varchar(100)not null,
senha varchar(21)not null
);
create table turma(
id_turma int auto_increment primary key,
nome varchar(100)not null
);
create table aluno(
id_aluno int auto_increment primary key,
nome varchar(100)not null,
idade int not null,
telefone varchar(100)not null,
endereco varchar(100)not null,
id_turma int not null,
foreign key(id_turma)references turma(id_turma),
nota decimal(8,2)
);
insert into login(usuario,senha)values("Jeanine","jeanine@gmail.com");
select*from login;