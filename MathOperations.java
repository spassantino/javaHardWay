public class MathOperations {
    public static void main( String[] args ) {
        int a, b, c, d, e, f, g, h, i;
        double x, y, z;
        String one, two, both;
        
        a=10;
        b=27;
        System.out.println( "a is " + a + ", b is " + b );
        
        c = a + b;
        System.out.println( "a+b is " + c );
        d = a - b;
        System.out.println( "a-b is " + d);
        e = a+b*3;
        System.out.println( "a+b*3 is " + e );
        f = b / 2;
        System.out.println( "b/2 is " + f );
        g = b % 10;
        System.out.println( "b%10 is " + g );
        
        x = 1.1;
        System.out.println( "\nx is " + x );
        y = x*x;
        System.out.println( "x*x is " + y );
        z = b / 2;
        System.out.println( "b/2 is " + z );
        System.out.println();
        
        h=20;
        i=2;
        System.out.println( "h is " + h + ", i is " + i );       
        
        h = a*i;
        System.out.println( "a*i is " + h );
        b= h + g;
        System.out.println( "h+g is " + b );
        g= h - f;
        System.out.println( "h-f is " + g );
        i = h/a;
        System.out.println( "h/a is " + i );
        a= h%2;
        System.out.println( "h%2 is " + a );
        
        
        one = "dog";
        two = "house";
        both = one + two;
        System.out.println( both );
        

    }
}