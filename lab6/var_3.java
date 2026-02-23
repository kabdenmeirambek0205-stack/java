public class var_3  {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > -4 && x <= 5) {
            f = Math.cbrt(Math.pow(x,2)) + 3 + 6*Math.pow(x,2);
        } else if (x > 5) {
            f = Math.pow(x,5) + 3.5;
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}