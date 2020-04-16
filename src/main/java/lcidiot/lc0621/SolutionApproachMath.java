/**
 * https://leetcode.com/problems/task-scheduler/
 * 
 * http://zxi.mytechroad.com/blog/greedy/leetcode-621-task-scheduler/
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
package main.java.lcidiot.lc0621;

public class SolutionApproachMath {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for(char task : tasks){
            ++counts[task - 'A'];
        }
        
        int maxCount = 0;
        for(int count : counts){
            maxCount = Math.max(maxCount, count);
        }
        
        int ans = (maxCount - 1) * (n + 1);
        for(int count : counts){
            if(count == maxCount){
                ++ans;
            }
        }
        
        return Math.max(tasks.length, ans);
    }
}