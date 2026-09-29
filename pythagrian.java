import java.util.*;
public class pythagrian {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if((a*a + b*b == c*c)||(c*c+b*b==a*a)||(a*a+c*c==b*b)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
