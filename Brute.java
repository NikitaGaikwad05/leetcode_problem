//To find the largest element in Array using Brute Force solution 
//TimeComplexity: O(N log N)
//SpaceComplexity: O(1)
import java.util.Arrays;
class Brute{
    public static int sortarry(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String args[]){
        int[] arr1={3,3,6,1};
        int[] arr2={3,3,0,99,-40};
        System.out.println("The largest element in arrsy is"+Brute.sortarry(arr1));
        System.out.println("The largest element in arrsy is"+Brute.sortarry(arr2));

    }
}
