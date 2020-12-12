package leetcode.editor.cn.struct;

/********************************************************************************************************
 * @Author:LiXingFei
 * @Description:
 * @Date: Create in 2020/12/12 17:00
 * @Modified by:
 *******************************************************************************************************/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
