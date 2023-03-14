package java_homework_week6;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */
public class Program8 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base and height:");
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        Program8 obj = new Program8();
        obj.triangle(b,h);
        scanner.close();
    }
        public void triangle(int b, int h) {
            int area = (b * h) / 2;
            System.out.println("Area of Triangle is: " + area);
        }
    }
