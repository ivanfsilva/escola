package br.com.ivanfsilva.escola.aluno;

import br.com.ivanfsilva.escola.aluno.Cpf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CpfTest {

    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {
        assertThrows( IllegalArgumentException.class, () -> new Cpf( null ) );
        assertThrows( IllegalArgumentException.class, () -> new Cpf( "" ) );
        assertThrows( IllegalArgumentException.class, () -> new Cpf( "1234567890" ) );
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido() {
        String numero = "123.456.789-00";
        Cpf cpf = new Cpf( numero );

        assertEquals( numero, cpf.getNumero() );
    }
}
