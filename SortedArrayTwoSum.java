class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int current = numbers[start] + numbers[end];

            if (current == target) {
                return new int[] {start + 1, end + 1};
            }

            if (current > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[] {};
    }
}
