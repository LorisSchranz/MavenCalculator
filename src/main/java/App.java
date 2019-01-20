import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        System.out.println();


        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.sum(valueA,valueB));

    }
}
