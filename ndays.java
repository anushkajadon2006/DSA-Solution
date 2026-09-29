 import java.util.*;

public class ndays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= N; i++) {

            int dailysolved = sc.nextInt();

            if (dailysolved >= 10 && dailysolved % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
