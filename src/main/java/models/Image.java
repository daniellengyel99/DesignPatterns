package models;
import lombok.NoArgsConstructor;
import services.ImageLoaderFactory;

import javax.persistence.Entity;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(force = true)
@Entity
public class Image implements Element{

    private String imageName;

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

}
