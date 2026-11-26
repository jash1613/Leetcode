class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        boolean a = true;

        while (n >= k) {
            n -= k;
            k--;

            a = !a;
        }

        return !a;
    }
}