import java.util.Scanner;

public class Spectrum
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a wavelength in scientific notation/epsilon value ((Ex: 1e-12)): ");
        double wavelength = s.nextDouble();
        
        if (wavelength > 1e-1)
        {
            System.out.println("The type of wave is Radio Waves");
        }
    }
}
