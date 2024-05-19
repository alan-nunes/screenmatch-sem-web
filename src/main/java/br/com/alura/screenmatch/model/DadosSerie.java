package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  //ignore o que não encontrar
public record DadosSerie(@JsonAlias("Title") String titulo, @JsonAlias("totalSeaons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
