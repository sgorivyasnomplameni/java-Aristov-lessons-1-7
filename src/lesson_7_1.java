public class lesson_7_1 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.println(" - chetnoye");
            } else {
                System.out.println(" - nechetnoye");
            }
        }
    }
}
