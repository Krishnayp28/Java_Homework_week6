package java_homework_week6;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Please Enter The Second Number:");
        int b = Integer.parseInt(scanner.nextLine());
        addition(a,b);
        subtraction(a,b);
        Program5 obj = new Program5();
        obj.multiply(a,b);
        obj.devide(a,b);

        scanner.close();
    }
    // static method for addition of number
    public  static void addition(int a, int b){
        int add =a+b;
        System.out.println("The Addition of Two Number is : " + add);
    }
    // static method for subtraction of number
    public static void subtraction(int a, int b){
        int sub = a-b;
        System.out.println("The Subtraction of Two Number is: " +sub);
    }
     // instance method for multiplication of number
    public void multiply(int a,int b){
        int mul = a*b;
        System.out.println("The Multication of Two Number is:" +mul);
    }
     // instance method for division of number
    public void devide(int a, int b){
        int div = a/b;
        System.out.println("The division of Two Number is :" + div);
    }








}





