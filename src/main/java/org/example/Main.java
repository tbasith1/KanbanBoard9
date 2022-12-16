package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nKanbanBoard9!\nBy Thomas and Artur\n\n");


        while (1!=0) {
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            System.out.println(command + "\n");

            Controller controller = new Controller();
            controller.executeCommand(command);
        }
    }

}