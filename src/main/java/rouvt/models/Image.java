package rouvt.models;
import lombok.NoArgsConstructor;
import rouvt.services.ImageLoaderFactory;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(force = true)
@Entity
public class Image implements Element{
    @Id
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
