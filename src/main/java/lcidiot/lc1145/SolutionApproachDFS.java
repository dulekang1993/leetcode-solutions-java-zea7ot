/**
 * https://leetcode.com/problems/binary-tree-coloring-game/
 */
package main.java.lcidiot.lc1145;

import main.java.lcidiot.utils.TreeNode;

public class SolutionApproachDFS {
    private int left, right;
    
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        // sanity check
        if(root == null) return false;
        dfs(root, x);
        int parent = n - (1 + this.left + this.right);
        return Math.max(parent, Math.max(this.left, this.right)) > n / 2;
    }
    
    private int dfs(TreeNode node, int x){
        if(node == null) return 0;
        
        int left = dfs(node.left, x);
        int right = dfs(node.right, x);
        if(node.val == x){
            this.left = left;
            this.right = right;
        }
        
        return 1 + left + right;
    }
}