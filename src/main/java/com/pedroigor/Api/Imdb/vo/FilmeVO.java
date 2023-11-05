package com.pedroigor.Api.Imdb.vo;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class FilmeVO extends RepresentationModel<FilmeVO> {

    private Long id;

    private String title;

    private String year;
}
