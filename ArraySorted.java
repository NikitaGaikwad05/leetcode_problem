//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
//There may be duplicates in the original array.
class solution{
    public boolean check(int[]nums)
    {
        int count=0;
        int n=nums.length;
        if(n<=1)return true;
        for (int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n])
           {
            count++;
        }
        if(count>1)
        return false;
    }
    return true;
}
}
