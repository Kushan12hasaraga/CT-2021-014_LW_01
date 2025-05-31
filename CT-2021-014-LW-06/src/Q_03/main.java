package Q_03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pet[] pets = new pet[100];
        int count = 0;

        while (true){
            System.out.print("Enter pet name (STOP to end): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.print("Enter Pet Category (c or d): ");
            String type = scanner.nextLine();

            pet pet;
            if (type.equals("c")){
                pet = new cat();
            } else if (type.equals("d")) {
                pet = new dog();
            }else {
                System.out.println("Invalid type!! Use 'c' or 'd'");
                continue;
            }
            pet.setName(name);
            pets[count] = pet;
            count++;
        }
        System.out.println("\nPet List: ");

        System.out.println("Cats: ");
        for (int i =0; i< count;i++){
            if (pets[i] instanceof cat){
                System.out.println("-- "+ pets[i].getName());
            }
        }
        System.out.println("Dogs: ");
        for (int i = 0;i<count; i++){
            if (pets[i] instanceof dog){
                System.out.println("-- "+pets[i].getName());
            }
        }
    }
}
