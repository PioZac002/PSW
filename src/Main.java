import com.sun.source.tree.WhileLoopTree;
import java.util.HashSet;
import java.util.Set;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //zadanie1();
        zadanie2();
    }


    public static void zadanie1() {

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

    public static void zadanie2(){
                Scanner scanner = new Scanner(System.in);
                Set<Integer> unikatoweLiczby = new HashSet<Integer>();
                int liczba;

                System.out.println("Podaj liczby całkowite (wpisz 'stop' aby zakończyć):");

                while (scanner.hasNextInt()) {
                    liczba = scanner.nextInt();
                    unikatoweLiczby.add(liczba);
                }

                System.out.println("Liczba unikatowych wartości: " + unikatoweLiczby.size());
            }

    }
