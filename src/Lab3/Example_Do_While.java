package Lab3;

import java.util.Scanner;

public class Example_Do_While {
    public  static void  main(String[] args) {


        Scanner SC = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter integer: ");
            num = SC.nextInt();
        }while (num != 0);
        System.out.println("End, Good Bye. ");




    }
}
