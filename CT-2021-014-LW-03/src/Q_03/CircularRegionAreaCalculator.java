package Q_03;
import java.util.Scanner;
public class CircularRegionAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the outer and inner radii from the user
        System.out.print("Enter the radius of the outer circle : ");
        double ro = scanner.nextDouble();
        System.out.print("Enter the radius of the inner circle : ");
        double ri = scanner.nextDouble();

        // Ensure outer radius is greater than inner radius
        if (ro <= ri) {
            System.out.println("Error: Outer radius must be greater than inner radius.");
        } else {
            Circle outerCircle = new Circle(ro);
            Circle innerCircle = new Circle(ri);

            // Compute the shaded area
            double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

            // Display the result
            System.out.printf("The area of the circular region is: %.2f\n", shadedArea);
        }

        scanner.close();
    }
}
