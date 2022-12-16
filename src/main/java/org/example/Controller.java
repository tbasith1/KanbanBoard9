package org.example;

import java.util.List;

public class Controller {
CanbanBoardData canbanBoardData;
    public void executeCommand(String command){

        if (command.contains("/get card ")){
            String arg = command.split("/get card ")[1];
            List<CanbanCard> cards = canbanBoardData.getCards(arg);

        }

        System.out.println(command);
    }

}
