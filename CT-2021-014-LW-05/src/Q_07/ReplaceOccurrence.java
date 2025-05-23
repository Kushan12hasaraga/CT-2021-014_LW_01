package Q_07;

import java.util.Scanner;

public class ReplaceOccurrence {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String toChange = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replace = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        int i=0;
        while (i< words.length){
            if (words[i].equals(toChange)){
                result.append(replace);
            }else{
                result.append(words[i]);
            }
            if (i< words.length - 1){
                result.append(" ");
            }
            i++;
        }
        System.out.println("Updated sentence: "+ result.toString());
    }
}
