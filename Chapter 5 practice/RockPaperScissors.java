import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Player1, pick rock, paper or scissors: ");
        String player1 = s.next().toLowerCase();
        System.out.println("Player2, pick rock, paper or scissors: ");
        String player2 = s.next().toLowerCase();
        
        if ((player1.equals("rock") && (player2.equals("rock")) || 
           ((player1.equals("paper") && (player2.equals("paper")) || 
           ((player1.equals("scissors") && (player2.equals("scissors")))))))) 
        {
            System.out.println("tis a tie");
        }
        else if ((player1.equals("rock") && (player2.equals("paper")) ||    
                ((player1.equals("paper") && (player2.equals("scissors")) || 
                ((player1.equals("scissors") && (player2.equals("rock")))))))) 
        {
            System.out.println("Player2 wins");
        }
        else if ((player1.equals("rock") && (player2.equals("scissors")) || 
                ((player1.equals("paper") && (player2.equals("rock")) || 
                ((player1.equals("scissors") && (player2.equals("paper")))))))) 
        {
            System.out.println("Player1 wins");
        }
    }
}
        