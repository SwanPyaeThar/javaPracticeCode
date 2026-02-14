package practice;
import java.util.Scanner;
public class Practice_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String postion ="";
        double numberOfHour,salary = 0;
        System.out.println("Enter your postion");
        postion = input.nextLine();
        System.out.println("Enter your number of hour");
        numberOfHour = input.nextDouble();
        if (postion.compareToIgnoreCase("Lecture")==0){
            if (numberOfHour <=160){
                salary = 12000*numberOfHour;
            }else{
                salary = (160*12000) + (numberOfHour - 160) * 12000 * 1.5;
            }
        } else if (postion.compareToIgnoreCase("senior lecture")==0) {
            if (numberOfHour <=160){
                salary = 20000*numberOfHour;
            }else {
                salary =  (160*20000) + (numberOfHour - 160) * 20000 * 1.5;
            }
        } else  {
            System.out.println("invalid position");

        }
        System.out.println(postion + "of salary is " + salary);


    }
}
