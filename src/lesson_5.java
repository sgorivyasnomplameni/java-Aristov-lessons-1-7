import java.util.Scanner;

public class lesson_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input radius and press Enter:");
        float radius = sc.nextFloat();
        float S = (float) Math.PI * (float) Math.pow(radius, 2);
        System.out.print("Total area ");
        System.out.print(S);
        System.out.print(" sq.m.");
    }
}
