package algorithm;

import support.Node;

public class Dfs {

    public void preOrder(Node node){
        if(node != null){
            System.out.print(node);
        }else{
            return;
        }
        if(node.left != null){
            preOrder(node.left);
        }
        if(node.right != null){
            preOrder(node.right);
        }
    }

    public void inOrder(Node node){
        if(node.left != null){
            inOrder(node.left);
        }
        if(node != null){
            System.out.print(node);
        }else{
            return;
        }
        if(node.right != null){
            inOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node.left != null){
            postOrder(node.left);
        }
        if(node.right!=null){
            postOrder(node.right);
        }
        if(node!=null){
            System.out.print(node);
        }else{
            return;
        }
    }

    public static void main(String[] args) {
        Dfs dfs = new Dfs();
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.left = left;
        root.right = right;
        left.left = new Node(4);
        left.right = new Node(5);
        System.out.println("The result of PreOrder");
        dfs.preOrder(root);
        System.out.println(" ");
        System.out.println("The result of InOrder");
        dfs.inOrder(root);
        System.out.println(" ");
        System.out.println("The result of PostOrder");
        dfs.postOrder(root);
        System.out.println(" ");


    }
}
