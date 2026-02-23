public class Tap8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 6; j++)
                A[i][j] = Math.random()*20 - 10;

        for (int j = 0; j < 6; j++) {
            double product = 1;
            for (int i = 0; i < 12; i++)
                if (A[i][j] < 0) product *= A[i][j];

            System.out.println("Бағана " + j + " көбейтінді: " + product);
        }
    }
}