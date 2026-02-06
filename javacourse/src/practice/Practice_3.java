package practice;
import java.util.Scanner;
//Quadratic Equation Calculate
public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,x,temp,t;
        System.out.println("Enter value of a: ");
        a = sc.nextDouble();
        System.out.println("Enter value of b: ");
        b = sc.nextDouble();
        System.out.println("Enter value of c: ");
        c = sc.nextDouble();
        temp = (b*b) - (4 * a* c);
        if (temp < 0){
            System.out.println("No Solution");
        }else if(temp == 0){
            System.out.println("One Solution : "+ -b/(2*a));
        }else{
            t = Math.sqrt(temp);
            System.out.println("Two solution : "+ (-b+t)/(2*a) + " OR " + (-b-t)/(2*a));
        }


    }
}
