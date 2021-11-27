package br.com.ivanfsilva.escola.academico.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import br.com.ivanfsilva.escola.shared.dominio.Cpf;
import br.com.ivanfsilva.escola.academico.dominio.PublicadorDeEventos;
import org.junit.jupiter.api.Test;

import br.com.ivanfsilva.escola.academico.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        // MOCK -> Mockito
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();

        MatricularAluno useCase = new MatricularAluno( repositorio, new PublicadorDeEventos() );

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
