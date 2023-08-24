package taskthree;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        CarNumberValidator carNumberValidator = new CarNumberValidator();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите номер: (чтобы завершить введите \"выход\")");
                String number = scanner.nextLine();
                if(number.equals("выход")) {
                    break;
                }
                if(carNumberValidator.isValid(number)) {
                    System.out.println("Регион : " + carNumberValidator.getRegionName(number));
                } else {
                    System.out.println("Неправильно введенный номер");
                }
            }
        }
    }
}
