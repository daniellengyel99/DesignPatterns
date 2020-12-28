package rouvt;

import rouvt.services.*;
import rouvt.services.Command;
import rouvt.services.DocumentManager;
import rouvt.services.OpenCommand;
import rouvt.services.StatisticsCommand;

public class Lab7Main {

    public static void main(String[] args) throws Exception {
        Command cmd1 = new OpenCommand();
        cmd1.execute();
        Command cmd2 = new StatisticsCommand();
        cmd2.execute();
        System.out.println("\nThe book: ");
        DocumentManager.getBook().print();
    }
}
