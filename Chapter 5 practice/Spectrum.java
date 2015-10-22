import java.util.Scanner;

public class Spectrum
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a wavelength in scientific notation/epsilon value ((Ex: 1e-12)): ");
        double wavelength = s.nextDouble();
        
        if (wavelength < 1e-11)
        {
            System.out.println("Type: Gamma Rays\n Frequency = > 3e19");
        }
        else if (wavelength < 1e-8)
        {
            System.out.println("Type: X-Rays\n Frequency = 3e16 to 3e19");
        }
        else if (wavelength < 4e-7)
        {
            System.out.println("Type: Ultraviolet\n Frequency = 7.5e14 to 3e16");
        }
        else if (wavelength < 7e-7)
        {
            System.out.println("Type: Visible Light\n Frequency = 4e14 to 7.5e14");
        }
        else if (wavelength < 1e-3)
        {
            System.out.println("Type: Infrared\n Frequency = 3e11 to 4e14");
        }
        else if (wavelength < 1e-1)
        {
            System.out.println("Type: Microwaves\n Frequency = 3e9 to 3e11");
        }
        else if (wavelength > 1e-1)
        {
            System.out.println("Type: Radio Waves\n Frequency = less than 3e9");
        }
        else
        {
            System.out.println("Unable to determain");
        }
    }
}
