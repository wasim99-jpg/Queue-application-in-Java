


public class MyQueue{
    private Node front;
    private Node rear;
    private Node newNode;
    
    public MyQueue() { }
    
    public boolean isEmpty()
   { return front == null; }
   
  // Method to enqueue@insert element in the queue
     public void enqueue(Object item)
    {
        // check for queue overflow
        newNode = new Node(item);
        if(front == null)
        front = rear=newNode;
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    
   // Method to dequeue@delete element from the queue
    public Object dequeue()
    {
        //return removeFromFront();
       Object removeItem = null;

      if ( isEmpty() )
         System.out.println(" Queue is empty");

      removeItem = front.data;  // retrieve the data

      // reset the firstNode and lastNode references
      if ( front.equals( rear ) )
         front = rear = null;
      else
         front = front.next;

      return removeItem;  
    }
    
    public Object getFront()
    {
        //return getFirst();
         if (isEmpty())
                return null;
         else
         {  
                newNode = front;
                return newNode.data;
         }
    }
    
    
        //  public Object getLast()
       // {
        //return getFirst();
        
      //  }
    
   public void print()
   {
      if ( isEmpty() ) {
         System.out.println( " Queue is Empty ");
         return;
      }

      Node current = front;

      while ( current != null ) {
         System.out.print( current.data.toString() + " " );
         current = current.next;
      }

      System.out.println( "\n" );
   }
}