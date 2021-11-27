package br.com.ivanfsilva.escola.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        this.aluno = new Aluno(
                new Cpf( "123.456.789-00" ),
                "Fulano da Silva",
                new Email( "fulano@email.com" ) );
    }

    @Test
    void deveriaPermitirAdicionarUmTelefone() {
        this.aluno.adicionarTelefone( "21", "999999999" );

        assertEquals( 1, this.aluno.getTelefones().size() );
    }

    @Test
    void deveriaPermitirAdicionarDoisTelefones() {
        this.aluno.adicionarTelefone( "21", "999999999" );
        this.aluno.adicionarTelefone( "21", "888888888" );

        assertEquals( 2, this.aluno.getTelefones().size() );
    }

    @Test
    void naoDeveriaPermitirAdicionarTresTelefones() {
        assertThrows( IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone( "21", "999999999" );
            this.aluno.adicionarTelefone( "21", "888888888" );
            this.aluno.adicionarTelefone( "21", "777777777" );
        });

        assertEquals( 2, this.aluno.getTelefones().size() );
    }
}