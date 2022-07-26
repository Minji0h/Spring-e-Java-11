package com.minji0h.springejava.entities;

import java.util.List;

public class Category {

    /*Atributos da classe*/

    private Long id;
    private String name;
    private List<Product> products;

    /*Getters e Setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
