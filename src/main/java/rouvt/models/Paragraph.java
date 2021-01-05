package rouvt.models;

import lombok.NoArgsConstructor;
import rouvt.services.*;

import javax.persistence.*;
import java.util.ArrayList;

@NoArgsConstructor(force = true)
@Entity
public class Paragraph implements Element,Observable{

    private String name;
    private String oldName;
    private ArrayList<Observer> observerList=new ArrayList<>();

    private AlignStrategy alignStrategy;

    public Paragraph(String name){
        this.name=name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
    }

    @Override
    public void setNewValue(String newValue) {
        oldName=name;
        name=newValue;
        notifyObservers();
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
        for(Observer i:observerList){
            i.update(oldName,name);
        }
    }
}
