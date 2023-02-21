import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        int n, temp, ans = 0, r;
        Scanner q = new Scanner(System.in);
        System.out.println("Enter the 3 digit number");
        n = q.nextInt();
        temp = n;
        while (temp != 0) {
            r = temp % 10;
            ans += (r * r * r);
            temp = temp / 10;
        }
        if (ans == n) {
            System.out.println("The number is armstrong");
        } else {
            System.out.println("The number is not armstrong");
        }
    }
}
