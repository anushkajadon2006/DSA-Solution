import java.util.*;

public class reversearr {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Array input
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Reverse print
        for(int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
