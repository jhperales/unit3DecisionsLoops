public class StringCompare
{
    public static void main(String [] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") > 0)
        {
            System.out.println("word 1 is greater than aaa");
        }
        else
        {
            System.out.println("word 1 is not greater than aaa");
        }
        
        if (word1.compareTo(word2) = 0)
        {
            System.out.println("word 1 and word 2 equals each other");
        }
        else
        {
            System.out.println("word 1 and word 2 do not equal each other");
        }
        
        if (word1.comepareTo(word2) < 0)
        {
            System.out.println("word 1 is less than word 2");
        }
        else
        {
            System.out.println("word 1 is not less than word 2");
        }
        
    }
}
            