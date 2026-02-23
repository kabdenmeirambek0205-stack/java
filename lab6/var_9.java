public class var_9 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x >= 0 && x < 1) {
            f = x*Math.pow(Math.cos(x),2) + Math.sin(x);
        } else if (x >= 1 && x <= 2) {
            f = Math.cbrt(Math.pow(x,2) + 6*Math.sin(x));
        } else if (x > 2) {
            f = 1.7*Math.pow(x,3) + 7;
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}