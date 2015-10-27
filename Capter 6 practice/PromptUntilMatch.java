import java.util.Scanner;

public class PromptUntilMatch
{
    public static double promptUntilMatch()
    {
        Scanner s = new Scanner(System.in);
        boolean valid = false;
        double input;
        
        do
        {
            System.out.println("Enter a postive value less than 100: ");
            input = s.nextDouble();
            if (input > 0 && input < 100)
            {
                valid = true;
            }
        }
        while (!valid);
        
        return input;
    }
}