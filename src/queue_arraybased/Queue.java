
package queue_arraybased;


public class Queue
{
    int rear;
    int front;
    int length;
    int max_length;
    int arr[];
    
    public Queue(int max_length)
    {
        arr = new int[max_length];
        this.max_length = max_length;
        front=0;
        rear=max_length-1;
        length=0;
    }
    
    public boolean isEmpty()
    {
        return length==0;
    }
    public boolean isFull()
    {
        return length==max_length;
    }
    
    public void enqueue(int n)
    {
        if ( !isFull() )
        {
            rear = (rear+1)%max_length ;
            arr[rear] = n ;
            length++;
        }else{System.out.println("Array is FULL");}
    }
    
    public int dequeue()
    {
        int tmp=front;
        if (!isEmpty())
        {
            front = (front+1)%max_length;
            length--;
        }else{System.out.println("Array is Empty");}
        
        return arr[tmp];
    }
    
    public int getFront()
    {
        return !isEmpty()? arr[front] : -9999999;
    }
    public int getRear()
    {
        return !isEmpty()? arr[rear] : -9999999;
    }
    
    public void printQueue()
    {
        int tmpFront=front;
        int tmpRear=rear;
        int tmpLength = length;
        while (!isEmpty())
        {
            System.out.println( dequeue() );
        }
        front=tmpFront;
        rear=tmpRear;
        length = tmpLength;
    }
    
    public int search(int d)
    {
        while(!isEmpty())
        {
            if ( d==dequeue() )
                return front;
        }
        return -99999999;
    }

    
}
