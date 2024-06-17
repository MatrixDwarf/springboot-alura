package br.com.alura.screenmatch.service;

// Como a gente não passou no início do cabeçalho o tipo que q gente quer,
//teremos que indicar o tipo que a gente espera

public interface IConverteDados {
    <T> T obterDados(String json, Class <T> classe);
}
