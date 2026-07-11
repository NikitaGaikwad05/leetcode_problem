//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//This problem are solved using the Dutch National Flag algorithm.
/*We divide the array into three partitions using three pointers – low, mid, and high.
    From 0 to low-1, we’ll keep only 0s
    From low to mid-1, only 1s
    From high+1 to n-1, only 2 */
//TimeComplexity: O(n)
//SpaceComplexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
              mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        
    }
}
