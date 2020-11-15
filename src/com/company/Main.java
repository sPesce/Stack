package com.company;

public class Main {

    public static void main(String[] args) {
	    testStack();
    }

    public static void testStack() {
        System.out.println("Creating empty stack, then pushing 5,19,30,35...");
        Stack stack = new Stack();
        stack.push(5);
        stack.push(19);
        stack.push(30);
        stack.push(35);
        System.out.println("Stack size is: " + stack.getSize());
        System.out.println("Peek of stack is: " + stack.peekTop());

        System.out.println("Printing Stack ...");
        stack.print();

        System.out.println("\nPopped " + stack.pop() + " from stack");
        System.out.println("Popped " + stack.pop() + " from stack");
        System.out.println("Popped " + stack.pop() + " from stack");
        System.out.println("Printing Stack ...");
        stack.print();
        System.out.println("Stack size is: " + stack.getSize());

        System.out.println("\nPushing 5, 10 to stack...");
        stack.push(5);
        stack.push(10);
        System.out.println("Printing Stack ...");
        stack.print();

        int[] ints = {1,2,3,4,5};
        System.out.println("Creating stack from array {1,2,3,4,5}");
        Stack stack2 = new Stack(ints);
        System.out.println("Printing Stack ...");
        stack2.print();

        //Test for empty stack pop, no error
        Stack stack3 = new Stack();
        stack.pop();
    }
}


