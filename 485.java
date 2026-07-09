//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//TimeComplexity:0(n);
//SpaceComplexity:O(1);

 import java.util.*;
class Solution{
  public int FindMaxConsecutiveOnes(int[] nums){
    int maxi=0;
    int count=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==1){
        count++;
        maxi=Math.max(maxi,count);
      }else{
        count=0;
      }
    }
    return maxi;
  }
}


 
