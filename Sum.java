import java.util.Scanner;

public class Sum {

    public void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        Sum sum = new Sum();
        sum.checkAge(age);
        scan.close();
    }

}