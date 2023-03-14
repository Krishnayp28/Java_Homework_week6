package java_homework_week6;

 import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value in Fahrenheit: ");
        double fahrenheit = Integer.parseInt(scanner.nextLine());
        degree(fahrenheit);
        scanner.close();
    }

        static void degree(double fahrenheit){
            double celsius = (fahrenheit-32)*5/9;
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }

    }


