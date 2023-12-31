package com.pedroigor.Api.Imdb.client;

import com.pedroigor.Api.Imdb.vo.FilmeOMDB;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "omdbFilmes", url = "https://www.omdbapi.com/")
public interface FilmeClientOMDBFeign {

    @RequestMapping(method = RequestMethod.GET)
    FilmeOMDB getFilme(@RequestParam("t") String tema, @RequestParam("apiKey") String key);

}
