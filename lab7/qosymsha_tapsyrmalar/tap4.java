public class tap4 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                A[i][j] = (int)(Math.random()*10);

        System.out.println("Қосымша диагональ:");
        for (int i = 0; i < 5; i++)
            System.out.println(A[i][4 - i]);
    }
}