import java.util.Scanner;
public class NaturalPerfecto{
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        int suma, numero, count;
        System.out.println("Dame un número:");
        numero=kb.nextInt();
        for(count=0; count<=numero; count++){
            if(numbero%count==0){
                suma+=count;
            }
        }
        if(suma==numero){
            System.out.println("El número natural " + numero + " es perfecto.");
        }
        else
        System.out.println("El número " + numero + " no es natural perfecto.");
    }
}
