package br.com.ivanfsilva.escola.aplicacao.aluno.matricular;

import br.com.ivanfsilva.escola.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno( RepositorioDeAlunos repositorio ) {
        this.repositorio = repositorio;
    }

    public void executa( MatricularAlunoDTO dados ) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular( novo );
    }
}
