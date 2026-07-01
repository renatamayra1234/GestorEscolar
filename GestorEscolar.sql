create database db_user_login;
use db_user_login;

create table login(
id_usuario int auto_increment primary key,
usuario varchar(100) not null,
senha varchar(21) not null
);

create table turma(
id_turma int auto_increment primary key,
nome varchar(100) not null
);
create table professor(
id_prof int auto_increment primary key,
usuario varchar(100) not null,
senha varchar (21) not null
);
create table aluno(
id_aluno int auto_increment primary key,
nome varchar(100) not null,
idade int not null,
telefone varchar(100) not null,
endereco varchar(100) not null,
id_turma int not null,
foreign key(id_turma) references turma(id_turma)
);

create table nota(
id_nota int auto_increment primary key,
id_aluno int not null,
nota decimal(8,2) not null,
foreign key(id_aluno) references aluno(id_aluno)
);

insert into login(usuario,senha)
values("Jeanine","bocasanta"),
("Bia","123"),("Carol","bonita");

insert into turma(nome)
values
("Jovem Programador"),
("Técnico em Administração");

insert into professor(usuario,senha)
values
("Clarise","220022"),
("Hobert","00000000"),
("Igor","1234"),
("Margaret","senha"),
("Antonio","nsei");

insert into aluno(nome,idade,telefone,endereco,id_turma)
values
("Thiago",20,"49999999999","Rua A",1),
("Maria",18,"48999999999","Rua B",1),
("João",22,"47999999999","Rua C",2);

insert into nota(id_aluno,nota)
values
(1,8.5),
(1,9.0),
(1,7.5),
(2,10),
(2,8),
(3,6.5),
(3,7.0);
select
a.id_aluno,
a.nome,
t.nome as turma,
avg(n.nota) as media
from aluno a
join turma t
on a.id_turma = t.id_turma
left join nota n
on a.id_aluno = n.id_aluno
group by a.id_aluno,a.nome,t.nome;
select*from login;
select*from aluno;
select*from turma;
select*from nota;

