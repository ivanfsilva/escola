package br.com.ivanfsilva.escola.academico.dominio.aluno;

import br.com.ivanfsilva.escola.shared.dominio.evento.Evento;
import br.com.ivanfsilva.escola.shared.dominio.Cpf;
import br.com.ivanfsilva.escola.shared.dominio.evento.TipoDeEvento;

import java.time.LocalDateTime;
import java.util.Map;

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

    @Override
    public TipoDeEvento tipo() {
        return TipoDeEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of( "cpf", cpfDoAluno );
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public Cpf getCpfDoAluno() {
        return cpfDoAluno;
    }
}
