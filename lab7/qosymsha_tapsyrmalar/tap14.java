public class tap14 {
    public static void main(String[] args) {

        int[] A = new int[10];

        // Массивті толтыру
        for (int i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i] + " ");
        }

        // Selection Sort
        for (int i = 0; i < A.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }

            // Ауыстыру
            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }

        System.out.println("\nСұрыпталған массив:");
        for (int x : A)
            System.out.print(x + " ");
    }
}