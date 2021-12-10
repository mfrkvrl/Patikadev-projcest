import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("Enter a year value : ");
        year=scanner.nextInt();
        if (year%100==0){
            if (year%4==0){
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not a leap year");
            }
        }
            else{
                if (year%4==0){
                  System.out.println(year+" is a leap year");
                }
                else{
                    System.out.println(year+" is not a leap year");
                }
        }
    }
}
