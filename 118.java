//Pascal's Triangle
/*Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above:
*/

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int val = 1;

            for (int j = 0; j <= i; j++) {
                row.add(val);
                val = val * (i - j) / (j + 1);
            }

            result.add(row);
        }

        return result;
    }
}
