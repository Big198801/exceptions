package lesson2;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
 * значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */
public class HwLesson2 {
    public static void main(String[] args) {
        isNumberFloat();
    }

    private static void isNumberFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите дробное число: ");
        float number;
        if (sc.hasNextFloat()) {
            number = sc.nextFloat();
            System.out.printf("вы ввели дробное число: %f", number);
        } else {
            System.err.println("ввели не число");
            isNumberFloat();
        }
    }
}
