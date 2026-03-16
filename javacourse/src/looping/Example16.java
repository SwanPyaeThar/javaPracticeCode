package looping;
import  java.util.Scanner;
public class Example16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base number:");
        int base=sc.nextInt();
        System.out.println("Enter exponent:");
        int power=sc.nextInt();
        int answer = 1;
        for(int i = 0 ; i < power ; i++){
            answer *=base;
        }
        System.out.println("The answer is:"+answer);
        sc.close();
    }

}
