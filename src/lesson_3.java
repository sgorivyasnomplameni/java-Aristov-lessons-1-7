import java.math.*;

public class lesson_3 {
    public static void main(String[] args) {
        int a, b, c;
        float d;
        int i, j, k, l;
        a = -7;
        b = 8;
        d = 0.6f;
        c = a + b;
        i = a - b;
        j = a * b;
        k = a / b;
        l = a % b;
        double t = a + c / d;

        int module = Math.abs(a);
        double sinus = Math.sin(t);
        double cosinus = Math.cos(t);
        double chislopi = Math.PI;
        double plavay = 0.157e-1;
        double exponenta = Math.exp(b);
        double logarifm = Math.log(exponenta);

        double x = 2;
        double y = 4;
        int res = Math.round((float) Math.exp(y * Math.log(x)));

        String name, surname, fullname;
        name = "Anton ";
        surname = "Aristov";
        fullname = name + surname;

        System.out.println(c + " " + i + " " + j + " " + k + " " + l + " " + t);
        System.out.println(module);
        System.out.println(sinus);
        System.out.println(cosinus);
        System.out.println(chislopi);
        System.out.println(plavay);
        System.out.println(exponenta);
        System.out.println(logarifm);
        System.out.println(res);
        System.out.println(fullname);
    }
}
