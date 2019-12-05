import java.util.Date;    //importing required for date()
import java.util.Scanner;   //system input 

public class Main{

    public static void main(String[] args){    //main funtion with void
        byte age = 20;                    //primitive data types
        System.out.println(age);

        Date now = new Date();           //reference
        System.out.println(now);

        System.out.println("sandesh khadka ");  //printfunction

        String message = "  hello world" +"!!  ";     //concatenation
        System.out.println(message);

        String messageA = "hello ";

        System.out.println(message.startsWith("hello"));  //check //returns boolean value
        System.out.println(messageA.endsWith("world"));

        System.out.println(messageA.length());      //returns length of string
        System.out.println(message.length());

        System.out.println(message.replace("hello", "Hello"));  //replaces hello with Hello


        System.out.println(message);  //main string data isnt changed

        System.out.println(message.toUpperCase());

        System.out.println(message.trim());  //trims the white spaces 

        String msg = "hello sandesh";
        System.out.println(msg);

        float pi = 3.14F ;     //consants
        final float PI = 3.1415F;    //assigning  final to the constants ,later cant  change value
        
        int result = 3+4;      //arithmetic
        int result1 = 10/3;
        System.out.println(result);
        System.out.println(result1);

        int x = 1;
        int y = x++;     //increment operator
        System.out.println(x);
        System.out.println(y);

        short b = 1;  //implicit casting ,  automatic casting 
        int a = b+2;      // byte>short>int>long>float>double
        double c =3.1;       //explicit casting
        int d = (int)c + 3;
        System.out.println(a);
        System.out.println(d);


        Scanner scanner = new Scanner(System.in);  //input form system ,terminal
        System.out.print("AGE:");
        byte myAge = scanner.nextByte();
        System.out.println("my age is" + myAge);
    }
}