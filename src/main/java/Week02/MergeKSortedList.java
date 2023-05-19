package Activities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.sort;


//2) Mergek Sorted Lists
//        You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//        Merge all the linked-lists into one sorted linked-list and return it.
//
//        Example1:
//        Input: lists = [[1,4,5],[1,3,4],[2,6]]
//        Output:[1,1,2,3,4,4,5,6]
//        Explanation: The linked-lists are:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//        merging them into one sorted list:
//        1->1->2->3->4->4->5->6
//
//        Example2:
//        Input: lists= []
//        Output: []
//
//        Example3:
//        Input: lists = [[]]
//        Output: []
//
//        Constraints:
//
//
//
//        k == lists.length
//
//        0 <= k <= 104
//
//        0 <= lists[i].length <= 500
//
//        -104 <= lists[i][j] <= 104
//
//        lists[i] is sorted in ascending order.
//
//        The sum of lists[i].length will not exceed 104.

public class MergeKSortedList {

    public static void main(String[] args) {
        List<Integer> exmpl = new LinkedList<>();
        exmpl.add(0, 10);
        exmpl.add(0,10);
        exmpl.add(0, 13);
        exmpl.add(1, 13);
        exmpl.add(1, 13);
        System.out.println(exmpl);

        List<List<Integer>> num = new ArrayList<>();
        num.add(0, Collections.singletonList(10));
        num.add(0, Collections.singletonList(20));
        num.add(1, Collections.singletonList(12));
        num.add(1, Collections.singletonList(15));
        num.add(1, Collections.singletonList(9));


        System.out.println(mergeKSortedLists(num));






    }

    public static List<Integer> mergeKSortedLists(List<List<Integer>> nums){

        LinkedList<Integer> result = new LinkedList<>();


        for(var num : nums) {
            result.addAll(num);
        }

        for(int i = 0; i < result.size() - 1; i++){

            for (int j = i + 1; j < result.size(); j ++){
                int current = result.get(i);
                int next = result.get(j);

                if (next < current){
                    i = j;
                }
            }

            Integer temp = result.get(i);
            result.set(i, result.get(i));
            result.set(i, temp);
            Collections.sort(result);
        }
        return result;
    }
}
