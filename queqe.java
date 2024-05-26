// question no3

class queqe {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public queqe(int k) {
        capacity = k;
        queue = new int[capacity];
        head = -1;
        tail = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % capacity;
        queue[tail] = value;
        size++;
        return true;
    }

    public boolean dequeue() {
        if (isEmpty()) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % capacity;
        }
        size--;
        return true;
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }

    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        queqe q = new queqe(3);
        System.out.println(q.enqueue(7));
        System.out.println(q.enqueue(8)); 
        System.out.println(q.enqueue(9)); 
        System.out.println(q.enqueue(10)); 
        System.out.println(q.dequeue());  
        System.out.println(q.enqueue(10)); 
        System.out.println(q.front());    
        System.out.println(q.rear());     
        System.out.println(q.isEmpty()); 
        System.out.println(q.isFull());   
    }
}