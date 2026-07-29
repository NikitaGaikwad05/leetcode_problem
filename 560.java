//Sub Array sum is equals k
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//TimeComplexity: O(n)
//SpaceComplexity :O(n)


 class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>prefixsumCount=new HashMap<>();
        int prefixsum=0;
        int count=0;
        prefixsumCount.put(0,1);
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];
            int remove=prefixsum-k;
            if(prefixsumCount.containsKey(remove)){
                count+=prefixsumCount.get(remove);
            }
            prefixsumCount.put(prefixsum,prefixsumCount.getOrDefault(prefixsum,0)+1);

        }
        return count;
    }
}
