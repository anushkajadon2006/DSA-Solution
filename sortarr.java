import java.util.*;
public class sortarr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }   

        Array.sort(arr);
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Second largest element:"+arr[n-2]);


    }
}