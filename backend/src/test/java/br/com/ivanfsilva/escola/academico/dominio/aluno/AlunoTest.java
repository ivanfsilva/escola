package br.com.ivanfsilva.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import br.com.ivanfsilva.escola.shared.dominio.Cpf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertThrows( QuantidadeMaximaDeTelefonesException.class, () -> {
            this.aluno.adicionarTelefone( "21", "999999999" );
            this.aluno.adicionarTelefone( "21", "888888888" );
            this.aluno.adicionarTelefone( "21", "777777777" );
        });

        assertEquals( 2, this.aluno.getTelefones().size() );
    }
}
