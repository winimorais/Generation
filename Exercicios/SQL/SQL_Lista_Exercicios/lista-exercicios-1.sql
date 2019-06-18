-- Exerício 1
SHOW DATABASES;

-- Exercício 2
CREATE DATABASE sistema;

-- Exercício 3
SHOW DATABASES;
USE sistema;

-- Exercício 6
CREATE TABLE departamento (
	id_departamento INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    telefone CHAR(15),
    PRIMARY KEY (id_departamento)
);

-- Exercício 7
DESCRIBE departamento;

-- Exercício 8
CREATE TABLE funcionario (
	id_funcionario INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    id_departamento INTEGER NOT NULL,
    data_cadastro DATE,
    PRIMARY KEY (id_funcionario),
    FOREIGN KEY (id_departamento) 
    REFERENCES departamento (id_departamento)
);

-- Exercício 9
DROP TABLE funcionario;

-- Exercício 10
CREATE TABLE funcionario (
	id_funcionario INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    id_departamento INTEGER NOT NULL,
    data_cadastro DATE,
    PRIMARY KEY (id_funcionario)
);

DESCRIBE funcionario;

-- Exercício 11
ALTER TABLE funcionario
ADD CONSTRAINT fk_funcionario_departamento
FOREIGN KEY (id_departamento) 
REFERENCES departamento (id_departamento);

DESCRIBE funcionario;

-- Exercício 12
INSERT INTO departamento 
VALUES (100, "Departamento de Tecnologia", "(11) 98888-7777");

INSERT INTO departamento 
VALUES (200, "Departamento de Recursos Humanos", NULL);

SELECT * FROM departamento;

-- Exercício 13
INSERT INTO departamento (id_departamento, nome) 
VALUES (300, "Departamento de Vendas");

INSERT INTO departamento (id_departamento, nome, telefone) 
VALUES (400, "Departamento de Marketing", "(11) 93333-6666");

SELECT * FROM departamento;

-- Exercício 14
INSERT INTO departamento 
VALUES (500, "Departamento de Assistência Técnica", "(11) 94444-7777"),
	(600, "Departamento de Financeiro", "(11) 97777-3333"),
    (700, "Departamento de Garantia", NULL),
    (800, "Departamento de Peças", NULL),
    (900, "Departamento de Estoque", NULL);
    
SELECT * FROM departamento;

-- Exercício 15
SELECT * FROM departamento;

-- Exercício 16
SELECT * FROM departamento ORDER BY nome;

-- Exercício 17
SELECT * FROM departamento ORDER BY nome DESC;

-- Exercício 18
SELECT * FROM departamento WHERE telefone IS NULL;

-- Exercício 19
SELECT * FROM departamento WHERE telefone IS NOT NULL;

-- Exercício 20
SELECT * FROM departamento WHERE id_departamento = 300;

-- Exercício 21
SELECT * FROM departamento WHERE nome LIKE "D%";

-- Exercício 22
SELECT * FROM departamento WHERE nome LIKE "%Vendas";

-- Exercício 23
SELECT * FROM departamento WHERE nome LIKE "%de%";

-- Exercício 24
SELECT * FROM departamento WHERE nome NOT LIKE "%de%";

-- Exercício 25 (Atualizar)
UPDATE departamento
SET telefone = "(11) 97777-1111"
WHERE id_departamento = 300;

SELECT * FROM departamento WHERE id_departamento = 300;

-- Exercício 26
DELETE FROM departamento WHERE id_departamento = 400;

-- Exercício 27 (Terminal)
-- QUIT ou \q

-- Exercício 28
SELECT VERSION();
SELECT CURRENT_DATE();
SELECT SYSDATE();
SELECT NOW();

-- Exercício 29
SELECT USER();

-- Exercício 30
-- \c