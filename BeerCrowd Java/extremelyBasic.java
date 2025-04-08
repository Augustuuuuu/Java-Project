import java.util.Scanner;

/*Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get "Presentation Error".

Input
The input file will contain 2 integer numbers.

Output
Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.

Obs.: don't forget the endline after all. */
public class extremelyBasic{
    public static void main(String[] args) {
        int a,b,sum;
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        b = ler.nextInt();
        sum = a + b;
        System.out.println("X = "+ sum);
    }
    
}
