public class var_13 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 1 && x <= 3) {
            f = Math.sin(5*x)*(Math.sqrt(1+Math.pow(x,2)) + Math.pow(Math.log(x),2));
        } else if (x > 3 && x <= 5) {
            f = Math.exp(x)*Math.cbrt(x + Math.exp(2*x));
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}