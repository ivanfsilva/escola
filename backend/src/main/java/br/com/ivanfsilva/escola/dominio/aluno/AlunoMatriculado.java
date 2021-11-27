package br.com.ivanfsilva.escola.dominio.aluno;

import br.com.ivanfsilva.escola.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final Cpf cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado( Cpf cpfDoAluno ) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public Cpf getCpfDoAluno() {
        return cpfDoAluno;
    }
}
