/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 * 
 * Time Complexity:     O(N)
 * Space Complexity:    O(N)
 * 
 * References:
 *  https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/discuss/286906/Java-3-iterative-and-recursive-codes-w-comments-and-explanation.
 */
package com.zea7ot.leetcode.lvl4.lc1038;

import com.zea7ot.utils.data_structure.tree.TreeNode;

public class SolutionApproach0ReversedInorderTraversal1 {
    public TreeNode bstToGst(TreeNode root) {
        reversedInorder(root, new TreeNode(0));
        return root;
    }
    
    private void reversedInorder(TreeNode node, TreeNode sum){
        if(node == null) return;
        reversedInorder(node.right, sum);
        sum.val += node.val;
        node.val = sum.val;
        reversedInorder(node.left, sum);
    }
}