import java.util.Scanner;

public class tap9 {
    public static void main(String[] args) {
        int[] A = new int[15];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            A[i] = (int)(Math.random()*50);
            System.out.print(A[i] + " ");
        }

        System.out.print("\nІздейтін санды енгіз: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 15; i++) {
            if (A[i] == key) {
                System.out.println("Табылды! Индексі: " + i);
                found = true;
            }
        }

        if (!found)
            System.out.println("Сан табылмады");
    }
}