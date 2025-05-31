package Q_05;
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
        dog[] dogArray = new dog[count];
        int dogCount = 0;

        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof dog) {
                dogArray[dogCount] = (dog) pets[i];
                dogCount++;
            }
        }

        dog[] actualDogs = new dog[dogCount];
        System.arraycopy(dogArray, 0, actualDogs, 0, dogCount);

        if (dogCount > 0) {
            double totalWeight = 0;
            double minWeight = actualDogs[0].getWeight();
            double maxWeight = actualDogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {
                double w = actualDogs[i].getWeight();
                totalWeight += w;

                if (w < minWeight) {
                    minWeight = w;
                }
                if (w > maxWeight) {
                    maxWeight = w;
                }
            }
            double averageWeight = totalWeight / dogCount;

            System.out.println("\nDog Weight Statistics:");
            System.out.printf("Average Weight: %.2f kg\n", averageWeight);
            System.out.printf("Minimum Weight: %.2f kg\n", minWeight);
            System.out.printf("Maximum Weight: %.2f kg\n", maxWeight);
        } else {
            System.out.println("\nNo dogs were entered, so no weight statistics available.");
        }

    }
}
