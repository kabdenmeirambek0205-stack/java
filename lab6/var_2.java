public class var_2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x >= 0) {
            f = Math.sqrt(Math.pow(x,3) + 5);
        } else if (x > -3 && x < 0) {
            f = 3 * Math.pow(x,4) + 9;
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}