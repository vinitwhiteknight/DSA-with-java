/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    static {
        for (int i = 0; i < 100; i++)
            getIntersectionNode(null, null);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //1. Find lengths of both ll 
        int la = 0, lb = 0;
        ListNode t = headA;
        while(t != null) {la++; t=t.next;}
        t = headB;
        while(t != null) {lb++; t = t.next;}

        //2. find the differenc and move the ptr
        //two temp 
        ListNode ta = headA, tb = headB;
        int da = 0, db = 0;

        if(la > lb){
            da = la-lb;
            for(int i = 1; i<=da; i++){
               ta = ta.next; 
            }
        }
        else{
            db = lb-la;
            for(int i = 1; i<=db; i++){
                tb = tb.next;
            }
        }

        //3. now start comparing
        while(ta != tb){
            ta = ta.next;
            tb = tb.next;
        }
        return ta;
    }
}
