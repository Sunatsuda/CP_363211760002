package Lab3;

import java.util.Scanner;

// รับค่าจำนวนเต้มจากผู้ใช้ไปเรื่อยๆ เมื่อผู้ใช้ใส่ค่า 0 ให้จบการทำงาน
public class Example_While {

    public  static void  main(String[] args) {

        Scanner SC = new Scanner(System.in);

        int num = 1;

        while (num !=0){
            System.out.println("Enter integer : ");
            num = SC.nextInt();
        }
        System.out.println("End. Good Bye.");

    }//main
}//class
