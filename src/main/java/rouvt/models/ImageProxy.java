package rouvt.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(force = true)
@Entity
public class ImageProxy implements Element{

    @Id
    private String name;
    Image realImage=null;

    public ImageProxy(String name){
        this.name=name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setNewValue(String newValue) {

    }


    public void print() {
        if(realImage==null){
            realImage = new Image(this.name);
        }
        realImage.print();
    }
}
