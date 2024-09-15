import java.util.Scanner;

public class lesson_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input radius and press Enter:");
        float radius = sc.nextFloat();
        float S;
        if (radius >= 0) {
            if (radius == 0) {
                S = 0;
            } else {
                S = (float) Math.PI * (float) Math.pow(radius, 2);
            }
            System.out.print("Total area ");
            System.out.print(S);
            System.out.println(" sq.m.");
        } else {
            System.out.println("Invalid radius value");
        }

        System.out.println("Goodbye)))))))");

    }
}
