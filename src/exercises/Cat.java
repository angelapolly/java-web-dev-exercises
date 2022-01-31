package exercises;

import java.util.Arrays;

public class Cat {
    public static void main(String[] args) {
        String catInTheHat = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] catWords = catInTheHat.split("\\.");

        System.out.println(Arrays.toString(catWords));
    }
}
