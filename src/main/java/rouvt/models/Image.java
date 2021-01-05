package rouvt.models;
import lombok.NoArgsConstructor;
import rouvt.services.ImageLoaderFactory;
import rouvt.services.Observable;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(force = true)
@Entity
public class Image implements Element, Observable {
    @Id
    private String imageName;
    private String oldimageName;
    private ArrayList<Observer> observerList=new ArrayList<>();

    public Image(String name){
        this.imageName=name;
        try {
            TimeUnit.SECONDS.sleep(2);
            ImageLoaderFactory.create(name);

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print(){
        System.out.println("main.java.models.Image with name: "+this.imageName);
    }

    @Override
    public void setNewValue(String newValue) {
        oldimageName=imageName;
        this.imageName=newValue;
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
