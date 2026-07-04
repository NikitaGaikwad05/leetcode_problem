//this optimal solution to find the largest element in the array
import java.util.*;
class Main {
    public static int sort(int[] arr,int n){
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
        }
        }
        return largest;
    }
    public static void main(String args[]){
       int arr[]={3,3,9,5};
        int n=arr.length;
       int  largest=Main.sort(arr,n);
        System.out.println(largest);
        
    }
}
