import java.util.Scanner;

public class var_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > -2 && x < 5) {
            f = 5 * Math.pow(x, 2) + 6;
        } else if (x >= 5) {
            f = Math.pow(x, 3) + 7;
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}