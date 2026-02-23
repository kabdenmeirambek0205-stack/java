public class Tap9 {
    public static void main(String[] args) {
        int[][] C = new int[5][5];
        int product = 1;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                C[i][j] = (int)(Math.random()*20 - 10);

        for (int i = 0; i < 5; i++)
            if (C[i][i] > 0) product *= C[i][i];

        System.out.println("Диагональ оң көбейтінді: " + product);
    }
}