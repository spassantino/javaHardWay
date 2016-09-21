    import java.util.Scanner;

    public class BMICategories {
        public static void main( String[] args ) {
            Scanner keyboard = new Scanner(System.in);
            double bmi, ft, inches, height, lbs;

            System.out.print( "Your height in (feet only): " );
            ft = keyboard.nextDouble();
        
            System.out.print( "Your height in (inches): " );
            inches = keyboard.nextDouble();
        
            System.out.print( "Your weight in lbs: " );
            lbs = keyboard.nextDouble();
        
            height= ft*12+inches;
            bmi = lbs/(height*height)*703 ;
        
            System.out.println( "Your BMI is " + bmi );
            
            System.out.print( "Enter your BMI: " );
            bmi = keyboard.nextDouble();

            System.out.print( "BMI category: ");
            if ( bmi < 15.0 ) {
                System.out.println( "very severly underweight" );
            }
            else if ( bmi <= 16.0 ) {
                System.out.println( "severly underweight" );
            }
            else if ( bmi < 18.5 ) {
                System.out.println( "underweight" );
            }
            if ( bmi < 25.0 ) {
                System.out.println( "normal weight" );
            }
            else if ( bmi < 30.0 ) {
                System.out.println( "overweight" );
            }
            else if ( bmi < 35.0 ) {
                System.out.println( "moderately obese" );
            }
            else if ( bmi < 40.0 ) {
                System.out.println( "severely obese" );
            }
            else {
                System.out.println( "very severely/\"morbidly\" obese" );
            }
        }
    }   
