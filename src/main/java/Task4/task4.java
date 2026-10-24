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

            int n = sc.nextInt(); // koyta number

            if (n > 0) {
                int prev = sc.nextInt(); // prothom number ta prev e rakhlam

                for (int i = 1; i < n; i++) {
                    int current = sc.nextInt(); // porer number

                    if (current < prev) { // left neighbor er cheye choto kina
                        count++;
                    }

                    prev = current; // current ke porer bar er jonno prev banay dilam
                }
            }

            sc.close();

            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("Error: duomenys.txt file not found");
        }
    }
}
