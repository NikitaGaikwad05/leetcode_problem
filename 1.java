//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Time Complexity: O(N) because we traverse the array only once, and each lookup or insertion in the hash map takes O(1) on average, where N is the size of the array.
//Space Complexity: O(N) since in the worst case we may store all elements of the array in the hash map
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);
        }

        return new int[] { -1, -1 };
    }
}
