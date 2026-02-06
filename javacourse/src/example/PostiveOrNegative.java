package example;
import java.util.Scanner;
public class PostiveOrNegative {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is postive or negative: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Thi numbe is negative!");
        } else if (num >=0) {
            System.out.println("This numbe is positive!");
        }else {
            System.out.println("Something went wrong!");
        }
        sc.close();
    }

}
