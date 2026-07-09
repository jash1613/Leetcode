import java.util.*;

class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int x : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peekLast() > 0 && x < 0) {

                if (Math.abs(stack.peekLast()) < Math.abs(x)) {
                  
                    stack.removeLast();
                }
                else if (Math.abs(stack.peekLast()) == Math.abs(x)) {
                    
                    stack.removeLast();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            
            if (!destroyed) {
                stack.addLast(x);
            }
        }

        int[] ans = new int[stack.size()];
        int i = 0;

        for (int num : stack) {
            ans[i++] = num;
        }

        return ans;
    }
}