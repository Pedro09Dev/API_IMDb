package com.pedroigor.Api.Imdb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String title;

    @Column(name = "ano")
    private String year;
}
