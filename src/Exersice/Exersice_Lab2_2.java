package Exersice;

import java.util.Scanner;

public class Exersice_Lab2_2 {

      public  static void  main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("ระบุความยาวของฐานสามเหลี่ยม: ");
          double base = scanner.nextDouble();
          System.out.print("ระบุความสูงของสามเหลี่ยม: ");
          double height = scanner.nextDouble();

          double area = 0.5 * base * height;
          System.out.println("พื้นที่สามเหลี่ยม คือ " +area);


      }
    }

