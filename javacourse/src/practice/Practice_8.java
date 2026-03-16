package practice;
import java.util.Scanner;
public class Practice_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle1's center x ,y-coordinate ,and radius: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.println("Enter circle2's center x ,y-coordinate ,and radius: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        if (distance <= Math.abs(r1-r2)){
            System.out.println("Circle2 is inside circle1");
        } else if (distance <= r1 + r2) {
            System.out.println("Circle2 overlaps circle2");

        }else {
            System.out.println("Circle2 does not overlap circle1");
        }
        sc.close();
    }
}
