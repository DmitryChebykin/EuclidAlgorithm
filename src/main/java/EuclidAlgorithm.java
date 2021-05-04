import java.util.Scanner;

public class EuclidAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое первое число");
        int number1 = scanner.nextInt();

        System.out.println("Введите целое второе число");
        int number2 = scanner.nextInt();

        if (number1 == 0 || number2 == 0) {
            System.out.println("Когда одно из чисел равно 0, НОД этих чисел не ищется.");
            return;
        }

        int greatestCommonDivisor = getGreatestCommonDivisor(number1, number2);
        System.out.printf("Наибольший общий делитель равен " + greatestCommonDivisor);
    }

    private static int getGreatestCommonDivisor(int number1, int number2) {
        while (number1 % number2 != 0) {
            int temp = number1;
            number1 = number2;
            number2 = temp % number2;
        }

        return number2;
    }
}