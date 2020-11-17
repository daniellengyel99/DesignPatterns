package models;

import java.util.ArrayList;

public class Section implements Element{

    protected String sectionTitle;
    protected ArrayList<Element> content = new ArrayList<>();

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
        System.out.println("models.Section: "+this.sectionTitle);
        for(Element i : content){
            i.print();
        }
    }
}
