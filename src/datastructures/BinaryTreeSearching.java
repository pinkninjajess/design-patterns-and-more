package datastructures;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class BinaryTreeSearching {


    /**
     * Breadth First - looks at your closest neighbours first and then makes its way downward
     * - Best used when you want to find an element closest to the source
     * - maybe for example, for asking your neighbours for a cup of sugar, you'd want to start with the closest neighbours
     * and then make your way outward
     * - in a text search, you'd want to receive your most relevant results first
     * <p>
     * Would first visit: 5 -> 8 -> 6 -> 1 -> 2 -> 3 -> 4
     * <p>
     * 5
     * /   \
     * 8       6
     * / \     / \
     * 1   2   3   4
     */
    public static boolean valueExistsBreadthFirst(BinaryTreeNode treeRoot, int value) {
        if (treeRoot == null) {
            return false;
        }

        // A Deque is a double ended queue - which is a list that supports insertion and removal operations at both ends
        // See Readme for more info: Three data structures: queue,stack, and deque
        Queue<BinaryTreeNode> nodesQueue = new ArrayDeque<>();
        Set<String> a = new HashSet<>();
        /*
                You can think of a Queue as the British word for a line up, when you add someone to the line up, they go to the back
                When the Bouncer at a bar is taking the next person in the line up, if they are fair, when a space opens up, they will let in the person at the front of the line
         */

        BinaryTreeNode node = treeRoot;
        nodesQueue.add(node);

        while (!nodesQueue.isEmpty()) {
            node = nodesQueue.remove();
            int j = 0; // for debugging
            if (node.value == value) {
                return true;
            }

            if (node.left != null) {
                nodesQueue.add(node.left);
            }
            if (node.right != null) {
                nodesQueue.add(node.right);
            }
        }

        return false;
    }


    /**
     * Depth First - looks at your closest neighbours first and then makes its way downward
     * - useful in puzzle games or searches when you follow a path that leads to more and more options/possibilities
     * Would first visit: 5 -> 8 -> 1 -> 2 -> 6 -> 3 -> 4
     * <p>
     * 5
     * /   \
     * 8       6
     * / \     / \
     * 1   2   3   4
     */
    public static boolean valueExistsDepthFirst(BinaryTreeNode treeRoot, int value) {
        if (treeRoot == null) {
            return false;
        }
        /* You could also use an ArrayDeque - but it doesn't restrict you to only use Stack operations
           - you can think of a Stack as a stack of dishes for example
                    you can add (push) a dirty plate to a stack of dirty dishes, and take (pop) one from the top as you wash the dishes
        */
        Stack<BinaryTreeNode> nodesStack = new Stack<>();

        BinaryTreeNode node = treeRoot;
        nodesStack.add(node);

        while (!nodesStack.isEmpty()) {
            node = nodesStack.pop();
            int j = 0; // for debugging
            if (node.value == value) {
                return true;
            }
            if (node.right != null) {
                nodesStack.push(node.right);
            }

            if (node.left != null) {
                nodesStack.push(node.left);
            }
        }

        return false;
    }


    /**
     * Code below taken from Interviewcake.com question on SuperBalanced Trees
     */
    @Test
    public void fullTreeTest() {
        final BinaryTreeNode root = new BinaryTreeNode(5);
        final BinaryTreeNode a = root.insertLeft(8);
        final BinaryTreeNode b = root.insertRight(6);
        a.insertLeft(1);
        a.insertRight(2);
        b.insertLeft(3);
        b.insertRight(4);
        final boolean containsValueBreadthFirstCheck = valueExistsBreadthFirst(root, 2);
        final boolean containsValueDepthFirstCheck = valueExistsDepthFirst(root, 2);
        assertTrue(containsValueBreadthFirstCheck);
        assertTrue(containsValueDepthFirstCheck);
    }

    /**
     * A Binary tree is a tree where every node has two or fewer children
     * The children are usually called "left" and "right"
     * No tree can be cyclic  (so 6 cannot connect backwards to 5, for example)
     * <p>
     * 5       <- the root
     * /   \
     * 8       6
     * / \     / \
     * 1   2   3   4    <- leaf nodes
     * <p>
     * Note: definition from Interviewcake.com
     */
    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }
}

/// Tree is a graph with no cycles
// tree has a root
// answer recursively and non-recursively
// problems with recursion - you could potentially blow up the stack


// divide and conquer when you have to go divide and go through
// good for merge sort and binary search

// functional languages can turn recursion into iteration in the background using tail recursion (e.g., Scala)
