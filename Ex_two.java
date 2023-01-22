/* Задача 2. Вывести все простые числа от 1 до 1000 */

public class Ex_two {
    public static void main(String[] args) {
        System.out.print("2, ");
        for (int i = 5; i <= 1000; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.printf("%s, ", i);
            }
        }
    }
}
