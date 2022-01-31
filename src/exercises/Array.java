package exercises;

public class Array {
    public static void main (String[] args) {
        int numArr[] = {1, 1, 2, 3, 5, 8};

        for (int i : numArr) {
            if (numArr[i] % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
