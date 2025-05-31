package Q_01;

public class main {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.setName("Shane");
        System.out.println(dog.getName()+" say "+dog.speak());

        cat cat = new cat();
        cat.setName("Garfield");
        System.out.println(cat.getName()+" says "+cat.speak());
    }
}
