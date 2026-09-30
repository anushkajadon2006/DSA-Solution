import java.util.*;

public class movezeroes {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int[] newArr = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                newArr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
