package exercises;

import java.util.HashMap;
import java.util.Map;

public class Studio3 {
    public static void main (String[] args) {
        String phrase = "If the product of two terms is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. So if you move all the terms over " +
                "to one side, you can put the quadratics into a form that can be factored allowing " +
                "that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";

        int count = 0;
        char[] charactersInString = phrase.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++) {
            System.out.println(charactersInString[i]);
            hashMap.put(charactersInString[i], count);
                if (hashMap.containsKey(charactersInString[i])) {
                    for (Map.Entry<Character, Integer> key : hashMap.entrySet()) {
                        count = key.getValue();
                    }
                    count += 1;
                    hashMap.put(charactersInString[i], count);
                    count = 0;
                }
        }
        System.out.println(hashMap);
    }
}
