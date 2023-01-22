//Задача 3. Реализовать простой калькулятор
import java.util.Scanner;

public class Ex_three {
    public static void main(String[] args) {
        System.out.printf("Введите действие (+, -, * или /): ");
        String action = iScanner.nextLine();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число = ");
        int number1 = iScanner.nextInt();
        System.out.printf("Введите второе число = ");
        int number2 = iScanner.nextInt();
       
        //int rezult = 0;
        if (action == "+") {
            System.out.printf("%d + %f = %g", number1, number2, number1 + number2);
        }
        iScanner.close();
    }
}
