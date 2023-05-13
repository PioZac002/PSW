import java.util.Scanner;

public class Zadanie5 implements IZadanie {
    @Override
    public void Start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println("Liczba " + number + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + number + " nie jest liczbą pierwszą.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


