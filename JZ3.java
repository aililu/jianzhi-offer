/*
JZ3 从尾到头打印链表

输入一个链表的头节点，
按链表从尾到头的顺序返回每个节点的值（用数组返回）。
*/
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> al = new ArrayList<>();
        //遍历链表，存入list
        while(listNode != null){
            al.add(listNode.val);
            listNode = listNode.next;
        }
        //翻转list
        for(int i = 0,j = al.size() - 1; i < j; i++, j--){
            int tmp = al.get(i);
            al.set(i,al.get(j));
            al.set(j,tmp);
        }
        return al;
    }
}