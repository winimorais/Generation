-- Exercício 1
CREATE DATABASE biblioteca;

-- Exercício 2
SHOW DATABASES;
USE biblioteca;

-- Exercício 3
CREATE TABLE categoria (
	id_categoria INTEGER NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_categoria)
);

SELECT * FROM categoria;

-- Exercício 4
DESCRIBE categoria;

-- Exercício 5
CREATE TABLE livro (
	id_livro INTEGER NOT NULL,
    titulo VARCHAR(200) NOT NULL,
    id_categoria INTEGER NOT NULL,
    PRIMARY KEY (id_livro),
    CONSTRAINT fk_categoria_livro
    FOREIGN KEY (id_categoria)
    REFERENCES categoria (id_categoria)
);

-- Exercício 6
DESCRIBE livro;

-- Exercício 7
CREATE TABLE aluno (
	id_aluno INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_aluno)
);

-- Exercício 8
DESCRIBE livro;

-- Exercício 9
CREATE TABLE emprestimo (
	id_emprestimo INTEGER NOT NULL,
    id_aluno INTEGER NOT NULL,
    id_livro INTEGER NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE,
    PRIMARY KEY (id_emprestimo),
    CONSTRAINT uk_emprestimo
    UNIQUE KEY (id_aluno, id_livro, data_emprestimo),
    CONSTRAINT fk_livro_emprestimo
    FOREIGN KEY (id_livro)
    REFERENCES livro (id_livro),
    CONSTRAINT fk_aluno_emprestimo
    FOREIGN KEY (id_aluno)
    REFERENCES aluno (id_aluno)
);

INSERT INTO aluno VALUES (100, 'Zacarias da Mata');
INSERT INTO aluno VALUES (200, 'Yolanda Costa Matheus');
INSERT INTO aluno VALUES (300, 'Xisto Gonçalves');
INSERT INTO aluno VALUES (400, 'William Henry Gates');
INSERT INTO aluno VALUES (500, 'Vilma Oliveira Dias');
INSERT INTO aluno VALUES (600, 'Úrsula Pereira');
INSERT INTO aluno VALUES (700, 'Teodoro Silva dos Santos');
INSERT INTO aluno VALUES (800, 'Salomé Souza Lima');
INSERT INTO aluno VALUES (900, 'Ranulfo Jorge da Silva');

SELECT * FROM aluno;

INSERT INTO categoria VALUES (10, 'Romance');
INSERT INTO categoria VALUES (20, 'Ficção');
INSERT INTO categoria VALUES (30, 'Comédia');
INSERT INTO categoria VALUES (40, 'Infanto Juvenil');
INSERT INTO categoria VALUES (50, 'Drama');
INSERT INTO categoria VALUES (60, 'Policial');

SELECT * FROM categoria;

INSERT INTO livro VALUES (1000, 'Um romance qualquer', 10);
INSERT INTO livro VALUES (1010, 'Um outro romance qualquer', 10);
INSERT INTO livro VALUES (1020, 'Uma ficção baseada em fatos reais', 20);
INSERT INTO livro VALUES (1030, 'Eram os deuses astronautas?', 20);
INSERT INTO livro VALUES (1040, 'Cachinhos Dourados', 40); 
INSERT INTO livro VALUES (1050, 'Chapeuzinho Vermelho', 40); 
INSERT INTO livro VALUES (1060, 'Os três porquinhos', 40); 
INSERT INTO livro VALUES (1070, 'Se eu chorasse uma vez', 50); 
INSERT INTO livro VALUES (1080, 'Um novo amor', 10); 
INSERT INTO livro VALUES (1090, 'A dúvida', 50); 
INSERT INTO livro VALUES (1100, 'A morte do senhor vereador', 60); 
INSERT INTO livro VALUES (1110, 'O mistério dos 5 mentirosos', 60); 
INSERT INTO livro VALUES (1120, 'O robô', 20); 
INSERT INTO livro VALUES (1130, 'Poeiras em alto mar', 50); 
INSERT INTO livro VALUES (1140, 'A volta dos que não foram', 50); 
INSERT INTO livro VALUES (1150, 'O príncipe e o mendigo', 40);

SELECT * FROM livro;

INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (10, 100, 1000, '2010-08-13'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (20, 100, 1080, '2010-08-14'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (30, 200, 1110, '2010-08-15'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (40, 300, 1150, '2010-08-16'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (50, 500, 1120, '2010-08-17'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (60, 500, 1130, '2010-08-18'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (70, 600, 1010, '2010-08-19'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (80, 700, 1020, '2010-08-20'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (90, 800, 1040, '2010-08-21');

SELECT * FROM emprestimo;

-- JOINs

-- Mostrando todos os livros que possuem categoria
SELECT * FROM livro l
INNER JOIN categoria c
ON l.id_categoria = c.id_categoria;

SELECT l.id_livro, 
		l.titulo, 
		c.id_categoria, 
		c.categoria 
FROM livro l
INNER JOIN categoria c
ON l.id_categoria = c.id_categoria;

SELECT livro.id_livro, 
		livro.titulo, 
		categoria.id_categoria, 
		categoria.categoria 
FROM livro
INNER JOIN categoria
ON livro.id_categoria = categoria.id_categoria;

SELECT livro.titulo, 
		categoria.categoria 
FROM livro
JOIN categoria
ON livro.id_categoria = categoria.id_categoria;

-- Mostrando todos os livros que os alunos pegaram emprestados
SELECT
	a.id_aluno,
    a.nome,
    l.id_livro,
    l.titulo,
    e.data_emprestimo,
    e.data_devolucao
FROM aluno a
INNER JOIN emprestimo e
ON a.id_aluno = e.id_aluno
INNER JOIN livro l
ON e.id_livro = l.id_livro;

-- Mostrando todos os livros que os alunos pegaram emprestados
-- Mostrar também as categorias de cada livro
SELECT a.id_aluno,
    a.nome,
    l.id_livro,
    l.titulo,
    c.id_categoria,
    c.categoria,
    e.data_emprestimo,
    e.data_devolucao
FROM aluno a
INNER JOIN emprestimo e
ON a.id_aluno = e.id_aluno
INNER JOIN livro l
ON e.id_livro = l.id_livro
INNER JOIN categoria c
ON l.id_categoria = c.id_categoria;













USE movies_db;
SELECT movies.title AS "Título", genres.name AS "Gênero" FROM movies
INNER JOIN genres ON movies.genre_id = genres.id;

