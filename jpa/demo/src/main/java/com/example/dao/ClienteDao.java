package com.example.dao;

import javax.persistence.EntityManager;

import com.example.model.Cliente;

public class ClienteDao {

    private EntityManager em;

    public ClienteDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Cliente cliente){
        this.em.persist(cliente);
    } 
}
