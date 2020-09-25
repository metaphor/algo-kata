package algo.kata.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    @Test
    void should_build_tree_from_inorder_and_postorder() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        BinaryTree.TreeNode tree = BinaryTree.fromInAndPostOrder(inorder, postorder);
        Assertions.assertEquals(3, tree.val);
        Assertions.assertEquals(9, tree.left.val);
        Assertions.assertEquals(20, tree.right.val);
        Assertions.assertEquals(15, tree.right.left.val);
        Assertions.assertEquals(7, tree.right.right.val);

    }

    @Test
    void should_build_tree_from_inorder_and_postorder_has_only_right_node() {
        int[] inorder = {1, 2, 3, 4};
        int[] postorder = {2, 1, 4, 3};
        BinaryTree.TreeNode tree = BinaryTree.fromInAndPostOrder(inorder, postorder);
        Assertions.assertEquals(3, tree.val);

    }

    @Test
    void should_build_tree2_from_inorder_and_postorder_has_only_right_node() {
        int[] inorder = {3, 2, 1};
        int[] postorder = {3, 2, 1};
        BinaryTree.TreeNode tree = BinaryTree.fromInAndPostOrder(inorder, postorder);
        Assertions.assertEquals(1, tree.val);
        Assertions.assertEquals(3, tree.left.val);
        Assertions.assertEquals(2, tree.left.right.val);

    }

    @Test
    void should_not_build_tree_if_empty() {
        int[] inorder = {};
        int[] postorder = {};
        BinaryTree.TreeNode tree = BinaryTree.fromInAndPostOrder(inorder, postorder);
        Assertions.assertNull(tree);

    }
}
