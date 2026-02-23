public class tap11 {
    public static void main(String[] args) {
        int[][] A = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = (int)(Math.random()*10);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонирленген:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }
}