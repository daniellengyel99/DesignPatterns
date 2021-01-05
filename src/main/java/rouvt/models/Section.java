package rouvt.models;

import lombok.NoArgsConstructor;
import rouvt.services.Observable;

import javax.persistence.*;
import java.util.ArrayList;

@NoArgsConstructor(force = true)
@Entity
public class Section implements Element, Observable {

    @Id
    protected String sectionTitle;
    protected String oldsectionTitle;
    private ArrayList<Observer> observerList=new ArrayList<>();

//    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL)
    protected ArrayList<Element> content = new ArrayList<Element>();

    public Section(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }

    public int add(Element elm){
        content.add(elm);
        return content.indexOf(elm);
    }

    public void accept(Visitor v) {

        v.visit(this);
        for (Element i:content){
            i.accept(v);
        }
    }

    public void remove(Element elm){
        content.remove(elm);
    }

    public Element getElement(int index){
        return content.get(index);
    }

    public void print(){
        System.out.println("main.java.models.Section: "+this.sectionTitle);
        for(Element i : content){
            i.print();
        }
    }

    @Override
    public void setNewValue(String newValue) {
        this.oldsectionTitle=sectionTitle;
        sectionTitle=newValue;
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
            i.update(oldsectionTitle,sectionTitle);
        }
    }
}
