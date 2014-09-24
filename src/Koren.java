/**
 * Created by Евгений on 24.09.2014.
 */

import java.util.Scanner;

public class Koren {
    public static void main(String[] args) {
        // Вводим числа
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 'a'!");
        double a = in.nextInt();
        System.out.println("Введите число 'b'!");
        double b = in.nextInt();
        System.out.println("Введите число 'c'!");
        double c = in.nextInt();
        // Высчитываем корень
        // Если а равно 0
        if (a == 0) {
            System.out.println("Число 'a' не может быть равно нулю!");
        }
        // Если нет, высчитываем дискриминант
        else {
            double d = (b * b - 4 * a * c);
            double k = Math.sqrt(d);
            double x, x1, x2;
            // Если дискриминант больше 0
            if (d > 0) {
                x1 = (-b + k) / (2 * a);
                x2 = (-b - k) / (2 * a);
                System.out.println("Корень 1 = " + x1);
                System.out.println("Корень 2 = " + x2);
            }
            // Если дискриминант равен 0
            else if (d == 0) {
                x = -b / (2 * a);
                System.out.println("Корень = " + x);
            }
            // Если дискриминант меньше 0
            else {
                System.out.println("Действительных корней не существует!");
            }
        }
    }
}