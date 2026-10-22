package io.github.boiaski.validarboleto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidadorBoletoTest {

    private final ValidadorBoleto validador = new ValidadorBoleto();

    @Test
    void deveRejeitarEntradaNula() {
        assertFalse(validador.validar(null));
    }

    @Test
    void deveValidarEntradaValida() {
        assertTrue(validador.validar("00190.00009 01234.567890 12345.678909 1 00000000010000"));
    }

    @Test
    void deveRejeitarEntradaMenorQue47Caracteres() {
        assertFalse(validador.validar("00190.00009 01234.567890 12345.678909 1 0000000001000"));
    }
}