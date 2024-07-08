import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Сумма двух чисел равна: " + (number1+number2));
        System.out.println("Разность двух чисел равна: " + (number1-number2));
        System.out.println("Произведение двух чисел равно: " + (number1*number2));
        System.out.println("Частное двух чисел равно: " + ((double)number1/number2));
    }
}
