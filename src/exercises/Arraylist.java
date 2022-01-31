package exercises;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList.add(10);

        int sum = 0;
        for (int num : numList) {
            if (num % 2 == 0){
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}
