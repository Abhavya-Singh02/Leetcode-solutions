/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
          return true;
        }
        ListNode firstHalfhead = head;
        ListNode firstHalffind = getMiddle(head);
        ListNode SecondHalfhead = reverse(firstHalffind.next);
        while(SecondHalfhead != null){
          if(SecondHalfhead.val != firstHalfhead.val){
            return false;
          }
          SecondHalfhead = SecondHalfhead.next;
          firstHalfhead = firstHalfhead.next;
        }
        return true;
    }
    public ListNode getMiddle(ListNode head){
      ListNode Hare = head;
      ListNode Turtle = head;
      while(Hare.next != null && Hare.next.next != null){
        Hare = Hare.next.next;
        Turtle = Turtle.next;
      }
      return Turtle;
    }

    public ListNode reverse(ListNode head){
      ListNode prev = null;
      ListNode currNode = head;
      while(currNode != null){
        ListNode nextNode = currNode.next;
        currNode.next = prev;
        prev = currNode;
        currNode = nextNode;
      }
      return prev;
    }
}