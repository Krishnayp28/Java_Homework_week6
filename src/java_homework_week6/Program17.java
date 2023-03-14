package java_homework_week6;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 */
public class Program17 {
    public static void main(String[] args) {

        String binary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the number.");
        binary =scanner.nextLine();
        int n1 = Integer.parseInt(binary);
        System.out.println("the binary is" + Integer.toBinaryString(n1));


        scanner.close();
    }
}








