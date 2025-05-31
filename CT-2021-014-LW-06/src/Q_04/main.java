package Q_04;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pet[] pets = new pet[100];
        int count = 0;

        while (true) {
            System.out.print("Enter pet name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }
            System.out.print("Enter pet type (c or d):");
            String type = scanner.nextLine().toLowerCase();

            pet pet;
            if (type.equals("c")) {
                cat cat = new cat();
                System.out.print("Enter Coat Color:");
                String color = scanner.nextLine();
                cat.setCoatColor(color);
                pet = cat;
            } else if (type.equals("d")) {
                dog dog = new dog();
                System.out.print("Enter weight: ");
                double weight = Double.parseDouble(scanner.nextLine());
                dog.setWeight(weight);
                pet = dog;
            } else {
                System.out.println("Invalid type!! Enter c or d:");
                continue;
            }
            pet.setName(name);
            pets[count] = pet;
            count++;
        }
        System.out.println("\nPet List (Grouped by Type):");

        // Cats first
        System.out.println("Cats:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof cat) {
                cat cat = (cat) pets[i];
                System.out.println("- Name: " + cat.getName() + ", Type: Cat, Coat Color: " + cat.getCoatColor());
            }
        }

        // Dogs next
        System.out.println("Dogs:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof dog) {
                dog dog = (dog) pets[i];
                System.out.println("- Name: " + dog.getName() + ", Type: Dog, Weight: " + dog.getWeight() + " kg");
            }


        }
    }
}
