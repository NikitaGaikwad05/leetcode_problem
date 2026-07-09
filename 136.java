//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

//You must implement a solution with a linear runtime complexity and use only constant extra space.
//TimeComplexity: O(n)
//SpaceComplexity: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor=xor ^ num;
        }
        return xor;
    }
}
