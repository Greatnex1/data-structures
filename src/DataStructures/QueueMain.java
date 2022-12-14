package DataStructures;

public class QueueMain {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
    QueueMain(){
        front = -1;
        rear = -1;

    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }


    boolean isEmpty(){
        if(front == -1)
            return true;
        else
            return false;
    }
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front++;
            }
            System.out.println("Deleted -> " + element);
            return (element);
        }
    }
        void display() {
        int j;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront Index -> " + front);
            System.out.println("Items ->");
            for (j = front; j <= rear; j++)
                System.out.println(items[j] + " ");
                System.out.println("\nRear index -> " + rear);
            }
        }
    public static void main(String[] args) {
//        Queues que = new Queues();
//        que.add("Willie");
//        que.add("Wiz");
//        que.add("Wendy");

        QueueMain que = new QueueMain();
        que.enQueue(1);
        que.enQueue(2);
        que.enQueue(3);
        que.display();

    }

    }

