package Q_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<pet> petList = new ArrayList<>();
        ArrayList<cat> catList = new ArrayList<>();
        ArrayList<dog> dogList = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Pet Menu ---");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter cat name: ");
                    String catName = scanner.nextLine();
                    if (petExists(petList, catName)) {
                        System.out.println("A pet with that name already exists.");
                        break;
                    }
                    System.out.print("Enter coat color: ");
                    String coatColor = scanner.nextLine();

                    cat cat = new cat();
                    cat.setName(catName);
                    cat.setCoatColor(coatColor);

                    petList.add(cat);
                    catList.add(cat);

                    System.out.println("Cat added.");
                    break;
                case "2":
                    System.out.print("Enter dog name: ");
                    String dogName = scanner.nextLine();
                    if (petExists(petList, dogName)) {
                        System.out.println("A pet with that name already exists.");
                        break;
                    }
                    System.out.print("Enter weight (kg): ");
                    double weight = Double.parseDouble(scanner.nextLine());
                    dog dog = new dog();
                    dog.setName(dogName);
                    dog.setWeight(weight);

                    petList.add(dog);
                    dogList.add(dog);

                    System.out.println("Dog added.");
                    break;
                case "3":
                    System.out.print("Enter cat name to remove: ");
                    String removeCatName = scanner.nextLine();
                    removePetByName(removeCatName, petList, catList);
                    break;
                case "4":
                    System.out.print("Enter dog name to remove: ");
                    String removeDogName = scanner.nextLine();
                    removePetByName(removeDogName, petList, dogList);
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static boolean petExists(ArrayList<pet> petList, String catName) {
        for (pet p : petList) {
            if (p.getName().equalsIgnoreCase(catName)) {
                return true;
            }
        }
        return false;
    }

    private static void removePetByName(String name, ArrayList<pet> petList, ArrayList<? extends pet> typeList) {
        boolean found = false;

        // Remove from main list
        Iterator<pet> petIter = petList.iterator();
        while (petIter.hasNext()) {
            if (petIter.next().getName().equalsIgnoreCase(name)) {
                petIter.remove();
                found = true;
                break;
            }
        }
    }
}




