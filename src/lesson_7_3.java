import java.util.Scanner;

public class lesson_7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius;

        do {
            System.out.println("Please, input radius and press Enter:");
            radius = sc.nextFloat();
            if (radius < 0) {
                System.out.println("Incorrect radius value");
            }
        }
        while (radius < 0);

        float S = (float) Math.PI * (float) Math.pow(radius, 2);

        System.out.print("Total area ");
        System.out.print(S);
        System.out.print(" sq.m.");
    }
}
