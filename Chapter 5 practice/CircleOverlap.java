import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = s.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = s.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;

      if (radius1 + radius2 < 40)
      {
          System.out.println("Disjoint");
      }
      else if (radius1 + xcenter1 >= radius2 + xcenter2)
      {
          System.out.println("Mutually Contained");
      }
      else if (radius1 + radius2 == 40)
      {
          System.out.println("Tangent");
      }
      else
      {
          System.out.println("Overlapping");
      }
    }
}
        