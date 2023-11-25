import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int arrStudents1[] = new int[10];
        int arrStudents2[] = new int[10];

        userEnter(arrStudents1); // to get the IDs from user.

        System.out.println("All students IDs:");
        arrayPrinter(arrStudents1);

        reverse(arrStudents1, arrStudents2); // to reverse the order of the IDs.

        System.out.println("All students IDs in reverse:");
        arrayPrinter(arrStudents2);

    }

    public static void reverse(int[] array1, int[] array2) {
        int s = 0;
        int e = array1.length;
        while (0 < e) {
            array2[s] = array1[e - 1];
            e--;
            s++;
        }
    }

    public static void userEnter(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    static void arrayPrinter(int[] array) {
        for (int value : array)
            System.out.println(value);
        System.err.println(""); // just to organize the Terminal.
    }
}
