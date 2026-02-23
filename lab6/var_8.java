public class var_8 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > -5 && x < 0) {
            f = Math.sqrt(Math.pow(x,2) + Math.abs(x));
        } else if (x >= 0 && x < 2) {
            f = 5*Math.pow(x,3) + Math.cos(x);
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}