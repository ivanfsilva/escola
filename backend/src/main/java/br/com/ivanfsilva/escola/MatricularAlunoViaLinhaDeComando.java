package br.com.ivanfsilva.escola;

import br.com.ivanfsilva.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.ivanfsilva.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.ivanfsilva.escola.academico.dominio.PublicadorDeEventos;
import br.com.ivanfsilva.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.ivanfsilva.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar( new LogDeAlunoMatriculado() );

        MatricularAluno matricular = new MatricularAluno( new RepositorioDeAlunosEmMemoria(), publicador);
        matricular.executa( new MatricularAlunoDTO( nome, cpf, email ) );
    }
}
