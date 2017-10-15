import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Body Mass in pound");
        double weight = in.nextDouble();

        System.out.println("Enter Height in Inches");
        double height = in.nextDouble();

        final double kilo_grams_per_pound = 0.45359237;
        final double meter_per_inches = 0.0254;

        double weight_kilo = weight * kilo_grams_per_pound;
        double height_meter = height * meter_per_inches;

        double bmi = weight_kilo / (height_meter*height_meter);

        System.out.println(bmi);

    }
}
