package io.github.boiaski.validarboleto;

public class ValidadorBoleto {

    public static boolean validar(String linhaDigitavel) {
        
        if (linhaDigitavel == null) {
            return false;
        }

        linhaDigitavel = linhaDigitavel.replaceAll("[^0-9]", "");

        if (linhaDigitavel.length() != 47) {
            return false;
        }
        
        return true;
    }
}