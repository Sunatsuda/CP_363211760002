package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        ArrayList<Student> myStd = new ArrayList<Student>();
        Scanner SC = new Scanner(System.in);

        System.out.println("How many student?: ");
        int num_std = SC.nextInt();

        //input data
        myStd = inputdata(myStd, num_std);

        //display data
        displayData(myStd);







    }//main

    private static void displayData(ArrayList<Student> myStd) {
        System.out.println("Data object below:");
        for (Student std:myStd) {
            System.out.println(std.toString());

        }


    }

    private static ArrayList<Student> inputdata(ArrayList<Student> myStd, int num_std) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please, enter student info below: ");

        for (int i = 0; i <num_std ; i++) {
            System.out.println("Enter student name: ");
            String name = Sc.nextLine();
            System.out.println("Enter student id: ");
            String id = Sc.nextLine();
            System.out.println("Enter student level: ");
            String level = Sc.nextLine();
            System.out.println("Enter student age: ");
            String age = Sc.nextLine();

            myStd.add(new Student(name,id,level, Integer.parseInt(age)));
        }
        return myStd;
    }
}//cless
