import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Fibonacci digits");
        int num = sc.nextInt();
        System.out.print(a + ",");
        System.out.print(b + ",");
        for (int i = 3; i <= num; i++) {
            int c = a + b;
            System.out.print(c + ",");
            b = a;
            a = c;

        }
    }
}
