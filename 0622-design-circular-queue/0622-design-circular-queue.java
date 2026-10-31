class MyCircularQueue {
    private final int[] queue;
    private int front;
    private int size;
    private final int capacity;

    /** Initializes the object with the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.front = 0;
        this.size = 0;
    }
    
    /** Inserts an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        // Calculate the insertion index using modulo arithmetic based on current size
        int rearIndex = (front + size) % capacity;
        queue[rearIndex] = value;
        size++;
        return true;
    }
    
    /** Deletes an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        // Shift front pointer forward circularly
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    /** Gets the front item from the queue. If the queue is empty, return -1. */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    
    /** Gets the last item from the queue. If the queue is empty, return -1. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        // Target index is the last element inserted relative to front
        int rearIndex = (front + size - 1) % capacity;
        return queue[rearIndex];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == capacity;
    }
}
