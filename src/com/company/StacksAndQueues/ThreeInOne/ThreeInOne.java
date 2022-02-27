package com.company.StacksAndQueues.ThreeInOne;

public class ThreeInOne {
    public static void main(String[] args) {
        NaiveStack myStack = new NaiveStack(2, 2);

        myStack.push(1, 0);
        myStack.push(2, 1);
        myStack.push(3, 0);
        myStack.push(4, 1);

        myStack.printStack(0);
        myStack.printStack(1);

        myStack.pop(1);
        myStack.printStack(1);

    }
}
