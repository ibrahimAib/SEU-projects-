import java.util.Scanner;
import java.util.InputMismatchException;

public class calculation {
    public static void main(String[] args) {

        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);

        int firstN = 0;
        int secondN = 0;
        boolean y = true;
        while (y == false) {
            try {
                System.out.println("please enter the first number:");
                firstN = firstNumber.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("you must enter a number:");
                firstNumber.nextLine();
                y = false;
            }
        }
        System.out.println("please enter the secon number:");
        secondN = secondNumber.nextInt();
        firstNumber.close();
        secondNumber.close();
        int sum = firstN + secondN;
        System.out.println(sum);
    }

}