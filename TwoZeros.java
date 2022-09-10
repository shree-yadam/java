class TwoZeros {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return;
        }
        int slowIndex = 0;
        int numTracker = 0;
        while(numTracker < nums.length) {
            if(nums[numTracker] != 0) {
                int temp = nums[slowIndex];
                nums[slowIndex] = nums[numTracker];
                nums[numTracker] = temp;
                slowIndex++;
            }
            numTracker++;
        }
    }
}