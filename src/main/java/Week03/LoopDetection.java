package Week03;

//Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
//        DEFINITION:
//        Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
//        EXAMPLE
//        Input: A -> B -> C -> D -> E -> C [the same C as earlier]
//        Output: C

import org.w3c.dom.Node;

import java.util.LinkedList;

public class LoopDetection {

 static boolean hasLoop(LinkedList<String> linkedList){
     if (linkedList == null || linkedList.isEmpty()){
         return false;
     }

     int slow = 0;
     int fast = 0;

     //detect loop if exists

     while (fast < linkedList.size() -1  && fast + 1 < linkedList.size() - 1){
         slow++;
         fast += 2;
         if (linkedList.get(slow).equals(linkedList.get(fast))){
             return true;
         }
     }
     return false;
 }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");

        boolean hasLoop = hasLoop(linkedList);
        if (hasLoop) {
            System.out.println("The linked list contains a loop.");
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}




