package br.nom.wbarbosa.wbviagens.util;

public class DiasUtil {

    private static final String PLURAL = " dias";
    private static final String SINGULAR = " dia";

    public static String getDiasString(int dias) {
        if (dias > 1) {
            return dias + PLURAL;
        }
        return dias + SINGULAR;
    }
}
