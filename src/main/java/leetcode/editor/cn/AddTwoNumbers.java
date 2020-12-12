package leetcode.editor.cn;

//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 5371 👎 0

import leetcode.editor.cn.struct.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum = 0;
            ListNode cur = new ListNode(0);
            ListNode head = cur;
            while (l1 != null || l2 != null) {
                int count = 0;
                count += l1 == null ? 0 : l1.val;
                count += l2 == null ? 0 : l2.val;

                if (l1 != null) {
                    l1.val = (count + sum) % 10;
                    cur.next = l1;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2.val = (count + sum) % 10;
                    cur.next = l2;
                    l2 = l2.next;
                }
                if (cur.next == null) {
                    cur.next = new ListNode((count + sum) % 10);
                }
                sum = (count + sum) / 10;
                cur = cur.next;
            }
            if (sum != 0) {
                cur.next = new ListNode(sum);
            }
            return head.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}