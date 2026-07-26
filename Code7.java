import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks =  ");
        int marks = sc.nextInt();
        if (marks >= 50)
            System.out.println("pass");
        else
            System.out.println("fail");
        sc.close();

    }

}
