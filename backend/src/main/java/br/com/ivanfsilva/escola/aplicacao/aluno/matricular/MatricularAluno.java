package br.com.ivanfsilva.escola.aplicacao.aluno.matricular;

import br.com.ivanfsilva.escola.dominio.PublicadorDeEventos;
import br.com.ivanfsilva.escola.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.dominio.aluno.AlunoMatriculado;
import br.com.ivanfsilva.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void executa( MatricularAlunoDTO dados ) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular( novo );

        AlunoMatriculado evento = new AlunoMatriculado( novo.getCpf() );
        publicador.publicar( evento );
    }
}
