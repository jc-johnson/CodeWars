package src.main.java.RotateLinkedList;

import sun.awt.image.ImageWatched;

/**
 * Created by Jordan on 7/11/2017.
 */
public class Solution {

    public class LinkedList {

        Node head;

    }

    public class Node {
        int data;
        Node next;

        // constructor - Next is initialized to null
        Node(int d) {data  = d;};
    }

    private static void rotateArray(int[] array) {


    }

    private static void rotate(LinkedList list) {

        shuffle(list);
    }


    private static Node shuffle(LinkedList list) {

        int temp = list.head.next.data;

        // end case
        if (list.head.next == null) {
            temp = list.head.data;

        }

        list.head.data = list.head.next.data;
        list.head.next.data = temp;
        return null;//  shuffle(list.head.next);

    }

    public static void main(String[] args) {
        // rotate array
        int[] array = {1, 2, 4, 5, 6,};
        rotateArray(array);
    }

}
