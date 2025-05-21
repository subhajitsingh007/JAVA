package Queue;
class Queue{
   private int [] arr;
   private int start,end,maxsize,currsize;

   //constructor for queue
   public Queue(int maxsize){
       this.maxsize=maxsize;
       arr = new int[maxsize];
       start = -1;
       end = -1;
       currsize=0;

   }

   public void enqueue(int val){
       if(isFull()){
           System.out.println("The queue is full");
           return;
       }
       if(end==-1){
           start = 0;
           end = 0;

       }
       else{
           end = (end+1)%maxsize;

       }
       arr[end] = val;
       currsize++;

   }

   public int  dequeue(){
       if(isEmpty()){
           System.out.println("The queue is empty");
           return -1;
       }
       int removed = arr[start];
       if(currsize == 1){  // Reset when last element is dequeued
           start = -1;
           end = -1;
       }
       else{
           start = (start+1)%maxsize;
       }
       currsize--;
       return removed;

   }

   public boolean isFull(){
       return currsize==maxsize;
   }
   public boolean isEmpty(){
        return currsize==0;
   }

   public int getFront(){
       if(isEmpty()){
           System.out.println("Queue is empty");
           return -1;
       }
       return arr[start];
   }

   public int getRear(){
       if(isEmpty()){
           System.out.println("Queue is empty");
           return -1;
       }
       return arr[end];
   }

   public int size(){
       return currsize;
   }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < currsize; i++) {
            System.out.print(arr[(start + i) % maxsize] + " ");
        }
        System.out.println();
    }



}
public class QueueImplementationUsingArray {
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();

        System.out.println("Front: " + q.getFront());
        System.out.println("Rear: " + q.getRear());
        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Size: " + q.size());

    }
}
