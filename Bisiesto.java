import java.util.Scanner;
public class Bisiesto{
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        int year;
        System.out.println("Pon un año:");
        year=kb.nextInt();
        if(year%400==0){
            System.out.println("Es un año bisiesto.");
        }
        else if((year%4==0)&&(year%100!=0)){
            System.out.println("Es un año bisiesto.");
        }
        else
        System.out.println("No es un año bisiesto.");
    }
}
