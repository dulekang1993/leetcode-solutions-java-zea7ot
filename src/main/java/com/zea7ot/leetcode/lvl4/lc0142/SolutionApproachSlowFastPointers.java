/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
package com.zea7ot.leetcode.lvl4.lc0142;

import com.zea7ot.utils.data_structure.linkedlist.ListNode;

public class SolutionApproachSlowFastPointers {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast){
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                
                return slow;
            }
        }
        
        return null;
    }
}