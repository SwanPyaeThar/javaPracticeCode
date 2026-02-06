package example;
import java.util.Scanner;
public class BMI_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = 0, height=0,BMI=0;
        byte choice;
        System.out.println("Enter your choice\n 1 is Metric\n2 English/Imperial");
        choice = sc.nextByte();
        if (choice==2){
            System.out.println("Enter your weight.");
            weight = sc.nextDouble() * 0.453592;
            System.out.println("Enter your height");
            height = sc.nextDouble() * 0.0254;
        }else if (choice==1){
            System.out.println("Enter your weight.");
            weight = sc.nextDouble();
            System.out.println("Enter your height");
            height = sc.nextDouble();
        }else{
            System.out.println("Invalid choice.");
        }
        BMI = weight / Math.pow(height,2);
        if (BMI < 18.5) {
            System.out.println("You are underweight");
        }else if ( BMI < 25) {
            System.out.println("You are normalweight");
        }else if ( BMI < 30) {
            System.out.println("You are overweight");
        }else{
            System.out.println("Obese");
        }
        sc.close();
    }
}
