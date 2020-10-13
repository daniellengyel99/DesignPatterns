import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Chapter> chapters = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();

    Book(String title){
        this.title=title;
    }

    public int createChapter(String name){
        Chapter ch = new Chapter(name);
        chapters.add(ch);
        return chapters.indexOf(ch);
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void print(){
        System.out.println("Book title: "+this.title);
        printAuthors();
        printChapters();

    }

    private void printChapters(){
        for (Chapter i : chapters){
            i.print();
        }
    }

    private void printAuthors(){
        for (Author i: authors){
            i.print();
        }
    }

}
