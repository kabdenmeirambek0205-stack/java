public class var_5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x < 2) {
            f = Math.pow(x,3) * Math.cos(x);
        } else if (x >= 2 && x <= 5) {
            f = 3*Math.pow(x,4) + 7;
        } else if (x > 5 && x <= 9) {
            f = Math.sqrt(5*Math.pow(x,2) + 1.6);
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}