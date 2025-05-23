package Q_05;
import java.util.Scanner;
public class PlaindromeNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter word or phrase: ");
        String input = scanner.nextLine();

        int start = 0;
        int end = input.length()-1;
        boolean chkplnd = true;

        while (start<end){
            if (input.charAt(start) != input.charAt(end)){
                chkplnd = false;
                break;
            }else {
                chkplnd = true;
            }
            start++;
            end--;
        }
        if (chkplnd == true){
            System.out.println(input+" is palindrome.");
        }else{
            System.out.println(input+" is not paalindrome!!");
        }
    }
}
