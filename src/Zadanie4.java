import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import static com.sun.tools.sjavac.Util.intersection;
import static com.sun.tools.sjavac.Util.union;

public class Zadanie4 implements IZadanie{
    public void Start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź elementy zbioru A oddzielone spacją: ");
        Set<Integer> setA = readSet(scanner);
        System.out.print("Wprowadź elementy zbioru B oddzielone spacją: ");
        Set<Integer> setB = readSet(scanner);
        System.out.println("Suma zbiorów: " + union(setA, setB));
        System.out.println("Różnica zbiorów A-B: " + difference(setA, setB));
        System.out.println("Część wspólna zbiorów: " + intersection(setA, setB));
        System.out.println("Różnica symetryczna zbiorów: " + symmetricDifference(setA, setB));
    }

    public static Set<Integer> readSet(Scanner scanner) {
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Set<Integer> set = new HashSet<>();
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        return set;
    }

    public static Set<Integer> union(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    public static Set<Integer> difference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.removeAll(setB);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.retainAll(setB);
        return result;
    }

    public static Set<Integer> symmetricDifference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>();
        for (Integer element : setA) {
            if (!setB.contains(element)) {
                result.add(element);
            }
        }
        for (Integer element : setB) {
            if (!setA.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
    }



