//MAXIMUM SUBARRAY
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Solved using the Kadanes's Algorithm
//TimeComplexity: O(n)
//SpaceComplexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        long maxi= Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            } if(sum<0){
                sum=0;
            }
        }
           return(int) maxi;        
    }
}
