package java_homework_week6;



/**
 *Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {
    public static void main(String[] strings) {

        rectangle();
    }
        static void rectangle() {
            double  width = 5.6;
            double height = 8.5;
            double perimeter = 2 * (height + width);
            double area = width * height;
            System.out.println("area is : " + area);
            System.out.println("Perimeteris :" + perimeter);
        }

}

