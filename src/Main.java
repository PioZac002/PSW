import com.sun.source.tree.WhileLoopTree;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        zadanie1();

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
        List uniqueValues = new ArrayList<>(); // w arrayLiscie moga istniec duplikaty takze moze byc kilku Mariuszy etc.

        Scanner scanner=new Scanner(System.in);
        while (true){

        }
        =scanner.nextLine();

//        System.out.println(name);
    }
}