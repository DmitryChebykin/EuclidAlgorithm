import java.util.Scanner;

public class EuclidAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое первое число");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите целое второе число");
        int secondNumber = scanner.nextInt();

        int gcd = getGCD(firstNumber, secondNumber);
        System.out.println("Наибольший общий делитель равен " + gcd);
    }

    private static int getGCD(int firstNumber, int secondNumber) {
        while (firstNumber % secondNumber != 0) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp % secondNumber;
        }

        return secondNumber;
    }
}