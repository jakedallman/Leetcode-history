// Last updated: 10/4/2025, 2:36:06 PM




class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode dummy = temp;
        while (l1 != null || l2 != null)
        {
            int value = 0;
            if (!(l1 == null || l2 == null))
            {
                value = l1.val+l2.val+carry;
                l1 = l1.next;
                l2 = l2.next;
                if (carry > 0)
                {
                    carry =0;
                }
            } else if (l1 == null)
            {
                value = l2.val+carry;
                l2 = l2.next;
                if (carry > 0)
                {
                    carry =0;
                }
            } else
            {
                value = l1.val+carry;
                l1 = l1.next;
                if (carry > 0)
                {
                    carry =0;
                }
            }
            if (value > 9)
            {
                value-=10;
                carry++;
            }
            dummy.next = new ListNode(value);
            dummy = dummy.next;
        }
        if (carry > 0)
        {
            dummy.next = new ListNode(1);
            dummy = dummy.next;
        }
        return temp.next;
    }
}