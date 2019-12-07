import java.text.NumberFormat;   //used to implement number format
import java.util.Scanner;       //scans the input value 

public class Main{

    public static void main(String[] args){
        System.out.println("SIMPLE CALCULATOR");
        
        final byte MONTHS_IN_YEAR = 12;                //final value for which remains const
        final byte PERCENT = 100;  
        int principal = 0;
        float monthlyInterest = 0;  
        int numberOfPayments = 0;     
        
        //assigning variables 

        Scanner scanner = new Scanner(System.in);             //scanner system  input
        
         while(true){
        System.out.print("Principal:");
        principal = scanner.nextInt(); 
         if(principal>=1000&&principal<=1000000)            //validation
           break;                                          //input integer 
        System.out.println("Enter a value in between 1K and 1M");  
        }



         while(true){
        System.out.println("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();                         //input float
         if(annualInterest>=1 && annualInterest<=30){           //validation
        monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;     
         break;}
        System.out.println("Enter a value between 1 and 30");

        }

         while(true){
        System.out.println("Period(Years):");
        byte years = scanner.nextByte(); 
         if(years>=1 && years<=30){                                     //validation /input byte ie years
        numberOfPayments = years * MONTHS_IN_YEAR;
         break;}
        System.out.println("Enter a value in between 1 and 30");
         }



           //calculation for mortage
        double mortgage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/(Math.pow(1+monthlyInterest,numberOfPayments)-1);

           //number format currency 
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);
    }
}