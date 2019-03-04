import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author xghuang
 * @date 2019/3/4
 * @time 9:08
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @desc:两位数相加
 */
public class test2 {

    public static void main(String[] args) {
        test2 test2 = new test2();
        test2.test();

    }

    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);


        ListNode l2 = new ListNode(0);
        ListNode node = addTwoNumbers(l1,l2);

    }


    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
       return new ListNode(2);
    }

    private class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
