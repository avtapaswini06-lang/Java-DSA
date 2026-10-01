import java.util.*;
class QueueImplementation{
     int[] queue = new int[1000];
    int front = -1;
    int rear = -1;
    public void enqueue(int x) {
        // insert x into queue
        if(isFull())
        {
            System.exit(0);
        }

        rear++;
        queue[rear] = x;
    }
    public void dequeue() {
        // remove front element from queue
        if(isEmpty())
        {
            System.exit(0);
        }

        front++;
    }
    public int peek() {
        // return front element
        if(isEmpty())
        {
            System.exit(0);
        }

        return queue[front];
    }
    public int getSize() {
        // return current size of queue
        return rear - front + 1;
    }
    public boolean isEmpty() {
        // check whether queue is empty
        return front > rear;
    }
    public boolean isFull() {
        // check whether queue is full
        return rear == 999;
    }
    public static void main(String args)
    {
        QueueImplementation qImp = new QueueImplementation();
        qImp.display();
        qImp.enqueue(10);
        qImp.enqueue(30);
        qImp.enqueue(20);
        qImp.enqueue(40);
        qImp.display();
        qImp.dequeue();
        qImp.dequeue();
        qImp.enqueue(50);
        qImp.display();
        qImp.enqueue(qImp.peek());
        qImp.display();
    }
}