package ds.tree;

import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.setLeft(second);
        first.setRight(third);
        second.setLeft(fourth);
        second.setRight(fifth);
    }

    public void recursivePreOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        recursivePreOrderTraversal(root.getLeft());
        recursivePreOrderTraversal(root.getRight());
    }

    public void iterativePreOrderTraversal(){
        if(root == null){
            return;
        }
        System.out.println();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.getData() + " ");
            if(temp.getRight() != null){
                stack.push(temp.getRight());
            }
            if(temp.getLeft() != null){
                stack.push(temp.getLeft());
            }
        }
        System.out.println();
    }

    public void recursiveInOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        recursiveInOrderTraversal(root.getLeft());
        System.out.print(root.getData() + " ");
        recursiveInOrderTraversal(root.getRight());
    }

    public void iterativeInorderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp !=null){
            if(temp !=null){
                stack.push(temp);
                temp = temp.getLeft();
            } else {
                temp = stack.pop();
                System.out.print(temp.getData() + " " );
                temp = temp.getRight();
            }
        }
    }

    public void recursivePostOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        recursivePostOrderTraversal(root.getLeft());
        recursivePostOrderTraversal(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.println("Recursive Preorder Traversal");
        bt.recursivePreOrderTraversal(bt.root);
        System.out.println("Iterative Preorder Traversal");
        bt.iterativePreOrderTraversal();
        System.out.println("Recursive Inorder Traversal");
        bt.recursiveInOrderTraversal(bt.root);
        System.out.println();
        System.out.println("Iterative Inorder Traversal");
        bt.iterativeInorderTraversal(bt.root);
        System.out.println();
        System.out.println("Recursive Postorder Traversal");
        bt.recursivePostOrderTraversal(bt.root);
        System.out.println();

    }


}
