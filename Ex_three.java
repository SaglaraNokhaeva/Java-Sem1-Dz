
//Задача 3. Реализовать простой калькулятор
import java.util.Scanner;

public class Ex_three {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите первое число = ");
        int number1 = iScanner.nextInt();

        System.out.printf("Введите второе число = ");
        int number2 = iScanner.nextInt();

       
        System.out.printf("Введите действие (+, -, * или /): ");
        String act = iScanner.next();

        if (act == "+") {
            // int sum=number1+number2;
            // System.out.print(act);
            System.out.print(number2);
        }
        System.out.print(act);
        iScanner.close();
    }
}
