package escola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows( IllegalArgumentException.class, () -> new Email(null));
        assertThrows( IllegalArgumentException.class, () -> new Email(""));
        assertThrows( IllegalArgumentException.class, () -> new Email("email.br"));
    }
}
