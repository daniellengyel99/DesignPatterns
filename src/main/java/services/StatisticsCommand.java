package services;

import models.*;

public class StatisticsCommand implements Command{

    public void execute(){

        Book b1=DocumentManager.getInstance().getBook();
        if(b1!=null) {
            BookStatistics stats = new BookStatistics();
            b1.accept(stats);
            stats.printStatistics();
        }
    }


}
