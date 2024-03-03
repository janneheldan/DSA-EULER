package DataStructures.StacksandQueues;

import java.util.NoSuchElementException;

/**
 * GENERIC CIRCULAR QUEUE 
 */
public class CircularQueue <T> {
    private T[] queue;
    private int frontPointer;
    private int rearPointer;


    @SuppressWarnings("unchecked")
    public CircularQueue(int size) {
        queue = (T[]) new Object[size];
        frontPointer = -1;
        rearPointer = -1;
    }

    public void enqueue(T item) {
        if (isFull()) {
            throw new ArrayStoreException("Queue is full"); 
        }
        if (isEmpty()) {
            frontPointer = 0;
        }
        rearPointer = (rearPointer + 1) % queue.length;
        queue[rearPointer] = item;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        if (frontPointer == rearPointer) {
            frontPointer = -1;
            rearPointer = -1;
        } else {
            frontPointer = (frontPointer + 1) % queue.length;
        }
    }

    public boolean isEmpty() {
        return frontPointer == -1 && rearPointer == -1;
    }

    public boolean isFull() {
        return (rearPointer + 1) % queue.length == frontPointer; 
    }

    public T front() {
        if (isEmpty()) {
            return null;
        }
        return queue[frontPointer];
    }

    public T rear() {
        if (isEmpty()) {
            return null;
        }
        return queue[rearPointer];
    }
}

