import java.util.Scanner;
public class NaturalPerfecto{
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        int suma=0, numero, count;
        System.out.println("Dame un número:");
        numero=kb.nextInt();
        for(count=1; count<numero; count++){
            if(numero%count==0){
                suma+=count;
                //System.out.println(suma);
            }
        }
        if(suma==numero){
            System.out.println("El número natural " + numero + " es perfecto.");
        }
        else
        System.out.println("El número " + numero + " no es natural perfecto.");
    }
}
