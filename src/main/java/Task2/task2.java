package Task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;
        int num;

        System.out.println("Enter integers one by one. Enter 0 to stop:");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;  // ekhane ++ ase kheyal koro
            } else {
                oddCount++;   // ekhane ++ ase
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        sc.close();
    }
}