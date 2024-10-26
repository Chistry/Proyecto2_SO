/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author chris
 */
public class Queue<T> {

    private Nodo<T> head, tail;
    private int size;

    
    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    
    public Nodo add(T data) {
        Nodo node = new Nodo(data);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            Nodo pointer = getTail();
            pointer.setNext(node);
            setTail(node);
        }
        size++;
        return node;
    }
    
}