package Lab5;

import java.util.Scanner;

public class BasicArray2D {
    public static void main(String[] args) {

        int number[][] = new int[2][3];   // 2*3 = 6 blocks

        //input Data to array 2D
        number = inputData(number);
        //displayArray(number);
        displayArry(number);



    }

    private static void displayArry(int[][] number) {
        System.out.println("Data in array 2D: ");
        for (int i = 0; i < number.length; i++) { //row
            for (int j = 0; j < number[i].length; j++) { //column
                System.out.println(number[i][j] + " "); //number[0] [0]:

            }

            System.out.println();
        }
    }


    private static int[][] inputData(int[][] number) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please, input integers to attay 2D: ");
        for (int i = 0; i < number.length; i++) { //row
            for (int j = 0; j < number[i].length; j++) { //column
                System.out.println("namber[" + i + "][" + j + "]:"); //number[0] [0]:
                number[i][j] = SC.nextInt();
            }
        }
        return number;

    }
}