CREATE TABLE alunos (
    RGM INT NOT NULL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    celular VARCHAR(15) NOT NULL,
    data_nascimento DATE NOT NULL,
    curso VARCHAR(50) NOT NULL
);

CREATE TABLE `notas` (
    id INT NOT NULL PRIMARY KEY,
    RGM INT NOT NULL,
    disciplina VARCHAR(50) NOT NULL,
    nota1 DECIMAL(4,2) NOT NULL,
    nota2 DECIMAL(4,2) NOT NULL,
    nota3 DECIMAL(4,2) NOT NULL,
    faltas INT NOT NULL,
    FOREIGN KEY (RGM) REFERENCES alunos(RGM) ON DELETE CASCADE
);
