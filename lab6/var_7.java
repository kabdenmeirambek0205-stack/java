public class var_7 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x < 1) {
            f = Math.sqrt(3*Math.pow(x,3) + 4 + Math.cos(x));
        } else if (x >= 1) {
            f = 5 - Math.pow(Math.sin(9*x),2);
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}