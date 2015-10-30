import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        
        String word = s.next();
        
        int x = 0;
        int y = 1;
        
        for (int i = 0;
             i < word.length();
             i++)
             {
                 System.out.println(word.substring(x, y));
                 x++;
                 y++;
             }
        
        System.out.println(word.substring(0, 2));
        System.out.println(word.substring(word.length() - 2, word.length()));
        System.out.println(word);
    }
}
    