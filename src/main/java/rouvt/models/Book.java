package rouvt.models;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor(force = true)
@Entity
public class Book{
    @Column
    @Id
    private String title;

    private ArrayList<Element> content = new ArrayList<Element>();
    
    @ManyToMany(cascade = CascadeType.ALL)
    private ArrayList<Author> authors = new ArrayList<>();

    public Book(String title){
        this.title=title;
    }

    public void addContent(Element elm){
        content.add(elm);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void print(){
        System.out.println("Book title: "+this.title);
        printAuthors();
        for(Element i:content){
            i.print();
        }
    }

    private void printAuthors(){
        for (Author i: authors){
            i.print();
        }
    }

    public void accept(Visitor v) {

        v.visit(this);
        for (Element i:content){
            i.accept(v);
        }
    }

}
