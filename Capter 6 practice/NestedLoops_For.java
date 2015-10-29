public class NestedLoops_For
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 1;
        
    for (int i = 0;
         i < 2;
         i++)
         {
             for (int f = 0;
                  f < 4;
                  f++)
                  {
                      System.out.println(x + " " + y);
                      y++;
                  }
             x++;
             y = 1;
            }
        }
    }