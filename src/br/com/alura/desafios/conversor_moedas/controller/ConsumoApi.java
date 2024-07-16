package br.com.alura.desafios.conversor_moedas.controller;

import br.com.alura.desafios.conversor_moedas.model.ConversaoMoedas;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    private final String API_URL_BASE = "https://v6.exchangerate-api.com/v6/5a59cb9a9250415660e3b08f/pair/";

    public ConversaoMoedas conversaoDeMoedas(String moedaBase, String moedaAlvo, Double valor) throws IOException, InterruptedException {
        String endereco = API_URL_BASE + moedaBase + "/" + moedaAlvo + "/" + valor;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), ConversaoMoedas.class);
    }

}
