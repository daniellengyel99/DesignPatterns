package rouvt.models;

import lombok.NoArgsConstructor;
import javax.persistence.*;

@NoArgsConstructor(force = true)
@Entity
public class Author {
    @Id
    private String name;

    public Author(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("models.Author: "+this.name);
    }

}
