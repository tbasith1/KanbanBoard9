package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nKanbanBoard9!\nBy Thomas and Artur\n\n");

        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        System.out.println(command);





      //TEST
      TestOperations to = new TestOperations();
      to.testify("src/main/java/org/data/canban_data.yaml");

      CanbanBoardData cbd = DataPersistor.loadCanbanBoardData("src/main/java/org/data/canban_data.yaml");
      System.out.println(cbd.getCards("*").size());



      //console
      System.out.println("------------------------------------------------------------------------------------------------------");
      System.out.println("|                                             TODO                                                    |");
      System.out.println("------------------------------------------------------------------------------------------------------");
      System.out.println("|                                                                                                     |");
      
      cbd.getCanbanCard().forEach(c -> {
        System.out.println("|  |------------------------------|                                                                 |");
        System.out.println("|  |             "+c.getTitle()+"                 |                                                                 |");
        System.out.println("|  |------------------------------|                                                                 |");
        
      });


    }

}