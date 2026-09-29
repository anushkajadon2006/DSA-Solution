
import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int count = 0;
        
        while(n>0){
            int digits = n%10;
            sum = sum + digits;
            n = n/ 10;
        }
        System.out.println(sum);

        for(int i = 2;i<original;i++){
            if(original%i==0){
                count++;
            }

        }
        if(original==1){
            System.out.println("it is neither prime nor composite");
        }
        else if(count>0){
            System.out.println("composite");
        }
        else{
            System.out.println("prime");
        }
        sc.close();
       }

    }


