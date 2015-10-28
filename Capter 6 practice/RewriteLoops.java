import java.util.Scanner;

public class RewriteLoops
{
    public static void firstLoop()
    {
        int i = 1;
        int s = 0;
        
        while (i <= 10)
        {
            s += i;
            i++;
        }
        
        System.out.println(s);
    }
    
    public static void secondLoop()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        
        int n = s.nextInt();
        double x = 0;
        double a = 1;
        
        while (a > 0.01)
        {
            a = 1.0 / (1 + n * n);
            n++;
            x += a;
        }
        
        System.out.println(x);
    }
}
            