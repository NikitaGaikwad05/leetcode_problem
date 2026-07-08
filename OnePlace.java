//Left Rotate on array by one place ;
//Time Complexity: o(n)
//Space Complexity: O(1)
//Optimal solution using single array
class Solution{
  public static int rotate(int [] nums){
    int n=nums.length;
    int temp=nums[0];
    for(int i=1;i<n;i++){
      nums[i-1]=nums[i];
    }
    nums[n-1]=temp;
  }
}
