import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = Sc.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = Sc.nextInt();
        int area = length * breadth;
        System.out.println("Area of the rectangle is : " + area);
        Sc.close();

    }
}
