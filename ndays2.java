import java.util.*;
public class ndays2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =0;
        int previous = sc.nextInt();

        for(int i = 2;i<N;i++){
            int current = sc.nextInt();
            if(current-previous>=3){
                count++;
            }
            previous = current;
        }
        System.out.println(count);
    }
}
