package rouvt.models;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor(force = true)
@Access(AccessType.PROPERTY)
@Entity
public class Book{
    private int id;

    private String title;

    private List<Element> content = new ArrayList<>();

    private List<Author> authors = new ArrayList<>();

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

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @ManyToMany(targetEntity = Author.class)
    public List<Author> getAuthors() {
        return authors;
    }

    @Column
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
