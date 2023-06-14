package br.com.aluraAna.screenmatch.domain.filme;

public record DadosCadastroFilme(
        String nome,
        Integer duracao,
        Integer ano,
        String genero) {
}
