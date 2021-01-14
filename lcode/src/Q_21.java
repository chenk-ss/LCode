import util.ListNode;

/**
 * @Author chenk
 * @create 2021/1/14 23:10
 */
public class Q_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode result = node;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                node.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                node.next = l1;
                l1 = l1.next;
            }else if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        return result.next;
    }
}
