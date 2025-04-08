import java.util.Scanner;

public class consumption {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalDistance = read.nextInt();
        float totalFuel =  read.nextFloat();

        // The average consumption
        System.out.printf("%.3f km/l\n",totalDistance /totalFuel);
    }
}