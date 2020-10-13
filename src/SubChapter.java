import java.util.ArrayList;

public class SubChapter {

    private String name;
    private ArrayList<Paragraph> paragraphs = new ArrayList<>();
    private ArrayList<Image> images = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

    SubChapter(String name){
        this.name=name;
    }

    public void createNewParagraph(String name){
        Paragraph paragraph = new Paragraph(name);
        paragraphs.add(paragraph);
    }

    public void createNewImage(String name){
        Image image = new Image(name);
        images.add(image);
    }

    public void createNewTable(String name){
        Table table = new Table(name);
        tables.add(table);
    }

    public void print(){
        System.out.println("Subchapter: "+this.name);
        printImages();
        printParagraphs();
        printTables();
    }

    private void printParagraphs(){
        for(Paragraph i : this.paragraphs){
            i.print();
        }
    };
    private void printTables(){
        for(Table i : this.tables){
            i.print();
        }
    };
    private void printImages(){
        for(Image i : this.images){
            i.print();
        }
    };


}
