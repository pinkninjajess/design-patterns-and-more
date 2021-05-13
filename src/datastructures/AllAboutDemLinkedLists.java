package datastructures;

import java.util.LinkedList;

/**
 * LinkedLists
 * - a linear data structure in which items of the same type are linked using pointers
 * - the beginning of a LinkedList is called the "head" and the end is called the "tail"
 * - Lookups are O(n) because you need to move throughout the LinkedList to find the item you are searching for (Note: arrays are faster at O(1))
 * - items are not stored sequentially in memory, which makes lookups slower
 * - iterations take O(n) like in arrays, but they are still slower than array iterations because of the way LLs are stored in memory (there is 0 caching)
 * - Insertions and deletion are O(n) because you also need to move throughout the LinkedList to add an item where you want to put
 * - even though for arrays it is also O(n) - it's a bit faster using LLs because the memory isn't stored sequentially
 * - if the LL is sorted, it only costs O(n) for insertion, and o(1) if unsorted to add to the list
 * - prepends and appends (adding an element as the head or as the tail) is SUPER fast at O(1)
 * - because it's fast to do operations at either end of a LinkedList, they are ideal for use in -Stacks- and -Queues-
 * <p>
 * - don't need a huge chunk of data - can fit in memory wherever
 * - insertion at head/tail
 */
public class AllAboutDemLinkedLists {

    public static void main(String[] args) {
        OneDirectionLinkedListNode<Integer> head = valuesToLinkedListNodes(new int[]{1, 2, 3});

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);

        System.out.println(integerLinkedList.getFirst());
        int j = 0;

    }

    private static OneDirectionLinkedListNode<Integer> valuesToLinkedListNodes(int[] values) {
        final OneDirectionLinkedListNode<Integer>[] nodes = new OneDirectionLinkedListNode[values.length];
        for (int i = 0; i < values.length; ++i) {
            nodes[i] = new OneDirectionLinkedListNode<Integer>(values[i]);
            if (i > 0) {
                nodes[i - 1].setNextNode(nodes[i]);
            }
        }
        return nodes[0];
    }

    // Note: the <T> represents a generic, which means that the T data attribute within the class can be used to represent any kind of Object
    static class OneDirectionLinkedListNode<T> {
        OneDirectionLinkedListNode<T> nextNode;
        T data;

        public OneDirectionLinkedListNode(T data) {
            this.data = data;
        }

        public void setNextNode(OneDirectionLinkedListNode<T> nextNode) {
            this.nextNode = nextNode;
        }
    }

    static class TwoDirectionLinkedListNode<T> {
        TwoDirectionLinkedListNode<T> previousNode;
        TwoDirectionLinkedListNode<T> nextNode;
        T data;

        public TwoDirectionLinkedListNode(T data) {
            this.data = data;
        }

        public void setPreviousNode(TwoDirectionLinkedListNode<T> previousNode) {
            this.previousNode = previousNode;
        }

        public void setNextNode(TwoDirectionLinkedListNode<T> nextNode) {
            this.nextNode = nextNode;
        }
    }

}
