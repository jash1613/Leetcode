class Solution {

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
         int[] ans = {-1, -1};
        int left = 0;
        int right = n - 1;
        int ind = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {

                ind = mid;

                
                right = mid - 1;
            }

            else if (nums[mid] < target) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        ans[0] = ind;
        left = 0;
        right = n - 1;

        ind = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                ind = mid;

               
                left = mid + 1;
            }

            else if (nums[mid] < target) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        ans[1] = ind;

        return ans;
    }
}