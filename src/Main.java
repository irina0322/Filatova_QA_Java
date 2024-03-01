import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число: ");
        int a = scanner.nextInt();

        System.out.print("Второе число b: ");
        int b = scanner.nextInt();

        // 1 - сравнение
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // 2 - действия: сложение
        int sum = a + b;
        System.out.println("Сумма: " + sum);

        // вычитание
        int dif = a - b;
        System.out.println("Разность:" + dif);

        // деление
        if (b != 0) {
            double div = (double) a / b;
            System.out.println("Частное: " + div);
        } else {
            System.out.println("На ноль делить нельзя");
        }

        // умножение
        int mult = a * b;
        System.out.println("Произведение: " + mult);
    }
}