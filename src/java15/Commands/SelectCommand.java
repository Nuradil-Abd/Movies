package java15.Commands;

import java.util.Scanner;

public class SelectCommand {
    public static void start(Scanner scan){
        Find find = new Find();
        SortBy sortBy = new SortBy();


        try{
            while(true){
                Show.show1();
                System.out.print("\nWrite command: ");
                String choice = scan.nextLine().trim();
                switch (choice){
                    case "1" -> find.find(scan);
                    case "2" -> sortBy.sortBy(scan);
                    case "3" -> {
                        System.out.println("Programme finish! Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid command. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
