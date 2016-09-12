public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, r;
        double seconds, e, checking, weight;
        String firstName, lastName, title, organization, program;
        
        x = 10;
        y = 400;
        age = 39;
        r= 3;
        
        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        weight= 10.01;
        
        firstName = "Sarah";
        lastName = "Passantino";
        title = "Ms.";
        organization = "Skill Distillery";
        program= "Java";
        
        System.out.println( "The variable x contains " + x );
        System.out.println( "The value  " + y + " is stored in the variable y." );
        System.out.println( + r + " is the value of variable r " );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( "I am a student at " + organization + " receiving an education in " + program );
        System.out.println( "I was born weighing " + weight + "." );
    }
}