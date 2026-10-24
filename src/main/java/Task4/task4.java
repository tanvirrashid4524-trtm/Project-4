package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int count = 0;

        try {
            File file = new File("duomenys.txt");
            Scanner sc = new Scanner(file);

            int n = sc.nextInt();
            if (n > 0) {
                int prev = sc.nextInt();

                for (int i = 1; i < n; i++) {
                    int current = sc.nextInt();
                    if (current < prev) {
                        count++;
                    }

                    prev = current;
                }
            }

            sc.close();

            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("Error: duomenys.txt file not found");
        }
    }
}