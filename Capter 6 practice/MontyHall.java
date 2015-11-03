import java.util.Random;

public class MontyHall
{
    public static void main(String [] args)
    {
        Random random = new Random();
        
        boolean same = true;
        int player;
        int goat_1;
        int goat_2;
        int car;
        int host;
        
        while (same != false)
        {
            player = random.nextInt(3) + 1;
            goat_1 = random.nextInt(3) + 1;
            goat_2 = random.nextInt(3) + 1;
            car = random.nextInt(3) + 1;
            host = random.nextInt(3) + 1;
        
            if (player != host)
            {
                same = false;
                break;
            }
            
        }
        
        System.out.println("player pick = " + player);
        System.out.println("goat 1 = " + goat_1);
        System.out.println("goat 2 = " + goat_2);
        System.out.println("car = " + car);
        System.out.println("host pick = " + host);
    }
}
        