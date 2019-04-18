package main.chapter5_Control_Statements;

import java.io.IOException;

public class DoWhileExample {

    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("Enter your choice:");
            choice = (char)System.in.read();
        }while (choice  < 1 );


    }
}
