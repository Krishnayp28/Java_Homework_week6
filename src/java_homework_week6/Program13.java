package java_homework_week6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */
public class Program13 {


    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the second number: ");
        double y = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the third number: ");
        double z = Integer.parseInt(scanner.nextLine());
        average(x,y,z);
        scanner.close();
    }
    public static void  average(double x, double y, double z) {
          double avg  = x + y + z / 3;

        System.out.println("The average value is " + avg + "\n");
    }
}

