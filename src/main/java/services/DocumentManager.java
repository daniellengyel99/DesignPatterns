package services;

import models.*;

public class DocumentManager {

    private static DocumentManager instance;
    private static Book book;

    private DocumentManager(){};

    public static DocumentManager getInstance(){
        if(instance==null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public static Book getBook(){
        return book;
    }

    public void setBook(Book b){
        this.book=b;
    }



}
