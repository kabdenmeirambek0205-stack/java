public class var_6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x < 1.5) {
            f = x * Math.tan(x) - Math.sin(x);
        } else if (x >= 1.5 && x < 2.5) {
            f = Math.pow(x,3) + Math.sin(x);
        } else {
            f = 3*Math.pow(x,3) + 5;
        }

        System.out.println("f(x) = " + f);
    }
}