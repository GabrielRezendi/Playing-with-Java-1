package com.example.dao;

import javax.persistence.EntityManager;

import com.example.model.Categoria;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Categoria categoria){
        this.em.persist(categoria);
    } 
}
