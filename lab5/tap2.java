import java.util.Scanner;

public class tap2{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Санды енгізіңіз: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Сан 3-ке және 5-ке бөлінеді.");
        } else if (number % 3 == 0) {
            System.out.println("Сан 3-ке бөлінеді.");
        } else if (number % 5 == 0) {
            System.out.println("Сан 5-ке бөлінеді.");
        } else {
            System.out.println("Сан 3-ке де, 5-ке де бөлінбейді.");
        }

        scanner.close();
    }
}