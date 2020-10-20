package Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myArray[] = {1, 2, 3, 4, 5}; //index 0-4
        int num = 0;
        try {
            System.out.println("Enter an integer: ");
            num = sc.nextInt();
            try {
                System.out.println(myArray[num]);
            } catch (InputMismatchException s) {
                System.out.println("please, enter index in range of array.");
                s.printStackTrace();
            }

        } catch (InputMismatchException e) {
            System.out.println("Please, enter integer only.");
            //e.printStackTrace();

        }
        System.out.println("The number is:" + num);
        System.out.println("Good Bye.");

    }//main
}//class
