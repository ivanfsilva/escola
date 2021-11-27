package br.com.ivanfsilva.escola.academico.aplicacao.aluno.matricular;

import br.com.ivanfsilva.escola.academico.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.shared.dominio.Cpf;
import br.com.ivanfsilva.escola.academico.dominio.aluno.Email;

public class MatricularAlunoDTO {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDTO( String nomeAluno, String cpfAluno, String emailAluno ) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno( new Cpf( cpfAluno ), nomeAluno, new Email( emailAluno ) );
    }
}
