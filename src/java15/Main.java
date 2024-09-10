package java15;

import java15.Commands.Find;
import java15.Commands.SelectCommand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SelectCommand.start(scan);
    }
}