package br.com.ivanfsilva.escola.academico.aplicacao.aluno.matricular;

import br.com.ivanfsilva.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.ivanfsilva.escola.academico.dominio.PublicadorDeEventos;
import br.com.ivanfsilva.escola.academico.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.academico.dominio.aluno.AlunoMatriculado;

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
