public class Queue {
    
    int queue[] = new int[5];
    int front;
    int rear;
    int size;
    
    public void enQueue(int data){
       
        queue[rear] = data;
        rear++;
        size++;

    }

    public int deQueue(){

        int data = queue[front];
        front ++;
        size --;

        return data;

    }

    public boolean isEmpty(){
       return size==0;        
    }

    public boolean isFull(){
        return size==5;
    }
    
    public void show(){

        System.out.println("Elements of the queue");
        for(int i=0; i<size; i++){
          System.out.println(queue[front+i] + "");
        }

        // for (int n : queue){
        //     System.out.println(n); 
        // }
    }
}
