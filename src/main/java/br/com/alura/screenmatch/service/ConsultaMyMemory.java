package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.DadosTraducao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URLEncoder;

public class ConsultaMyMemory {
    public static String obterTraducao(String text) {
        ConverteDados converteDados = new ConverteDados();

        ConsumoAPI consumo = new ConsumoAPI();

        String texto = URLEncoder.encode(text);
        String langpair = URLEncoder.encode("en|pt-br");

        String url = "https://api.mymemory.translated.net/get?q=" + texto + "&langpair=" + langpair;

        String json = consumo.obterDados(url);

        DadosTraducao traducao = converteDados.obterDados(json, DadosTraducao.class);


        return traducao.responseData().translatedText;
    }
}
