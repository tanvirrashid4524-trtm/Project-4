package Task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter laptop price p: ");
        int p = sc.nextInt();

        System.out.print("Enter saved money s: ");
        int s = sc.nextInt();

        System.out.print("Enter weekly savings m: ");
        int m = sc.nextInt();

        // Calculate weeks needed
        int k = 0;
        int total = s;

        while (total < p) {
            total = total + m;
            k++;
        }

        // Output
        System.out.println("k = " + k);
        System.out.println("Explanation: After " + k + " weeks, total = " + total + " euros");

        sc.close();
    }
}
