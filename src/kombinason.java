import java.util.Scanner;

public class kombinason {
    public static void main(String[] args) {
        System.out.println("Enter the numbers you want to find the combination of ");
        Scanner scanner=new Scanner(System.in);
        int n=0,r=0,m=0,k=0;
        double komb;
        int fakt1=0,fakt2=0,fakt3=0;
        boolean check1=true,check2 = true,check3=true;
        while (check1) {
            System.out.println("Enter the first value n : ");
            n = scanner.nextInt();
            m=n;
            int fact=0;
            if(n==0){
                fact=1;
            }
            else if(n<0){
                System.out.println("You can't enter a negative value!");
            }
            else{
                fact=n;
                for (;n > 1; n--) {
                    fact *= (n - 1);

                }
                check1=false;
            }
            fakt1=fact;

        }

        while (check2) {
            System.out.println("Enter the second value r : ");
            r = scanner.nextInt();
            k=r;
            int fact=0;
            if(r==0){
                fact=1;
            }
            else if(r<0){
                System.out.println("You can't enter a negative value!");
            }
            else if(k>m){
                System.out.println("n can not be less than r");
                break;
            }
            else{
                fact=r;
                for (;r > 1; r--) {
                    fact *= (r - 1);

                }
                check2=false;
            }
            fakt2=fact;
        }
        int t=m-k;
        while (check3) {
            int fact=1;
            if(t==0){
                fact=1;
            }
            else{
                fact=t;
                for (;t > 1; t--) {
                    fact *= (t - 1);
                }
                check3=false;
            }
            fakt3=fact;
        }
    komb=fakt1/(fakt2*fakt3);
        System.out.println(komb);
    }
}
