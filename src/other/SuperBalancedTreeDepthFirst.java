package other;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SuperBalancedTreeDepthFirst {

    // use depth first (Depth first uses a Stack aka an ArrayDeque in Java)
    public static boolean isBalanced(BinaryTreeNode treeRoot) {

        // determine if the tree is superbalanced

        // a tree with no nodes is superbalanced, because there are no leaves!
        if (treeRoot == null) {
            return true;
        }

        // we short circuit as soon as we find more than two
        List<Integer> depths = new ArrayList<>(3);

        Deque<NodeDepthPair> nodes = new ArrayDeque<>();

        int depth = 0;

        NodeDepthPair nodeDepthPair = new NodeDepthPair(treeRoot, depth);
        nodes.push(nodeDepthPair);

        while (!nodes.isEmpty()) {
            nodeDepthPair = nodes.pop();
            depth = nodeDepthPair.depth;

            // we are at a leaf - the end of the tree
            if (nodeDepthPair.node.left == null && nodeDepthPair.node.right == null) {
                if (!depths.contains(depth)) {
                    depths.add(depth);
                }
                if (depths.size() > 2 || depths.size() == 2 && (Math.abs(depths.get(0) - depths.get(1)) > 1)) {
                    return false;
                }
            }
            if (nodeDepthPair.node.left != null) {
                nodes.addFirst(new NodeDepthPair(nodeDepthPair.node.left, depth + 1));
            }
            if (nodeDepthPair.node.right != null) {
                nodes.addFirst(new NodeDepthPair(nodeDepthPair.node.right, depth + 1));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SuperBalancedTreeBreadthFirst.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }

    @Test
    public void fullTreeTest() {
        final BinaryTreeNode root = new BinaryTreeNode(5);
        final BinaryTreeNode a = root.insertLeft(8);
        final BinaryTreeNode b = root.insertRight(6);
        a.insertLeft(1);
        a.insertRight(2);
        b.insertLeft(3);
        b.insertRight(4);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }


    // tests

    @Test
    public void bothLeavesAtTheSameDepthTest() {
        final BinaryTreeNode root = new BinaryTreeNode(3);
        root.insertLeft(4).insertLeft(1);
        root.insertRight(2).insertRight(9);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    @Test
    public void leafHeightsDifferByOneTest() {
        final BinaryTreeNode root = new BinaryTreeNode(6);
        root.insertLeft(1);
        root.insertRight(0).insertRight(7);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    @Test
    public void leafHeightsDifferByTwoTest() {
        final BinaryTreeNode root = new BinaryTreeNode(6);
        root.insertLeft(1);
        root.insertRight(0).insertRight(7).insertRight(8);
        final boolean result = isBalanced(root);
        assertFalse(result);
    }

    @Test
    public void bothSubTreesSuperbalancedTest() {
        final BinaryTreeNode root = new BinaryTreeNode(1);
        root.insertLeft(5);
        final BinaryTreeNode b = root.insertRight(9);
        b.insertLeft(8).insertLeft(7);
        b.insertRight(5);
        final boolean result = isBalanced(root);
        assertFalse(result);
    }

    @Test
    public void bothSubTreesSuperbalancedTwoTest() {
        final BinaryTreeNode root = new BinaryTreeNode(1);
        final BinaryTreeNode a = root.insertLeft(2);
        a.insertLeft(3);
        a.insertRight(7).insertRight(8);
        root.insertRight(4).insertRight(5).insertRight(6).insertRight(9);
        final boolean result = isBalanced(root);
        assertFalse(result);
    }

    @Test
    public void threeLeavesAtDifferentLevelsTest() {
        final BinaryTreeNode root = new BinaryTreeNode(1);
        final BinaryTreeNode a = root.insertLeft(2);
        final BinaryTreeNode b = a.insertLeft(3);
        a.insertRight(4);
        b.insertLeft(5);
        b.insertRight(6);
        root.insertRight(7).insertRight(8).insertRight(9).insertRight(10);
        final boolean result = isBalanced(root);
        assertFalse(result);
    }

    @Test
    public void onlyOneNodeTest() {
        final BinaryTreeNode root = new BinaryTreeNode(1);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    @Test
    public void treeIsLinkedListTest() {
        final BinaryTreeNode root = new BinaryTreeNode(1);
        root.insertRight(2).insertRight(3).insertRight(4);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    public static class NodeDepthPair {
        BinaryTreeNode node;
        int depth;

        NodeDepthPair(BinaryTreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

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
