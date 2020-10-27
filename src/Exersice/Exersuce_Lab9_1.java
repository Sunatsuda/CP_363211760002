package Exersice;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Exersuce_Lab9_1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String name;
        System.out.print("What is your name? : ");
        name = Scanner.nextLine();
        System.out.println("Your name is " + name);

        String studentid;
        System.out.print("What is your studentid? : ");
        studentid = Scanner.nextLine();
        System.out.println("Your studentid is " + studentid);

        String Major;
        System.out.print("What is your major? : ");
        Major = Scanner.nextLine();
        System.out.println("Your major is " + Major);

        String phonenumber;
        System.out.print("What is your phonenumber? : ");
        phonenumber = Scanner.nextLine();
        System.out.println("Your phonenumber is " + phonenumber);

        String email;
        System.out.print("What is your email? : ");
        email = Scanner.nextLine();
        System.out.println("Your email is " + email);

        Path myPath = Paths.get("C:/Users/LabCom_MT-4/Documents/myProfile/myProfile.txt");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(myPath, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
            writer.write(name);
            writer.newLine();  //ขึ้นบรรทัดใหม่
            writer.write(studentid);
            writer.newLine();  //ขึ้นบรรทัดใหม่
            writer.write(Major);
            writer.newLine();  //ขึ้นบรรทัดใหม่
            writer.write(phonenumber);
            writer.newLine();  //ขึ้นบรรทัดใหม่
            writer.write(email);
            writer.newLine();  //ขึ้นบรรทัดใหม่

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}