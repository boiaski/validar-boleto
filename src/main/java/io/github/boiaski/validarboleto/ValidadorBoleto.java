package io.github.boiaski.validarboleto;

public class ValidadorBoleto {

    public static boolean validar(String linhaDigitavel) {

        if (linhaDigitavel == null) {
            return false;
        }

        linhaDigitavel = linhaDigitavel.replaceAll("[. ]", "");

        if (!linhaDigitavel.matches("\\d+")) {
            return false;
        }

        return linhaDigitavel.length() == 47;
    }
}