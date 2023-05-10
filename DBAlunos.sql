CREATE TABLE alunos (
    RGM INT NOT NULL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    celular VARCHAR(15) NOT NULL,
    data_nascimento DATE NOT NULL,
    curso VARCHAR(50) NOT NULL
);
