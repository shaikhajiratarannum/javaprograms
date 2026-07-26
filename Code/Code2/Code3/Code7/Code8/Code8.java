import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary : ");
        int basic = sc.nextInt();
        System.out.println("Enter allowances : ");
        int allowances = sc.nextInt();
        int total = basic + allowances;
        System.out.println("Total salary :  " + total);
        sc.close();
    }
}
