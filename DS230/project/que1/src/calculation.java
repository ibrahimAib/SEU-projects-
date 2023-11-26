import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {

        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);

        System.out.println("please enter the first number:");
        int firstN = 0;
        try {
            firstN = firstNumber.nextInt();
        } catch (Exception e) {
            System.out.println("\u000C");

            System.out.println("you must enter a number:");
            firstN = firstNumber.nextInt();
        }
        System.out.println("please enter the secon number:");
        int secondN = secondNumber.nextInt();
        firstNumber.close();
        secondNumber.close();
        int sum = firstN + secondN;
        System.out.println(sum);
    }

}