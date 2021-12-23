package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categoria")
public class Categoria {

    @Id
    @GeneratedValue
    private int id;
    private String ENUM;

    public Categoria(String ENUM) {
        this.ENUM = ENUM;
    }

    public int getId() {
        return this.id;
    }

    public String getEnum() {
        return this.ENUM;
    }

    public void setEnum(String ENUM) {
        this.ENUM = ENUM;
    }
    
}
