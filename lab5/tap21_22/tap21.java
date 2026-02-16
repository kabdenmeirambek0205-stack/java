// tap-21
import java.util.Scanner;

public class tap21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        int x = sc.nextInt();

        int result;

        if (x > 0) {
            result = x * x;
        } else if (x == 0) {
            result = 0;
        } else {
            result = -x;
        }

        System.out.println("f(x) = " + result);
    }
}