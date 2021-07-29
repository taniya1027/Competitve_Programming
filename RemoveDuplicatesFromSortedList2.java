class Solution 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        prev.next = curr;
        
        while(curr != null)
        {
            while(curr.next != null && curr.val == curr.next.val)
            {
                curr = curr.next;
            }
            
            if(prev.next != curr)
            {
                prev.next = curr.next;
                curr = curr.next;
            }
            else
            {
                prev = prev.next;
                curr = curr.next;
            }
        }
       return dummy.next;
    }
}

        
