use sistema;


create table departamento (
	id_departamento Integer(11) primary key auto_increment not null,
    nome varchar(100),
    telefone char(15)
    );
    
    create table funcionario (
	id_departamento Int,
    id_funcionario integer primary key auto_increment not null, 
    foreign key (id_departamento) references (id_departamento),
    nome varchar(100),
    data_cadastro DATE
    );
    
    