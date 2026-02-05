package practice;
import java.util.Scanner;
//Assuming that there are 7.481 gallons in a cubic feet. Write a program that asks the user to enter length, width and height to calculate cubic feet(width*height*length), then displays the equivalent in number of gallons.

public class Practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length,width,height,numberOfgallon,cubicFeet;
        System.out.println("enter the length,width,hight: ");
        length = sc.nextFloat();
        width = sc.nextFloat();
        height = sc.nextFloat();
        cubicFeet = width*height*length;
        numberOfgallon = (float)(cubicFeet * 7.481);
        System.out.println("Your tank can store "+ numberOfgallon +" gallons");
        sc.close();


    }
}
