import java.util.Scanner;

public class FindMaxAndMin
{
    public static double findMax()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter series of numbers or any character to quit: ");
        
        double largest = s.nextDouble();
        
        while (s.hasNextDouble())
        {
            double input = s.nextDouble();
            if(input > largest)
            {
                largest = input;
            }
        }
        return largest;
    }
}