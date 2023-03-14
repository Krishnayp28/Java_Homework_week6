package java_homework_week6;

/**
 *  Write a Java program to swap two variables.
 */
public class Program15 {
    public static void main(String[] args) {
        int a, b, code;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        code = a;
        a = b;
        b = code;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }

}
