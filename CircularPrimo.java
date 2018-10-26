/*
    Alfredo Palacios Olagaray
    Programa que te dice si un número es primo circular o no
*/
import java.util.Scanner;
public class CircularPrimo{

    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        int readNumber, circularNumber;
        int power, num;//for number of digits
        boolean allPrime=true, keepOn=true;
        System.out.println("Enter a number.");
        readNumber=kb.nextInt();
        circularNumber=readNumber;

        //calculating number of number of digits
        num=readNumber;
        power=0;
        while(num>0){
            power++;
            num/=10;
        }//gets the number of digits

        do{
            System.out.println("\n" + circularNumber);
            if(isPrime(readNumber)==false){
                allPrime=false;
                break;
            }
            circularNumber=circulateTheNumber(circularNumber, power);
            allPrime=isPrime(readNumber);
            if(!allPrime){
                keepOn=false;
            }
        }//end of do
        while(circularNumber!=readNumber);
        if(!allPrime){
            keepOn=false;
        }
        if(keepOn){
            System.out.println("The number " + readNumber + " is a circular prime.");
        }
        else if(!keepOn){
            System.out.println("The number " + readNumber + " isn't a circular prime.");
        }

    }//end of main method
    public static boolean isPrime(int temp){
        int counter, div2, control=0;
        div2=temp/2;
        boolean isPrimeOrNot=false;
        for(counter=2; counter<=div2; counter++){
			if(temp%counter==0){
				isPrimeOrNot=false;
                control=1;
                break;
			}
        }//end of for
        if(control==0){
            isPrimeOrNot=true;
        }
        return isPrimeOrNot;
    }//end of isPrime
    public static int circulateTheNumber(int temp2, int power){

        int divisor, residuo, newNumber;
        newNumber=temp2;
        residuo=temp2%10;
        divisor=temp2/10;
        newNumber=(int)(Math.pow(10, power-1)*residuo)+divisor;
        System.out.println(newNumber);
        return newNumber;

    }//here ends circulateTheNumber
}
