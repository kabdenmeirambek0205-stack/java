public class var_14 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > -1 && x <= 1) {
            f = Math.cbrt(Math.abs(x) + Math.pow(x,4));
        } else if (x > 1 && x <= 4) {
            f = Math.pow(Math.tan(3*x),2) + Math.log(5*x);
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}