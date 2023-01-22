
//Задача 3. Реализовать простой калькулятор
import java.util.Scanner;

public class Ex_three {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите первое число = ");
        float number1 = iScanner.nextInt();

        System.out.printf("Введите второе число = ");
        float number2 = iScanner.nextInt();

        System.out.printf("Введите действие (+, -, * или /): ");
        Character act = iScanner.next().charAt(0);

        if (act == '+') {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        }

        if (act == '-') {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        }
        if (act == '*') {
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        }
        if (act == '/') {
            System.out.printf("%f : %f = %f", number1, number2, number1 / number2);
        }
        iScanner.close();
    }
}
