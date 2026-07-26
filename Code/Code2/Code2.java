import java.util.Scanner;

public class Code2 {
    public static void main(String[] ad) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product :  " + (a * b));
        System.out.println("Quotient :   " + (a / b));
        System.out.println("Remainder :   " + (a % b));
        sc.close();

    }
}
