//Remove the Duplicate from the sorted array 
//ths problem solve using two pointer approach
//Time complexity: O(n)
//Space Complexity: O(1)

// Solution 
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return (i+1);
    }
}
