package Q_04;
public class Bicycle {
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner("Unknown","Unknown");
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(String name,String phoneNo) {
        owner.setOwnerName(name);
        owner.setPhoneNo(phoneNo);
    }
}
