import java.util.Scanner;
public class ciftSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,sum=0,numOfNumber=0;
        System.out.println("Enter a  value : ");
        number=scanner.nextInt();
        for(int i=0;i<number;i++){
            if(i%3==0&&i%4==0){
                sum+=i;
                numOfNumber++;
                System.out.println(i+" is divisible to 3 and 4");
            }

        }
        double average=sum/numOfNumber;
        System.out.println("average of the numbers which divisible 3 and 4 from 0 to number value is "+average);
    }
}
