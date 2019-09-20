package algorithm;

import support.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    void printOrder(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);

        while(!queue.isEmpty()){

            Node tempNode = queue.poll();
            System.out.print(tempNode + " ");

            if(tempNode.left!=null){
                queue.add(tempNode.left);
            }
            if(tempNode.right!=null){
                queue.add(tempNode.right);
            }
        }


    }

    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.left = left;
        root.right = right;
        left.left = new Node(4);
        left.right = new Node(5);
        bfs.printOrder(root);
    }
}
