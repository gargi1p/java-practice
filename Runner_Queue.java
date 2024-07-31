public class Runner_Queue {
    
   public static void main(String[] args) {
    
    Queue que = new Queue();
    que.enQueue(5);
    que.enQueue(52);
    que.enQueue(20);
    que.enQueue(12);
    que.enQueue(62);

    que.deQueue();
    que.show();

    System.out.println(que.isEmpty());

    System.out.println(que.isFull());
   }
}
