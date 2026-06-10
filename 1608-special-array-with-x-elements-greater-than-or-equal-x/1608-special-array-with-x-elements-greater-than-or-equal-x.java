class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;

        int low = 0, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 0;
            for (int num : nums) {
                if (num >= mid) {
                    count++;
                }
            }

            if (count == mid) {
                return mid;
            } else if (count > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}