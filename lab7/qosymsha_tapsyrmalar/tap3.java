public class tap3 {
    public static void main(String[] args) {
        int[][] C = new int[10][10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                C[i][j] = (int)(Math.random()*20);
                sum += C[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Барлық элементтер қосындысы: " + sum);
    }
}