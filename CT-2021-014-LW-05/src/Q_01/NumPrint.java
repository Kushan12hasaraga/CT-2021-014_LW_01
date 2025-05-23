package Q_01;

public class NumPrint {
    public static void main(String[] args) {
        for (int i = 10; i < 50; i++){
            System.out.print(i+" ");
            if ((i-9) % 10 == 0){
                System.out.println();
            }
        }
    }
}
