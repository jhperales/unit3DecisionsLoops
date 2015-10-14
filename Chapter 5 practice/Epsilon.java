import java.util.Scanner;

public class Epsilon
{
    public static final double EPSILON = 1e-12;
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double num = s.nextDouble();
        
        String adj = "";
        
        if (Math.abs(num) < 1.0)
        {
            adj = "small";
        }
        else if(Math.abs(num) > 1000000)
        {
            adj = "large";
        }
        
        if (Math.abs(num - 0) < EPSILON)
        {
            System.out.println("Its zero");
        }
        else if(num > 0)
        {
            System.out.println("Its a " + adj + " positive number");
        }
        else
        {
            System.out.println("Its a negative number");
        }
    }
}
        
        