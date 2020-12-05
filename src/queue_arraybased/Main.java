
package queue_arraybased;


public class Main {

    
    public static void main(String[] args)
    {
        
        Queue obj = new Queue(50);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(4);
        //obj.dequeue();
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);

        //System.out.println( obj.getRear());
        //System.out.println("Found in index number " +  obj.search(3)  ); /* TODO : Some Bugs */
        //System.out.println("Found in index number " +  obj.search(5)  );

        obj.printQueue();
        obj.enqueue(66);
        obj.printQueue();


    }
    
}
