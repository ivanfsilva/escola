package br.com.ivanfsilva.escola;

import br.com.ivanfsilva.escola.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.dominio.aluno.Cpf;
import br.com.ivanfsilva.escola.dominio.aluno.Email;

public class MatricularAluno {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        Cpf cpf = new Cpf("123.456.789-00");
        Email email = new Email("fulano@email.com");

        Aluno aluno = new Aluno(cpf, nome, email);
    }
}
