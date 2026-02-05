package practice;
import java.util.Scanner;
//Write a program that allows user to enter temperature in degree Fahrenheit to degree Celsius and display the result. (TC = (TF -32)*5/9)
public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tf,tc;
        System.out.println("Enter temperature in degree Fahrenheit: ");
        tf = sc.nextDouble();
        tc =  (tf - 32)*(5.0/9);
        System.out.printf("Temperature : %.2f",tc);
        sc.close();
    }

}
