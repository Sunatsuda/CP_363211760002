package Lab3;

import java.util.Scanner;

public class Example_if_else {

    public  static void  main(String[] args) {

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter integer 1: ");
        int X = SC.nextInt();
        System.out.println("Enter integer 2: ");
        int Y = SC.nextInt();

        //condition
        if(X>Y) {
           System.out.println(X + " grater than " +Y);
           System.out.println("X grater than Y.");
        } else
            System.out.println(X+" less than "+Y);

        System.out.println("Good Bye.");


    }//main
}//main
