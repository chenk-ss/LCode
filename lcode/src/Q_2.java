import util.ListNode;

/**
 * @Author chenk
 * @create 2021/1/13 22:35
 */
public class Q_2 {

public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int over = 0, sum = 0;
    ListNode sumResult = new ListNode();
    ListNode result = sumResult;
    while (l1 != null || l2 != null) {
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        sum += over;
        over = sum / 10;
        sumResult.next = new ListNode(sum % 10);
        sumResult = sumResult.next;
        sum = 0;
    }
    if (over > 0) {
        sumResult.next = new ListNode(over);
    }
    return result.next;
}

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);
        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(5);

        ListNode node3 = addTwoNumbers(node1, node2);
        while (node3 != null) {
            System.out.println(node3.val);
            node3 = node3.next;
        }
    }
}
