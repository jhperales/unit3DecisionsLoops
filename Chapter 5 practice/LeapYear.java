import java.util.Scanner;

public class LeapYear
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year number: ");
        int year = s.nextInt();
        
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear)
        {
            Sysprintln(year + " is a leap year.");
        } 
        else
        {
            println(year + " is not a leap year.");
        }
    }
}