package s11_dsa_stack_queue.practice.myQueue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    // Thêm phần tử vào cuối Queue
    public Node dequeue() {
        if(this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null) {
            this.tail = null;
        }
        return temp;
    }
    // Xóa phần tử đầu tiên của Queue
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

}
