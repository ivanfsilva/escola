package br.com.ivanfsilva.escola.academico.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular( Aluno aluno );

    Aluno buscarPorCPF( Cpf cpf );

    List< Aluno > listarTodosAlunosMatriculados();

}
