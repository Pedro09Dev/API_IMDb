package com.pedroigor.Api.Imdb.repository;

import com.pedroigor.Api.Imdb.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{

}

