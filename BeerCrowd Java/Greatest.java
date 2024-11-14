import java.util.Scanner;

public class Greatest{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        // Calculating the greatest between A and B
        int maiorAB = (a + b + Math.abs(a - b)) / 2;

        // Calculating the greatest between maiorAB and C
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior+" eh o maior");
    }
}