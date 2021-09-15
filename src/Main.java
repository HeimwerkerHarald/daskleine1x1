import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        System.out.println("Bis zu welcher Zahl möchtest du Multiplizieren ?");
        numberOne = scanner.nextInt();
        System.out.println("Gib bitte ein bis zu welcher zahl damit Multipliziert werden soll.");
        numberTwo = scanner.nextInt();
        for (int m = 1; m <= numberOne; m++) {
            for (int  j = 0; j<= numberTwo; j++){
                System.out.println(m + "x" + j +"=" + (m*j));
            }
        }
    }
}
