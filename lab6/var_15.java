public class var_15 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 1 && x <= 3) {
            f = Math.pow(Math.pow(x,3) + Math.sin(Math.PI*x) + Math.log(x), 1.0/4);
        } else if (x > 3 && x <= 7) {
            f = Math.cbrt(1.5*Math.pow(x,2) - Math.exp(2*x) + Math.pow(Math.log(x),3));
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}