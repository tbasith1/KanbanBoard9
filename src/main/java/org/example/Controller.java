package org.example;

import java.util.List;

public class Controller {
CanbanBoardData canbanBoardData1;
    public void executeCommand(String command){

        if (command.contains("/get card ")){
            String arg = command.split("/get card ")[1];
            List<CanbanCard> cards = canbanBoardData1.getCards(arg);

        }

        System.out.println(command);
    }

}
