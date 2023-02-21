import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n, t1 = 0, t2 = 1, tn, i;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the limit");
        n = r.nextInt();
        System.out.println("fibnacci series is : ");
        for (i = 0; i <= n; i++) {
            System.out.println(" " + t1);
            tn = t1 + t2;
            t1 = t2;
            t2 = tn;

        }
    }
}
