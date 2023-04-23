
/**
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */
package Lesson_01;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }
    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
