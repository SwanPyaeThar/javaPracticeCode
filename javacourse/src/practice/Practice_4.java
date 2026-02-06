package practice;
import java.util.Scanner;
public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int today,elapsedDay,futureDay;
        //System.out.println("Sun is 0\nMon is 1\nTue is 2\nWed is 3\nThu is 4\nFri is 5\nSat is 6");
        System.out.println("Enter today's day: ");
        today=sc.nextInt();
        System.out.println("Enter elapsed day: ");
        elapsedDay=sc.nextInt();
        futureDay = (today+elapsedDay) %7;
        if(today == 0){
            System.out.println("Today is Sunday");
        } else if (today==1) {
            System.out.println("Today is Monday");
        }else if (today==2) {
            System.out.println("Today is Tuesday");
        }else if (today==3) {
            System.out.println("Today is Wednesday");
        }else if (today==4) {
            System.out.println("Today is Thursday");
        }else if (today==5) {
            System.out.println("Today is Friday");
        }else{
            System.out.println("Today is Saturday");
        }
        if(futureDay==0){
            System.out.println("and the Future day is Sunday");
        }else if(futureDay==1){
            System.out.println("and the Future day is Monday");
        }else if(futureDay==2){
            System.out.println("and the Future day is Tuesday");
        }else if(futureDay==3){
            System.out.println("and the Future day is Wednesday");
        } else if (futureDay==4) {
            System.out.println("and the Future day is Thursday");
        }else if(futureDay==5){
            System.out.println("and the Future day is Friday");
        }else{
            System.out.println("and the Future day is Saturday");
        }
        sc.close();


    }
}
