package models;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(force = true)
@Entity
public class Table implements Element{

    private String name;

    public Table(String name){
        this.name=name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print(){
        System.out.println("main.java.models.Table with name: "+this.name);
    }

}
