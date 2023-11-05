package com.pedroigor.Api.Imdb.service;

import com.pedroigor.Api.Imdb.client.FilmeClientOMDBFeign;
import com.pedroigor.Api.Imdb.converter.FilmeConverter;
import com.pedroigor.Api.Imdb.dto.FilmeDTO;
import com.pedroigor.Api.Imdb.model.Filme;
import com.pedroigor.Api.Imdb.repository.FilmeRepository;
import com.pedroigor.Api.Imdb.vo.FilmeOMDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Value("${imdb.apikey}")
    private String apiKey;

    @Autowired
    private FilmeClientOMDBFeign filmeClientOMDBFeign;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private FilmeConverter filmeConverter;

    public FilmeOMDB getFilme(String tema){
        return filmeClientOMDBFeign.getFilme(tema, apiKey);
    }

    public Filme save(FilmeDTO filmeDTO){
        Filme filme = filmeConverter.converteParaFilme(filmeDTO);
        return filmeRepository.save(filme);
    }

    public Filme getById(Long id){
        return filmeRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Filme Escolhido"));
    }

}
