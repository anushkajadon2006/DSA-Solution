import java.util.*;
public class vasya{
    public static void main (String args[]){
        int n = sc.nextInt();
        
        int xsum = 0;
        int ysum = 0;
        int zsum = 0;

        for(i=1;i<=n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            xsum = xsum + x;
            ysum = ysum+y;
            zsum = zsum + z;

        }

        if (xsum==0&&ysum==0&&zsum==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}