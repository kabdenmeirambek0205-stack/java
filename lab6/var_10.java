public class var_10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 2) {
            f = Math.pow(x,2)*Math.sin(x) + Math.sqrt(Math.pow(x,2)+1.2);
        } else if (x > 2 && x <= 6) {
            f = Math.pow(Math.tan(x),2) + Math.cos(x) + 3.5;
        } else {
            System.out.println("Анықталмаған");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}