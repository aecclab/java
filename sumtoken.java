import java.util.*;

class sumtoken {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("\nEnter sequence of integers with space b/w them and press enter:");
        String digit = scr.nextLine();
        StringTokenizer token = new StringTokenizer(digit);
        int dig = 0, sum = 0;
        System.out.println("\nEntered digits are:");
        while (token.hasMoreTokens()) {
            String s = token.nextToken();
            dig = Integer.parseInt(s);
            System.out.println(dig + "");
            sum = sum + dig;
        }
        System.out.println();
        System.out.println("sum is:" + sum);
    }
}
