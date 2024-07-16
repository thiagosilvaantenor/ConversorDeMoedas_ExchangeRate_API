package br.com.alura.desafios.conversor_moedas.model;


import com.google.gson.annotations.SerializedName;

public record ConversaoMoedas(
        @SerializedName("base_code")
        String moedaBase,

        @SerializedName("target_code")
        String moedaAlvo,

        @SerializedName("conversion_rate")
        Double taxaConversao,

        @SerializedName("conversion_result")
        Double resultadoConversao
) {
}
