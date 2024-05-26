public class Question3 {
    public static class CircularQueue {
        private int[] data;
        private int head;
        private int tail;
        private int size;
        private int capacity;

        public CircularQueue(int k) {
            data = new int[k];
            head = -1;
            tail = -1;
            size = 0;
            capacity = k;
        }

        public boolean enqueue(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                head = 0;
            }
            tail = (tail + 1) % capacity;
            data[tail] = value;
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
                return -1;
            }
            return data[head];
        }

        public int rear() {
            if (isEmpty()) {
                return -1;
            }
            return data[tail];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public static void main (String[] args) {
            CircularQueue q = new CircularQueue(3);
            System.out.println(q.enqueue(1)); // true
            System.out.println(q.enqueue(2)); // true
            System.out.println(q.enqueue(3)); // true
            System.out.println(q.dequeue());  // true
            System.out.println(q.enqueue(4)); // true
            System.out.println(q.front());    // 2
            System.out.println(q.rear());     // 4
        }
    }

}
