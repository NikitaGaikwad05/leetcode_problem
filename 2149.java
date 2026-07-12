//Rearrange Array Elements by Sign
/*You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
You should return the array of nums such that the array follows the given conditions:
    Every consecutive pair of integers have opposite signs.
    For all integers with the same sign, the order in which they were present in nums is preserved.
    The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions
 */
//TimeComplexity: O(n)
//SpaceComplexity: O(n) //Extra Space used to store the rearranged elements separately in an array, where N = size of array nums
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        int posIndex=0,negIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negIndex]=nums[i];
                negIndex+=2;
            }else{
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
        }

        return ans;
    }
}
