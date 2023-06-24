public class MyPriorityQueue { // для приоритетной очереди нужно
    // добавить сортировку между front и rear - элементы
    // между front и rear должны быть в порядке возрастания
    private int CAPACITY;
    private int[] queue;
    int front, rear;

    public MyPriorityQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.queue = new int[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }

    public void enQueue(int element) {
        if (rear + 1 == CAPACITY) {
            System.out.println("Queue is full!");
            System.exit(1);
        }
        if (front == -1) {
            front++;
        }
        rear++;
        queue[rear] = element;
        if (rear != 0) {
            int i = rear;
            while (i != front) {
                if (queue[i] > queue[i-1]) {
                    int temp = queue[i];
                    queue[i] = queue[i-1];
                    queue[i-1] = temp;
                }
                i--;
            }
        }
        // тут нужно сделать сортировку
    }

    public int peek() {

        if (front == -1) {
            System.out.println("Queue is empty!");
            System.exit(2);
        }
        return queue[front];
    }

    public void pop() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            System.exit(2);
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }

    public void printQueue() {

        if (front == -1) {
            System.out.println("Queue is empty!");
        } else {

            System.out.print("[");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + ", ");
            }
            System.out.println(queue[rear] + "]");
        }
    }
}
