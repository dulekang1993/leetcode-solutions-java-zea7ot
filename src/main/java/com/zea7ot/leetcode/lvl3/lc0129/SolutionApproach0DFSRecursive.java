/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 * 
 * Time Complexity:     O(N)
 * Space Complexity:    O(H)
 * 
 * Tabulation vs Memoization
 * https://www.geeksforgeeks.org/tabulation-vs-memoization/
 */
package com.zea7ot.leetcode.lvl3.lc0129;

import com.zea7ot.utils.data_structure.tree.TreeNode;

public class SolutionApproach0DFSRecursive {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null) {
            return sum * 10 + node.val;
        }

        return dfs(node.left, sum * 10 + node.val) + dfs(node.right, sum * 10 + node.val);
    }
}