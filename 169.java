//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than (n / 2) times. 
//You may assume that the majority element always exists in the array.
//TimeComplexity : O(n)
//SpaceComplexity : O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                count2++;
            }

        }
        if(count2>(n/2)){
            return el;
        }
        return -1;
    }
}
