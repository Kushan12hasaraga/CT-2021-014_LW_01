package Q_05;

import java.util.Scanner;

public class MyJavaLoFatBurgers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entree;
        double entreePrice;

        String side;
        double sidePrice;

        String drink;
        double drinkPrice;

        System.out.println("Entree Menu:");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");
        System.out.print("Select an entree (1-4): ");
        int entreeChoice = scanner.nextInt();

        if (entreeChoice == 1) {
            entree = "Tofu Burger";
            entreePrice = 3.49;
        } else if (entreeChoice == 2) {
            entree = "Cajun Chicken";
            entreePrice = 4.59;
        } else if (entreeChoice == 3) {
            entree = "Buffalo Wings";
            entreePrice = 3.99;
        } else if (entreeChoice == 4) {
            entree = "Rainbow Fillet";
            entreePrice = 2.99;
        } else {
            System.out.println("Invalid entree choice.");
            return;
        }

        System.out.println("\nSide Dish Menu:");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");
        System.out.print("Select a side dish (1-4): ");
        int sideChoice = scanner.nextInt();

        if (sideChoice == 1) {
            side = "Rice Cracker";
            sidePrice = 0.79;
        } else if (sideChoice == 2) {
            side = "No-Salt Fries";
            sidePrice = 0.69;
        } else if (sideChoice == 3) {
            side = "Zucchini";
            sidePrice = 1.09;
        } else if (sideChoice == 4) {
            side = "Brown Rice";
            sidePrice = 0.59;
        } else {
            System.out.println("Invalid side dish choice.");
            return;
        }

        System.out.println("\nDrink Menu:");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");
        System.out.print("Select a drink (1-4): ");
        int drinkChoice = scanner.nextInt();

        if (drinkChoice == 1) {
            drink = "Cafe Mocha";
            drinkPrice = 1.99;
        } else if (drinkChoice == 2) {
            drink = "Cafe Latte";
            drinkPrice = 1.90;
        } else if (drinkChoice == 3) {
            drink = "Espresso";
            drinkPrice = 2.49;
        } else if (drinkChoice == 4) {
            drink = "Oolong Tea";
            drinkPrice = 0.99;
        } else {
            System.out.println("Invalid drink choice.");
            return;
        }

        double total = entreePrice + sidePrice + drinkPrice;
        System.out.println("\nOrder Summary:");
        System.out.println("Entree: " + entree + " - $" + entreePrice);
        System.out.println("Side: " + side + " - $" + sidePrice);
        System.out.println("Drink: " + drink + " - $" + drinkPrice);
        System.out.printf("Total Price: $%.2f\n", total);

        scanner.close();
    }
}