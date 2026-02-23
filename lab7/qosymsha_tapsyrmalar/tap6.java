public class tap6 {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        int max;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                A[i][j] = (int)(Math.random()*50);

        max = A[0][0];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                if (A[i][j] > max) max = A[i][j];

        System.out.println("Максимал элемент: " + max);
    }
}