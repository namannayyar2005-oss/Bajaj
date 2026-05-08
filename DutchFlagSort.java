class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int index = 0;
        int blue = nums.length - 1;

        while (index <= blue) {
            if (nums[index] == 0) {
                swap(nums, index, red);
                red++;
                index++;
            } else if (nums[index] == 1) {
                index++;
            } else {
                swap(nums, index, blue);
                blue--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
