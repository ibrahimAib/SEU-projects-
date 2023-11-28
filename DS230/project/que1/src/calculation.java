import java.util.Scanner;
import java.util.InputMismatchException;

class Calculator {
    public static void main(String[] args) {
        int fNumber = userInput("enter the first number plece:");
        int sNumber = userInput("enter the second number plece:");
        userOptions(fNumber, sNumber);
    }

    static int userInput(String text) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean error = false;

        do {
            try {
                System.out.println(text);
                num = scan.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("you can't calculating letters.");
                scan.nextLine();
                error = true;
                System.out.println("-----------------------------------------------------------------\n");
            }
        } while (error == true);
        return num;
    }

    static void userOptions(int first, int second) {
        Scanner scan = new Scanner(System.in);
        boolean error = false;
        do {
            System.out.println("Please select one of the following operations by typin a, b, or c");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("a- Add the tow number");
            System.out.println("b- Multiply the tow numbers");
            System.out.println("c- Find the average of the tow numbers");
            System.out.println("-----------------------------------------------------------------");
            String userOption = scan.nextLine();
            if (userOption.equals("a")) {
                int sum = first + second;
                System.out.println(first + "+" + second + "=" + sum);
                error = false;
            } else if (userOption.equals("b")) {
                int multiplication = first + second;
                System.out.println(first + "*" + second + "=" + multiplication);
                error = false;
            } else if (userOption.equals("c")) {
                int average = first + second;
                System.out.println(first + "+" + second + "=" + average);
                error = false;
            } else {
                System.out.println("\n  ------------");
                System.out.println("| Wrong choice |");
                System.out.println("  ------------\n");
                error = true;
            }
        } while (error);
    }

}
