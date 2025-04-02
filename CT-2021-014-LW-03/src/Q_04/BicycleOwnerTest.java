package Q_04;

public class BicycleOwnerTest {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        bike1.setOwner("Bhanuka","0760772649");

        System.out.println("Bike 1 owner: "+ bike1.getOwner().getOwnerName());
        System.out.println("Bike 1 owner Phone No: "+ bike1.getOwner().getPhoneNo());
    }
}
