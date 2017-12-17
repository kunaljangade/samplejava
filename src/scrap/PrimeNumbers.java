package scrap;

import java.util.Scanner;

/**
 * Created by kjangade on 8/15/2017.
 */
public class PrimeNumbers {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();


        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        isPrimeNumber(val);

        long result = 0;
        int number = 2;
        int count = 0;
        while (number < val) {
            if (isPrimeNumber(number)) {
                result += number;
                //leftCount++;
            }
            number++;
        }
        System.out.println("The sum of first " + val + " prime numbers is " + result);

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }

    private static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
