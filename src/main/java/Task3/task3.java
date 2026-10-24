package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int negativeCount = 0;

        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if (temp < 0) {
                    negativeCount++;
                }
            }

            sc.close();

            if (negativeCount == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println(negativeCount);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: data.txt file not found");
        }
    }
}
