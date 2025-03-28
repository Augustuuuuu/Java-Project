import java.util.Scanner;

public class AverageOne_1005 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float a = read.nextFloat();
        float b = read.nextFloat();
        float media = ((a * 3.5f) + (b * 7.5f)) / 11;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}
