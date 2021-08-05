package other;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycle {

    public static boolean containsCycle(LinkedListNode firstNode) {
        LinkedListNode fastRunner = firstNode;
        LinkedListNode slowRunner = firstNode;

        if (firstNode == null || firstNode.next == null) {
            return false;
        }

        while (fastRunner != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;

            if (slowRunner == fastRunner) {
                return true;
            }
        }
        return false;
    }

    private static LinkedListNode[] valuesToLinkedListNodes(int[] values) {
        final LinkedListNode[] nodes = new LinkedListNode[values.length];
        for (int i = 0; i < values.length; ++i) {
            nodes[i] = new LinkedListNode(values[i]);
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        return nodes;
    }


    // tests

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(LinkedListCycle.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }

    public static boolean containsCycle32(LinkedListNode firstNode) {
        Set<LinkedListNode> nodes = new HashSet<>();

        while (firstNode != null) {

            if (nodes.contains(firstNode)) {
                return true;
            } else {
                nodes.add(firstNode);
                firstNode = firstNode.next;
            }
        }

        // check if the linked list contains a cycle

        return false;
    }

    @Test
    public void linkedListWithNoCycleTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4});
        final boolean result = containsCycle(nodes[0]);
        assertFalse(result);
    }

    @Test
    public void cycleLoopsToBeginningTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4});
        nodes[3].next = nodes[0];
        final boolean result = containsCycle(nodes[0]);
        assertTrue(result);
    }

    @Test
    public void cycleLoopsToMiddleTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4, 5});
        nodes[4].next = nodes[2];
        final boolean result = containsCycle(nodes[0]);
        assertTrue(result);
    }

    @Test
    public void twoNodeCycleAtEndTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4, 5});
        nodes[4].next = nodes[3];
        final boolean result = containsCycle(nodes[0]);
        assertTrue(result);
    }

    @Test
    public void emptyListTest() {
        final boolean result = containsCycle(null);
        assertFalse(result);
    }

    @Test
    public void oneElementLinkedListNoCycleTest() {
        final LinkedListNode node = new LinkedListNode(1);
        final boolean result = containsCycle(node);
        assertFalse(result);
    }

    @Test
    public void oneElementLinkedListCycleTest() {
        final LinkedListNode node = new LinkedListNode(1);
        node.next = node;
        final boolean result = containsCycle(node);
        assertTrue(result);
    }

    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }
}
