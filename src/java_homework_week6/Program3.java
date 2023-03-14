package java_homework_week6;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
public class Program3 {
    // static variable
    static int a = 40;
    // instance variable
    int b = 50;
    // instants method
    void simpleDisplay() {
        System.out.println(a);
        System.out.println(b);
    }
    // static method
    static void staticDisplay(int b) {
        System.out.println(a);
        System.out.println(b);
    }
    static void main(String[] args) {
        Program3 obj = new Program3();
        obj.simpleDisplay();
        staticDisplay(obj.b);
    }
}

