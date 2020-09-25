package algo.kata.simple;

import java.util.Arrays;

public class BinaryTree {

    public static TreeNode fromInAndPostOrder(int[] inorder, int[] postorder) {
        System.out.println(String.format("%s %s", Arrays.toString(inorder), Arrays.toString(postorder)));
        if (inorder.length == 0) {
            return null;
        }

        if (inorder.length == 1) {
            return new TreeNode(inorder[0]);
        }

        int rootVal = postorder[postorder.length - 1];
        TreeNode rootNode = new TreeNode(rootVal);
        int rootValIndex = indexOf(inorder, rootVal);

        rootNode.right = fromInAndPostOrder(Arrays.copyOfRange(inorder, rootValIndex + 1, inorder.length),
                Arrays.copyOfRange(postorder, 0, Math.max(postorder.length - 1, 0)));

        rootNode.left = fromInAndPostOrder(Arrays.copyOfRange(inorder, 0, rootValIndex),
                Arrays.copyOfRange(postorder, 0, Math.max(postorder.length - 2, 0)));


        return rootNode;
    }


    public static int indexOf(int[] arrays, int val) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == val) {
                return i;
            }
        }

        return -1;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
