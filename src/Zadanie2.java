import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadanie2 implements IZadanie{
    public void Start(){
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
