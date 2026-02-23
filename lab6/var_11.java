public class var_11 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 4) {
            f = Math.sin(Math.PI*x) + Math.pow(Math.pow(x,2)+6, 1.0/5);
        } else if (x > 4) {
            f = Math.log(x) + Math.sqrt(3*x+7);
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}