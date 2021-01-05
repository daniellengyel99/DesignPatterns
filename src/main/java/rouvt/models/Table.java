package rouvt.models;
import lombok.NoArgsConstructor;
import rouvt.services.Observable;

import javax.persistence.*;
import java.util.ArrayList;

@NoArgsConstructor(force = true)
@Entity
public class Table implements Element, Observable {

    @Id
    private String name;
    private String oldName;
    private ArrayList<Observer> observerList=new ArrayList<>();

    public Table(String name){
        this.name=name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print(){
        System.out.println("Table with name: "+this.name);
    }

    @Override
    public void setNewValue(String newValue) {
        this.oldName=this.name;
        this.name=newValue;
    }

    @Override
    public void addObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {

    }
}
