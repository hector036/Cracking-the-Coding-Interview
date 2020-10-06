/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_02_return_kth_to_last;

/**
 *
 * @author user
 */
public class Q2_02_Return_Kth_To_Last {

    public static int printKthToLast(LinkedListNode head, int k) {
		if (head == null) {
			return 0;
		}
		int index = printKthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
	}
    public static LinkedListNode nthToLast(LinkedListNode head, int k) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		/* Move p1 k nodes into the list.*/
		for (int i = 0; i < k; i++) {
			if (p1 == null) return null; // Out of bounds
			p1 = p1.next;
		}
		
		/* Move them at the same pace. When p1 hits the end, 
		 * p2 will be at the right element. */
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
	  	}
	  	return p2;
	}
	
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
		
                for (int i = 0; i <= array.length + 1; i++) {
			printKthToLast(head, i);
		}
                
//                for (int i = 0; i <= array.length + 1; i++) {
//			LinkedListNode kth = nthToLast(head, i);
//                        System.out.println(i + "th to last node is " + kth.data);
//		}
	}
    
}
