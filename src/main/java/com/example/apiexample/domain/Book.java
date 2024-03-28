package com.example.apiexample.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String titulo;
    public String autor;
    public String area;
    @JsonProperty("numero_de_paginas")
    public String numeroDePaginas;
    public String imagem;
    public String editora;
    @JsonProperty("ano_de_publicacao")
    public String anoDePublicacao;
    @JsonProperty("ISBN")
    public String isbn;
}
