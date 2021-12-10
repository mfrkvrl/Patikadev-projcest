import java.util.Scanner;

public class tekSayiToplam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0,value;
        boolean check=true;
        while(check){
            System.out.println("Enter your value : ");
            value=scanner.nextInt();
            if(value%2!=0){
                check=false;
            }
            else{
                if(value%2==0&&value%4==0){
                    sum+=value;
                }
            }
        }
        System.out.println("sum of the numbers "+sum);
    }
}
