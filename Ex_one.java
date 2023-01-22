/* Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
(произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5 */

import java.util.Scanner;

public class Ex_one {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a = ");
        int a = iScanner.nextInt();
        int summa = 0;
        int proizvedenei = 1;
        for (int i = 1; i <= a; i++) {
            summa=summa+i;
            proizvedenei=proizvedenei*i;
        }        
        System.out.printf("треугольного число = %s",summa);
        System.out.println();
        System.out.printf("%d! = %s",a, proizvedenei);
        iScanner.close();
    }
}
