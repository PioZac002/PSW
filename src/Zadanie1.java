import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Zadanie1 implements IZadanie {

    public void Start(){

        Random random = new Random();
        int number = random.nextInt(100 + 1);
        Scanner scanner = new Scanner(System.in);
        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Zgadnij liczbe z przedzialu 0-100");
            int UserNumber = scanner.nextInt();
            if (UserNumber < number) System.out.println("Liczba jest za mala");
            else if (UserNumber > number) System.out.println("Zbyt duza liczba");
            else {System.out.println("Brawo! Zgadles liczbe");  wasNumberGuessed = true;}

        }
    }

}

