package support;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int a ){
        value = a;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
