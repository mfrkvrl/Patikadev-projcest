import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("Enter the value : ");
            int n = scanner.nextInt();
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

            }
            System.out.println(fact);

        }

    }
}