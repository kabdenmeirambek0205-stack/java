public class var_12 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 2) {
            f = Math.cbrt(1.7*x + Math.sin(x));
        } else if (x > 2 && x <= 6) {
            f = Math.cos(Math.PI*x) + Math.tan(x);
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}