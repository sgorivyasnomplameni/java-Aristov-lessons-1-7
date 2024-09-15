public class lesson_7_2 {
    public static void main(String[] args) {
        float x, v, l;
        int i;
        x = (float) 17.1;
        v = (float) 0.1;
        l = (float) 36.1;
        i = 0;
        while (x < l) {
            System.out.println(x);
            i = i + 2;
            x = x + v;
        }
        System.out.println(i);
    }
}
