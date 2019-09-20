package support;


public class LinkedNode {
    public int value;
    public LinkedNode next;
    public LinkedNode(int i){
        value=i;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
