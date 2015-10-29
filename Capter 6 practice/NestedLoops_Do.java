public class NestedLoops_Do
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 1;
        
        do
        {
            do
            {
                System.out.println(x + " " + y);
                y++;
            }
            while (x < 2);
            
            x++;
            y = 1;
        }
        while (y < 4);
    }
}