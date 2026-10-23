package io.github.boiaski.validarboleto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidadorBoletoTest {

    @Test
    void deveRejeitarEntradaNula() {
        assertFalse(ValidadorBoleto.validar(null));
    }

    @Test
    void deveAceitarLinhaFormatadaComPontosEEspacos() {
        assertTrue(ValidadorBoleto.validar("00190.00009 01234.567890 12345.678909 1 00000000010000"));
    }

    @Test
    void deveRejeitarLinhaCom46Digitos() {
        assertFalse(ValidadorBoleto.validar("00190.00009 01234.567890 12345.678909 1 0000000001000"));
    }

    @Test
    void deveRejeitarEntradaVazia() {
        assertFalse(ValidadorBoleto.validar(""));
    }

    @Test
    void deveRejeitarEntradaSomenteComEspacos() {
        assertFalse(ValidadorBoleto.validar("     "));
    }

    @Test
    void deveRejeitarEntradaCom48Digitos() {
        assertFalse(ValidadorBoleto.validar("001900000900123456782901234567831100000000100000"));
    }

    @Test
    void deveRejeitarLinhaComLetra() {
        assertFalse(ValidadorBoleto.validar("00190.00009 01234.567890 12345.678909 1 00000000010000a"));
    }
}