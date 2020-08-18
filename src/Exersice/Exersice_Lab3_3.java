package Exersice;

import java.util.Scanner;

public class Exersice_Lab3_3 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = SC.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }


    }
}
