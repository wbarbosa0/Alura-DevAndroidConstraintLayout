package br.nom.wbarbosa.wbviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    private static final String MOEDA_BRASILEIRA = "R$";
    private static final String MOEDA_BRASILEIRA_FORMATADA = "R$ ";
    private static final String LINGUA_PORTUGUESA = "pt";
    private static final String PAIS_BRASIL = "br";

    public static String setPrecoEmMoedaBrasileira(BigDecimal preco) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(
                new Locale(LINGUA_PORTUGUESA, PAIS_BRASIL));
        return formatoBrasileiro.format(preco).replace(MOEDA_BRASILEIRA, MOEDA_BRASILEIRA_FORMATADA);


    }
}