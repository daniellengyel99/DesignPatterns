package models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseElement implements Element{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;

    @Override
    public void print() {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
