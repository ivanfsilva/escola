package br.com.ivanfsilva.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.ivanfsilva.escola.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.dominio.aluno.Cpf;
import br.com.ivanfsilva.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        // MOCK -> Mockito
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO(
                "Fulano",
                "123.456.789-00",
                "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(
                new Cpf( "123.456.789-00" ) );

        assertEquals( "Fulano", encontrado.getNome() );
        assertEquals( "123.456.789-00", encontrado.getCpf() );
        assertEquals( "fulano@email.com", encontrado.getEmail() );
    }
}
