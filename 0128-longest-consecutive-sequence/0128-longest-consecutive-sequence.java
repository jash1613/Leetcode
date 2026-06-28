class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        // Traverse each number
        for (int num : set) {

            // Check if it is the start of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                max = Math.max(max, length);
            }
        }

        return max;
    }
}