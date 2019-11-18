package com.zipcodewilmington.singlylinkedlist;

public class Node <T>{
    T data;
    Node next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return this.data;

    }

    public void setNext(Node next){
        this.next = next;

    }

    public Node getNext(){
        return  this.next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

}
