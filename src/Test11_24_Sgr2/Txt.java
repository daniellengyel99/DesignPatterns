package Test11_24_Sgr2;

import services.AlignStrategy;

public class Txt implements Element{

    private String name;
    private Test11_24_Sgr2.AlignStrategy alignStrategy;

    Txt(String name){
        this.name=name;
    }

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setAlignStrategy(Test11_24_Sgr2.AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
    }

}
