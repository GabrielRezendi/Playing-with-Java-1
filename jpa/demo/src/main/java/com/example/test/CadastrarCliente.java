package com.example.test;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.dao.CategoriaDao;
import com.example.dao.ClienteDao;
import com.example.model.Categoria;
import com.example.model.Cliente;
import com.example.util.JPAUtil;

public class CadastrarCliente{

    public static void main( String[] args )
    {

        Random cpf = new Random();
        Categoria categoria = new Categoria("Teste");
        Cliente cliente = new Cliente( Integer.toString(cpf.nextInt(111)), "JOAO", categoria);
    


        EntityManager em = JPAUtil.getEntityManager();
        CategoriaDao categoriaDao = new CategoriaDao(em);
        ClienteDao clienteDao = new ClienteDao(em);
        em.getTransaction().begin();
        categoriaDao.cadastrar(categoria);
        clienteDao.cadastrar(cliente); //instancia da classe equivalente ao Bd 
        em.getTransaction().commit();
        em.close();
        
    }
    
}
