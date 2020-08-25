package Exersice;

import java.util.Scanner;

public class Exersice_Lab3_4 {

    public static void main(String[] args) {
            //define account
            String username = "admin";
            String password = "1234";

            //create Scanner object as sc
            Scanner sc = new Scanner(System.in);

            int count = 0;
            do {
                System.out.print("Username: ");
                String u = sc.nextLine();
                System.out.print("Password: ");
                String p = sc.nextLine();
                if (u.equals(username) && p.equals(password)) {
                    System.out.println("Welcome to MT System.");
                    break;
                } else {
                    System.out.println("Username or Password is not correct.");
                    count++;
                    if (count == 3) {
                        System.out.println("Your account has been locked. Please, contact Admin");
                    }
                }
            } while (count < 3);




        }
    }


