public class lesson_7_4 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.format("%6.0f", (float) (10 * i + j) * (10 * i + j));
            }
            System.out.println();
        }
    }
}
