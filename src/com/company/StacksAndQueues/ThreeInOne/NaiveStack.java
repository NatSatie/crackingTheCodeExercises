package com.company.StacksAndQueues.ThreeInOne;

import java.util.ArrayList;
import java.util.List;

public class NaiveStack {
    private List<Integer> stack;
    private int numberOfStacks;
    private int size;

    public NaiveStack(int numberOfStacks, int size){
        this.stack = new ArrayList<Integer>();
        for ( int i = 0; i < numberOfStacks * size; i++) {
            this.stack.add(i, -1);
        }
        this.numberOfStacks = numberOfStacks;
        this.size = size;
    }

    public int pop(int stack){
        for ( int i = stack; i < numberOfStacks * size; i = i + size){
            if (this.stack.get(i+size).equals(-1) || i+size > numberOfStacks * size){
                this.stack.set(i, -1);
                if ( i - size >= 0){
                    return this.stack.get(i - size);
                } else {
                    return -1;
                }
            }
        } return -1;
    }

    public void push(Integer elem, int stack){
        for ( int i = stack; i < numberOfStacks * size; i = i + size){
            if (this.stack.get(i).equals(-1)){
                this.stack.add(i, elem);
            }
        }
    }

    public void peek(int stack){
        for ( int i = stack; i < numberOfStacks * size; i = i + size){
            System.out.print(this.stack.get(i) + " ");
        } System.out.print("\r\n");
    }

    public void printStack(int stack){
        for ( int i = stack; i < numberOfStacks * size; i = i + size){
            System.out.print(this.stack.get(i) + " ");
        } System.out.print("\r\n");
    }

    public boolean isEmpty(int stack){
        boolean b = this.stack.get(stack).equals(-1);
        return b;
    }
}
