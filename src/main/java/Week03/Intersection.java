package Week03;

// Intersection: Given two (singly) linked lists, determine if the two lists intersect.
//         Return the intersecting node. Note that the intersection is defined based on reference, not value.
//         That is, if the kth node of the first linked list is the exact same node (by reference)
//         as the jth node of the second linked list, then they are intersecting.

import org.w3c.dom.Node;

public class Intersection {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node findIntersect(Node headA, Node headB){
        if(headA == null || headB == null)
            return null;


        Node currentA = headA;
        Node currentB = headB;

        while (currentA != currentB){
            currentA = (currentA == null) ? headB : currentA.next;
            currentB = (currentB == null) ? headA : currentB.next;
        }
        return currentA;
    }


    public static void main(String[] args) {
        // Create sample linked lists
        Node intersectingNode = new Node(6);
        intersectingNode.next = new Node(7);

        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = intersectingNode;

        Node headB = new Node(3);
        headB.next = new Node(4);
        headB.next.next = new Node(5);
        headB.next.next.next= intersectingNode;


        Node intersectionNode = findIntersect(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersecting node: " + intersectionNode.data);
        } else {
            System.out.println("No intersection found.");
        }

    }
}
