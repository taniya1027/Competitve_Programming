class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        
        int sum = 0;
        int carry = 0;
        
        while(l1 != null || l2 != null)
        {
            int val1 = (l1 == null)? 0:l1.val;
            int val2 = (l2 == null)?0: l2.val;
            
            
            sum = val1 + val2 + carry;
            
            carry = sum/10;
            int last_digit = sum%10;
            
           
            ans.next = new ListNode(last_digit);
            ans = ans.next;
            
            if(l1 != null)
                 l1 = l1.next;
            
            if(l2 != null)
                l2 = l2.next;
            
        }
        
        if(carry > 0)
        {
            ans.next = new ListNode(1);
        }
        
        return dummy.next;
        
    }
}
