package br.com.ivanfsilva.escola;

import br.com.ivanfsilva.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.ivanfsilva.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        MatricularAluno matricular = new MatricularAlunoDTO();
        matricular.executa( new MatricularAlunoDTO( nome, cpf, email ) );
    }
}
