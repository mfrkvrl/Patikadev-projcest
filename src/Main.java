import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double deger1,deger2,deger3;
        System.out.println("Sıralamak istediğiniz 3 değeri giriniz : ");
        deger1=scanner.nextDouble();
        deger2=scanner.nextDouble();
        deger3=scanner.nextDouble();

        if(deger1>deger2){
            if(deger1>deger3){
                if(deger2>deger3){
                    System.out.println(" "+deger1+" "+deger2+" "+deger3);
                }
                else{
                    System.out.println(" "+deger1+" "+deger3+" "+deger2);
                }
            }
            else {
                System.out.println(" "+deger3+" "+deger1+" "+deger2);
            }
        }
        else{
            if(deger2>deger3){
                if (deger1>deger3){
                    System.out.println(" "+deger2+" "+deger1+" "+deger3);
                }
                else{
                    System.out.println(" "+deger2+" "+deger3+" "+deger1);
                }
            }
            else{
                System.out.println(" "+deger3+" "+" "+deger2+" "+deger1);
            }
        }
    }
}
