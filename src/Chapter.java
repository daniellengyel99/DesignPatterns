import java.lang.reflect.Array;
import java.util.ArrayList;

public class Chapter {

    private String name;
    private ArrayList<SubChapter> subChapters = new ArrayList<>();

    Chapter(String name){
        this.name=name;
    }

    public int createSubChapter(String name){
        SubChapter sc = new SubChapter(name);
        subChapters.add(sc);
        return subChapters.indexOf(sc);
    }

    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }

    public void print(){
        System.out.println("Chapter name : "+this.name);
        printSubChapters();
    }

    private void printSubChapters(){
        for(SubChapter i : subChapters){
            i.print();
        }
    }

}
