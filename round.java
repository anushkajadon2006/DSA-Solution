import java.util.*;
public class round{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0 ;
        int temp = n;
        int place = 0;
        while(n>0){
            int digits = n%10;
            if(digits != 0){
                count++;
            n=n/10;
            }
            place = place*10;
        }
        System.out.println(count);
        place = 1;

        while(temp>0){
            int digit = n%10;
            if(digit!=0){
                System.out.println(place*digit);
            }
            temp = temp/10;
            place = place * 10;
        }

    }
}