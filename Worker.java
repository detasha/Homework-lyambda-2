package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    private int errorNumber;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int errorNumber) {
        this.callback = callback;
        this.errorCallback = errorCallback;
        this.errorNumber = errorNumber;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == errorNumber) {
                errorCallback.onError( "Task " + i + " is error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}