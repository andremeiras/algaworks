package com.algaworks.algamoneyapi.repository;

import com.algaworks.algamoneyapi.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository - traz varios métodos CRUD prontos (findAll(), findById(), getOne(), delete(), etc )
// É necessário passar o Objeto que irá ser executados esses métodos e também o tipo do Id dele, que neste caso é um Long
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
