package org.example;

public class Controller {
    private CanbanBoardData canbanBoardData;

    public void executeCommand(String command) {

//        if (command.contains("/get card ")) {
//            String arg = command.split("/get card ")[1];
//            List<CanbanCard> cards = canbanBoardData.getCards(arg);
//
//        }
        if (command.contains("/add")) {
            if (command.contains("/add card")) {

                //logic

            }
            if (command.contains("/add release")) {
                String releaseName = command.split("/add release ")[1];     //done!         /add release NUMBER1
                canbanBoardData.addRelease(releaseName);
            }
        }
        if (command.contains("/edit")) {

        }
        if (command.contains("/delete")) {

        }
        if (command.contains("/list")) {
            if (command.contains("/list card")) {

                if (command.contains("/list card forlasthour")) {
//                    canbanBoardData.listCardForLastHour();
                }
                if (command.contains("/list card todo")) {
                    System.out.println(canbanBoardData.getCardsTodo());
                }
                if (command.contains("/list card inprogress")) {
                    System.out.println(canbanBoardData.getCardsInProgress());
                }
                if (command.contains("/list card done")) {
                    System.out.println(canbanBoardData.getCardsDone());
                }
                if (command.contains("/list card in release")) {
                    String releaseName = command.split("/list card in release ")[1];     //done!         /list card in release 3591739
                    System.out.println(canbanBoardData.getCardsInRelease(releaseName));
                }
            }


            if (command.contains("/list release")) {

                System.out.println(canbanBoardData.listRelease());

            }
        }
    }


}


//if(command.contains("")){}