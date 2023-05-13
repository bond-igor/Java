/**
 * task2
 * Вывести все простые числа от 1 до 1000
 */
package Lesson_01;
import java.util.ArrayList;
import java.util.List;

public class Task_02 {

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа от 1 до 1000: " + primes);
    }
}
