package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    public String obterDados(String endereco) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }

// O código basicamente tem: instancia de HttpClient com nome client (Como se fosse o cliente);
// Temos o HttpRequest onde crio uma URI para dizer para qual endereço fazer aquela requisição e
// depois disso, TENTAR receber essa resposta (meu client vai mandar essa requisição e eu vou receber
// essa Resposta) e o que interessa é o retorno, devolver a string JSON que é o corpo da Resposta.
// E também tem os Try Catches pois pode acontecer erros no meio, então lanço a excessão para dar seguimento

}
