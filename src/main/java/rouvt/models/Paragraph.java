package rouvt.models;

import lombok.NoArgsConstructor;
import rouvt.services.*;

import javax.persistence.*;

@NoArgsConstructor(force = true)
@Entity
public class Paragraph implements Element{

    private String name;
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

}
