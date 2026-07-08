//Rotate the array for k places 
//time complexity:O(n)
//Space Complexity: O(1)
// this code for right rotation 
// if the question asked regarding the left rotation same logic applied 
// but for both direction refer the solution 2
class Solution{
    public static void reverse(int [] nums, int start, int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int nums[],int k){
             int n=nums.length;
             k=k % n;
             reverse(nums,0,n-1);
             reverse(nums,0,k-1);
             reverse(nums,k,n-1);
    }
}

// Solution for both direction
/*
class Solution {
    void reverseArray(int[] nums, int start, int end) {
        // Swap elements until start meets end
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public int[] rotateArray(int[] nums, int k, String direction) {
        int n = nums.length;
        if (n == 0 || k == 0) return nums;
        k = k % n;
        if (direction.equals("right")) {
            reverseArray(nums, 0, n - 1);
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
        } 
        else if (direction.equals("left")) {
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
            reverseArray(nums, 0, n - 1);
        }
        return nums;
    }
}
*/
