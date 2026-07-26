import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 scores : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println("Highest score : " + max);
        sc.close();
    }

}
