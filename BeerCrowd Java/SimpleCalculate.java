/*In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point. */

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int productCode1 = read.nextInt();
        int quantity1 = read.nextInt();
        double price1 = read.nextFloat();

        int productCode2 = read.nextInt();
        int quantity2 = read.nextInt();
        double price2 = read.nextFloat();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",quantity1 * price1 + quantity2 * price2 );
    }
}
