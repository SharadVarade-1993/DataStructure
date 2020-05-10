package com.collection.generics;

public class LinkedList<N> {
    Node<N> start;

    class Node<N>{
        int data;
        Node next;
        Node(N data){
            data=data;
            next=null;
        }
    }



    public Node add(N data){
        Node n=new Node(data);
        n.next= null;
        if(start == null){
            start=n;
        }
        else{
            Node temp=start;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=n;
        }
        return start;
    }

    public Node removeall(N data){
        Node n=new Node(data);

        if(start == null){
            System.out.println("list is allready empty");
        }
        else{
            Node temp=start;
            temp=temp.next;

        }
        return start;
    }

    public boolean isEmpty(){
        if(start==null)
            return (true);
        else
            return (false);
    }

    public int size(){
        int length = 0;
        Node t=start;
        while(t !=null){
            length++;
            t=t.next;
        }
        return  length;
    }

}
