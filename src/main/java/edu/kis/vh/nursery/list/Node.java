package edu.kis.vh.nursery.list;

public class Node {

    public int getValue(){
        return value;
    }
    public void setPrev(Node prev){
        this.prev = prev;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public int value;
    public Node prev, next;

    public Node(int i) {
        value = i;
    }

}
