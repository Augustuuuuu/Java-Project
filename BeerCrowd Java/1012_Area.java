/*
Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding message (in Portuguese) and one space between the two points and the value. The value calculated must be presented with 3 digits after the decimal point.
*/
import java.util.Scanner;

public class Area_1012 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();
        final double PI = 3.14159;

        // A: Area of the right triangle with base A and height C
        System.out.printf("TRIANGULO: %.3f\n", a * c / 2);

        // B: Area of the circle with radius C
        System.out.printf("CIRCULO: %.3f\n", PI * c * c);

        // C: Area of the trapezium with bases A and B, and height C
        System.out.printf("TRAPEZIO: %.3f\n", (a + b) * c / 2);

        // D: Area of the square with side B
        System.out.printf("QUADRADO: %.3f\n", b * b);

        // E: Area of the rectangle with sides A and B
        System.out.printf("RETANGULO: %.3f\n", a * b);

        read.close();
    }
}
