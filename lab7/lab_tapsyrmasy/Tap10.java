public class Tap10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            D[i][i] = Math.random()*50;
            sum += D[i][i];
        }

        System.out.println("Диагональ орташа: " + sum/7);
    }
}