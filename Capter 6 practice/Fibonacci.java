import java.util.Scanner;

public class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        s.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        int fnew = fold1 + fold2;
        int counter = 0;
        
        while (counter < 50)
        {
            System.out.println(fold1);
            System.out.println(fold2);
            System.out.println(fnew);
            
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;
        }
    }
}
        