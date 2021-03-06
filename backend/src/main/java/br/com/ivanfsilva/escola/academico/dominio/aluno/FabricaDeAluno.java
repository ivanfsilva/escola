package br.com.ivanfsilva.escola.academico.dominio.aluno;

import br.com.ivanfsilva.escola.shared.dominio.Cpf;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFemail( String nome, String cpf, String email ) {
        this.aluno = new Aluno( new Cpf( cpf ), nome, new Email( email ) );

        return this;
    }

    public FabricaDeAluno comTelefone( String ddd, String numero ) {
        this.aluno.adicionarTelefone( ddd, numero );

        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
