import java.util.Scanner;

public class RudeQuestions {
    public static void main( String [] args ) {
        String name, dominant;
        int age;
        double weight, income;
    
        Scanner keyboard = new Scanner(System.in);
    
        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();
        
        System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();
    
        System.out.println( "So you're " + age + ", eh? That's not very old." );
        System.out.print( "How much do you weigh, " + name + "? " );
        weight = keyboard.nextDouble();
    
        System.out.println( weight + "! Better keep that quiet!!" );
        System.out.print("Finally, what's your income, " + name + "?" );
        income = keyboard.nextDouble();   
    
        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!" );
        
        System.out.print( "Which is your dominant hand?" );
        dominant = keyboard.next();
        
        System.out.println( "So you throw with your " + dominant + " hand? " );
        System.out.println( "Me, too. " );
        
        System.out.print( "Well, thanks for answering my rude questions. " );
        System.out.println( name + "." );
        //The program does not blow up from typing an integer when expecting a double because integers can also be doubles.;
        //The program does not blow up from typing a numeric value when expecting a String because numbers may also be Strings.;
        //I blew up the program on every question for answering with Trend Setter.;
    }
}
