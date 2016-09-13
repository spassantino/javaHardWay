import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double inches, lbs, bmi, ft, height;
        
        System.out.print( "Your height in (feet only): " );
        ft = keyboard.nextDouble();
        
        System.out.print( "Your height in (inches): " );
        inches = keyboard.nextDouble();
        
        System.out.print( "Your weight in lbs: " );
        lbs = keyboard.nextDouble();
        
        height= ft*12+inches;
        bmi = lbs/(height*height)*703 ;
        
        System.out.println( "Your BMI is " + bmi );
    }
}    