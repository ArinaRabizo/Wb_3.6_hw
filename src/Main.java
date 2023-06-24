public class Main {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue(7);
        myPriorityQueue.enQueue(-45);
        myPriorityQueue.enQueue(1);
        myPriorityQueue.enQueue(543);
        myPriorityQueue.enQueue(56);
        myPriorityQueue.printQueue();
        myPriorityQueue.pop();
        myPriorityQueue.printQueue();
        System.out.println(myPriorityQueue.peek());
        myPriorityQueue.enQueue(1000);
        myPriorityQueue.enQueue(345);

        myPriorityQueue.printQueue();
    }
}