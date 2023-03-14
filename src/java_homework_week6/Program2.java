package java_homework_week6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */
public class Program2 {

    static int age = 25;
    static int setAge = 30;


    public static void main(String[] args) {
        myMethod();
    }
    // static method
    static void myMethod(){
        System.out.println(age);
        System.out.println(Program2.setAge);
    }
}
