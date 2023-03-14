package java_homework_week6;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Program6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find out the area");
        double radius = Integer.parseInt(scanner.nextLine());
        circle(radius);
        scanner.close();
    }

    public static void circle(double radius){
        double area = Math.PI * radius * radius;
        System.out.println("Area is = " + area);
    }
}

