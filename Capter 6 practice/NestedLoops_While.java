public class NestedLoops_While
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 1;
        while (x < 3)
        {
            while (y < 5)
            {
                System.out.println(x + " " + y);
                y++;
            }
            x++;
            y = 1;
        }
    }
}