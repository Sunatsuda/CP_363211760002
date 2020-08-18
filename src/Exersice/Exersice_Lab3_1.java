package Exersice;

import java.util.Scanner;

// รับค่าตัวเลขจากผู้ใช้จำนวน 5 ครั้ง จากนั้นแสดงผลรวม และค่าเฉลี่ย
public class Exersice_Lab3_1 {
    public  static void  main(String[] args) {

        Scanner SC = new Scanner(System.in);

        double total = 0;

        for (int i =0; i < 5; i++) {
            System.out.println("Enter number: ");
            double num = SC.nextInt();
            total +=num; // total = total+num
        }


        //find average value
        double avg = total / 5;

        //display
        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
    }
}
