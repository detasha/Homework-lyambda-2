package com.company;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(listener, error, 33);
        worker.start();
    }
}
