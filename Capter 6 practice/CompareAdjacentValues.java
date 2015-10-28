import java.util.Scanner;

public class CompareAdjacentValues
{
    public static void detectAdjacentDuplicates()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter series of numbers and character to quit: ");
        
        double input = s.nextDouble();
        
        while (s.hasNextDouble())
        {
            double previous_input = input;
            input = s.nextDouble();
            if (previous_input == input)
            {
                System.out.println("WARNING! ADJACENT DOUPLICATE DETECTED");
            }
        }
        
        
    }
}