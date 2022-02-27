package com.company.StacksAndQueues.SimpleStack;

import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop(){
        if (this.top == null) throw new EmptyStackException();
        T item = top.data;
        this.top = top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> t = new StackNode<>(item);
        t.next = this.top;
        this.top = t;
    }

    public T peek(){
        if (this.top == null) throw new EmptyStackException();
        return this.top.data;
    }

    public boolean isEmpty(){
        return this.top == null;
    }
}
