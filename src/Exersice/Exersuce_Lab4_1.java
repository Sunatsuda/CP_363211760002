package Exersice;

import java.util.Scanner;

//1.Triangle = 0.5* b * h
//2.Cone     = (Pi * r * l) + (Pi * r * r)
//3.Circle = 2 * Pi * r
public class Exersuce_Lab4_1 {
    public  static  final  double PI = 3.14;

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);



        //display menu
        System.out.println("Please, select options below: ");
        System.out.println("1. Find area of Triangle");
        System.out.println("2. Find area of Cone");
        System.out.println("3. Find area of Circle");
        System.out.println("4. Exit: ");
        System.out.println("Select: ");
        int select = SC.nextInt();

        //switch-case
        switch (select){
            case  1:
                System.out.println("Enter base: ");
                double b = SC.nextDouble();
                System.out.println("Enter high: ");
                double h = SC.nextDouble();
                double area = findArea(b, h);
                System.out.println("The area of Triangle : "+area);
                break;
            case  2:
                System.out.println("Enter รัศมีของทรงกรวย: ");
                double r = SC.nextDouble();
                System.out.println("Enter ความสูงเอียงของทรงกรวย: ");
                double l = SC.nextDouble();
                double cone = findAreaCone(r, l);
                System.out.println("The area of Cone: "+cone);
                break;
            case  3:
                System.out.println("Enter : รัศมีของวงกลม ");
                double PI = SC.nextDouble();
                double Circle = findAreaCircle(PI);
                System.out.println("The area of Circle: "+Circle);
                break;

            case  4: System.exit(1);  break;
            default: System.out.println("Please, select number 1-4 ");



        }





    }
    //triangle
    public static double findArea(double b, double h) {
        return 0.5 * b * h;



    }
    //Cone
    public static double findAreaCone(double r, double l) {
        return(PI * r *l) + (PI * r * r);
    }
    //Circle
    public static double findAreaCircle(double r) {
        return 2 * PI *r;
    }
}//class
