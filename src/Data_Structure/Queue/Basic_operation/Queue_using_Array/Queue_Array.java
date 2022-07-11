package Data_Structure.Queue.Basic_operation.Queue_using_Array;


import java.util.Scanner;

class Queue {
    private int front;
    private int rear;
    private int n;
    private int arr[];

    public Queue(int size) {
        this.n = size;
        arr = new int[n];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty() {
        return (rear == -1 && front == -1);
    }
    public boolean isFull() {
        return (rear == n - 1);
    }
    public int count() {
        return rear - front + 1;
    }
    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue  is Full");
            return;
        }
        else if (front == -1) {
            front = rear = 0;
        }
        else {
            rear++;
        }
        arr[rear] = val;
    }


    public void viewQ() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -999;
        }
        return arr[front];
    }

}

public class Queue_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);

        boolean f = true;
        int val = 0;
        while (f) {

            System.out.println("1. Enqueue()");
            System.out.println("2. Current Size of Queue");
            System.out.println("3. Peek()");
            System.out.println("4. View queue");
            System.out.println("5. Exit");

            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter value: ");
                    val = sc.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    System.out.println(q.count());
                    break;

                case 3:
                    System.out.println(q.peek());
                    break;

                case 4:
                    q.viewQ();
                    break;

                case 5:
                    f = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }// switch
            System.out.println();
        } // while

    }
}
