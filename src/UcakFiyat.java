
import java.util.Scanner;
public class UcakFiyat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double distance;
        int age;
        int ticketType;
        double costPerKm=0.1,totalCost;
        System.out.println("Enter the distance of your flight (KM) :");
        distance=scanner.nextDouble();
        while(distance<0){
            System.out.println("This is a invalid value, please enter a valid distance value!");
            distance=scanner.nextDouble();
        }
        System.out.println("How old are you? ");
        age=scanner.nextInt();
        while(age<0){
            System.out.println("This is a invalid value, please enter a valid distance value!");
            age=scanner.nextInt();
        }
        System.out.println("Enter your ticket type :\n1 : One-way ticket\n2 : Return ticket ");
        ticketType=scanner.nextInt();
        while(ticketType!=1&&ticketType!=2){
            System.out.println("This is a invalid value, please enter a valid distance value\nType 1 for one way tickets type 2 for return tickets");
            ticketType=scanner.nextInt();
        }
        totalCost=costPerKm*distance;
        double finalCost=0;
            if (age < 12) {
                totalCost = totalCost / 2;
            } else if (age < 24) {
               totalCost = totalCost * 9 / 10;
            } else if (age > 65) {
                totalCost = totalCost * 7 / 10;
            }
            if (ticketType==2){
                finalCost=totalCost*8/5;
            }
            else{
                finalCost=totalCost;
            }
        System.out.println("Final cost : "+finalCost+"TL");


    }
}
