import java.util.Scanner;

public class dortbeskat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Enter a  value : ");
        number=scanner.nextInt();
        for(int i=1,j=1;i<number&&j<number;i*=4,j*=5)
                System.out.println(i+" "+j);
        }
    }

