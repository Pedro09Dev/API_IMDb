package com.pedroigor.Api.Imdb.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
public class FilmeOMDB {

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private String year;


}
