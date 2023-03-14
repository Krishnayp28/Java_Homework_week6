package java_homework_week6;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Program16 {

    public static void main(String[] args) {

        String bin ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter 1st binary number :");
        String x = scanner.nextLine();
        System.out.println("enter 2nd binrry number :");
        String y = scanner.nextLine();
        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y,2);
        int n3 = n1 + n2;
        System.out.println("addition of binary number is  :"+ Integer.toBinaryString (n3));
        scanner.close();
    }
}



