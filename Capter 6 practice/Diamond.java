import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        int input = s.nextInt();
        
        String derp = "         *";
        
        for (int i = 0;
             i < input*2;
             i++)
             {
                 System.out.println(derp);
                 derp += "**";
             }
    }
}
                 