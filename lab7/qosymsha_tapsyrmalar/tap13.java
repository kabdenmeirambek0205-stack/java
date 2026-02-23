public class tap13 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        boolean symmetric = true;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                A[i][j] = (int)(Math.random()*10);

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (A[i][j] != A[j][i])
                    symmetric = false;

        if (symmetric)
            System.out.println("Матрица симметриялы");
        else
            System.out.println("Матрица симметриялы емес");
    }
}