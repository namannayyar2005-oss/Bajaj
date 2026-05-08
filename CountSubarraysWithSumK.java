import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sums = new HashMap<>();
        sums.put(0, 1);

        int runningSum = 0;
        int total = 0;

        for (int num : nums) {
            runningSum += num;
            total += sums.getOrDefault(runningSum - k, 0);
            sums.put(runningSum, sums.getOrDefault(runningSum, 0) + 1);
        }

        return total;
    }
}
