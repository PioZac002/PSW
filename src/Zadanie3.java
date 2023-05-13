import java.util.Scanner;

public class Zadanie3 implements IZadanie{
    public void Start(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj wyrazenie binarne do weryfikacji");
        String binaryString = scanner.nextLine();
            int holeCount = 0;
            boolean isInHole = false;
            for (char c : binaryString.toCharArray()) {
                if (c=='1') {
                    if (isInHole) {
                        holeCount++;
                        isInHole = false;
                    } else {
                        isInHole = true;
                    }
                } else if (c=='0') {
                    continue;
                }
            }
        System.out.println("Liczba dziur binarnych w sekwencji " + binaryString + " to: " + holeCount);

    }

}
