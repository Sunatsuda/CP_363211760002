package Exersice;
import java.util.ArrayList;
import java.util.Scanner;

public class mySupercar {

    public static void main(String[] args) {
        ArrayList<SuperCar> mycar = new ArrayList<SuperCar>();
        Scanner SC = new Scanner(System.in);
        System.out.println(" my Super car?: ");
        int num_car = SC.nextInt();
        //input data
        mycar = inputdata(mycar, num_car);
        //display data
        displayData(mycar);







    }//main

    private static void displayData(ArrayList<SuperCar> mycar) {
        System.out.println("Data object below:");
        for (SuperCar std : mycar) {
            System.out.println(std.toString());

        }


    }

    private static ArrayList<SuperCar> inputdata(ArrayList<SuperCar> mycar, int num_car) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please, enter Supercar info below: ");

        for (int i = 0; i <num_car ; i++) {
            System.out.println("Enter Supercar brand: ");
            String brand = Sc.nextLine();
            System.out.println("Enter Supercar color: ");
            String color = Sc.nextLine();
            System.out.println("Enter Supercar engine size: ");
            String enginesize = Sc.nextLine();
            System.out.println("Enter Supercar max speed: ");
            String maxspeed = Sc.nextLine();
            System.out.println("Enter Supercar country of origin: ");
            String countryoforigin = Sc.nextLine();


            mycar.add(new SuperCar(brand,color,Integer.parseInt(maxspeed),Integer.parseInt(enginesize),countryoforigin));
        }
        return mycar;
    }
}//cless

