package com.fabiomattosgodoy.biblioteca.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private Integer paginas;

    @Column(nullable = false)
    private Integer capitulos;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "nome_publicacao", nullable = false, unique = true)
    private String nomePublicacao;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "author_id")
    private Author author;



}
