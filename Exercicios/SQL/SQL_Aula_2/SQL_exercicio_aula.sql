create database generation;

/* indicando qual dos bancos de dados iremos trabalhar */
use generation;

/* criando uma tabela */
create table alunos (
	id int(11) primary key auto_increment not null,
    nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) unique
    );
    
    insert into alunos (
		nome, 
        sobrenome, 
        email, 
        data_nascimento,
        cpf
) values ("João", 
		"Camargo", 
        "joao@digitalhouse.com",
        "2001-05-22",
        "11111111111"
);

select id, 
		nome, 
        sobrenome, 
        email, 
        data_nascimento
        cpf
        
from alunos;

--  Exemplo para deletar

delete from alunos;

delete from alunos where id = 2;

--  Exemplo Filtrar por nome usando where e email usando and podendo usar or tambem

select * from alunos where nome = "João"
 and email = "joao@digitalhouse.com";
 
 --  Exemplo atualizar algum campo
 
 update alunos
 set sobrenome = "Luiza"
 where id = 2;
 
    create table professores(
		id int(11) primary key auto_increment not null,
        nome varchar(50),
        sobrenome varchar(50),
        email varchar(50),
        data_nascimento date,
        cpf varchar(11)
    );
    
    create table cursos (
		id int(11) primary key auto_increment not null,
        nome varchar(50)
    );
    create table turmas (
		id int(11) primary key auto_increment not null,
        descricao varchar(50),
        periodo varchar(20),
        id_alunos int(11),
        id_professores int(11),
        id_cursos int(11)
    );
    
    /* exibindo todas tabelas dentro do Banco de Dados */
    
    show tables;
    
    describe alunos;
    
    
    
    
    