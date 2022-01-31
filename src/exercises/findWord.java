package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class findWord {
    public static <integer> void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter word length: ");
        int wordLength = input.nextInt();
        input.close();

        ArrayList<String> words = new ArrayList<>();
        words.add("orange");
        words.add("apple");
        words.add("lemon");
        words.add("mango");
        words.add("fig");
        words.add("persimmon");

        System.out.println(words);

        for (String word : words) {
            if (wordLength == word.length()) {
                System.out.println(word);
            }
        }
    }
}
