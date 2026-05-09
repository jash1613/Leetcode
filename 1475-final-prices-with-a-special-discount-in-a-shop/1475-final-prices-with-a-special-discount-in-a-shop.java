class Solution {
    public int[] finalPrices(int[] prices) {

        int[] arr = new int[prices.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!s.isEmpty() && prices[s.peek()] >= prices[i]) {

                int t = s.pop();
                arr[t] = prices[t] - prices[i];
            }

            s.push(i);
        }

       
        while (!s.isEmpty()) {
            int t = s.pop();
            arr[t] = prices[t];
        }

        return arr;
    }
}