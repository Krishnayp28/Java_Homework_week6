package java_homework_week6;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    int a = 28;
    int b = 15;
    static int num1 = 55;
    static int num2 = 45;

    static void display(  int num1,int num2) {
        System.out.println(num1);
        System.out.println(num2);
    }
    // instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);

    }
  // static method
    public static void main(String[] ars) {
        Program4 obj = new Program4();
        display(obj.num1,obj.num2);
        obj.myMethod();
    }
}


