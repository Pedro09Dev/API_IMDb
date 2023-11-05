package com.pedroigor.Api.Imdb.converter;

import com.pedroigor.Api.Imdb.dto.FilmeDTO;
import com.pedroigor.Api.Imdb.model.Filme;
import com.pedroigor.Api.Imdb.vo.FilmeOMDB;
import com.pedroigor.Api.Imdb.vo.FilmeVO;
import org.springframework.stereotype.Component;

@Component
public class FilmeConverter {

    public Filme converteParaFilme(FilmeDTO filmeDTO){
        Filme filme = new Filme();
        filme.setTitle(filmeDTO.getTitle());
        filme.setYear(filmeDTO.getYear());
        return filme;
    }

    public FilmeVO converteParaFilmeVO(Filme filme){
        FilmeVO filmeVO = new FilmeVO();
        filmeVO.setId(filme.getId());
        filmeVO.setTitle(filme.getTitle());
        filmeVO.setYear(filme.getYear());
        return filmeVO;
    }
}
