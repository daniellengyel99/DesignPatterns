package models;

import javax.persistence.Entity;

@Entity
public class Author {

    private String name;

    public Author(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("models.Author: "+this.name);
    }

}
