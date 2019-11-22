package xiaohui;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {
    /**
     * 二叉树节点
     */

    private static class TreeNode {
        int data;
        boolean isFirst;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    /**
     * 创建二叉树
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.isEmpty()) {
            return null;
        }

        Integer data = inputList.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }

    /**
     * 前序遍历
     *
     * @param node
     */
    public static void preOrderTravel(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        preOrderTravel(node.leftChild);
        preOrderTravel(node.rightChild);
    }

    public static void preOrderTravelWithStack(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = node;
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                System.out.println(treeNode.data);
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }

            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.rightChild;
            }
        }
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public static void midOrderTravel(TreeNode node) {
        if (node == null) {
            return;
        }
        midOrderTravel(node.leftChild);
        System.out.println(node.data);
        midOrderTravel(node.rightChild);
    }

    public static void midOrderTravelWithStack(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = node;
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }

            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                System.out.println(treeNode.data);
                treeNode = treeNode.rightChild;
            }
        }
    }

    /**
     * 后序遍历
     *
     * @param node
     */

    public static void postOrderTravel(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTravel(node.leftChild);
        postOrderTravel(node.rightChild);
        System.out.println(node.data);
    }


    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>(Arrays.asList(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}));
        TreeNode treeNode = createBinaryTree(inputList);
        /**
         *               3
         *            /    \
         *          2        8
         *        /   \    /  \
         *       9    10  n    4
         *     /  \  /  \
         *    n   n n   n
         */
//        preOrderTravel(treeNode);
//        System.out.println("++++++++++++");
//        preOrderTravelWithStack(treeNode);
//        System.out.println("============================");
//        midOrderTravel(treeNode);
//        System.out.println("++++++++++++");
//        midOrderTravelWithStack(treeNode);
//        System.out.println("============================");
        postOrderTravel(treeNode);
        System.out.println("++++++++++++");
//        postOrderTravelWithStack(treeNode);
    }
}
