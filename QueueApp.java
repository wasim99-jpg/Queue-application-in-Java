
/**
 * Write a description of class QueueApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class QueueApp
{
    public static void main( String args[] )
    {
        MyQueue qList = new MyQueue();  // Step 1: create the queue object
        Scanner in = new Scanner (System.in);

        // Step 2: Input data for object
        String name;
        int prt, num,stuId;;
        double score;
        
        System.out.println(" How many students? ");
        num = in.nextInt();
            
        for (int i = 0; i < num; i++)
        {
            System.out.println(" Enter name:");
            name = in.next();
            System.out.println(" Enter id:");
            stuId= in.nextInt();
            System.out.println(" Enter part:");
            prt = in.nextInt();
            System.out.println(" Enter score:");
            score = in.nextDouble();
             
            // Step 3: Create and store data into object
            Student stud = new Student (name, stuId, prt, score);
       
            // Step 4: insert object at front into linked list
            qList.enqueue(stud);
        }
            qList.print(); // display the elements in the list
            
            // Find the total score
             double sum = 0;
             Student obj;
           while (!qList.isEmpty())
           {
                 obj = (Student)qList.dequeue();
                 sum += obj.getScore();  
           }   
           System.out.println ("Total score " + sum );
           
          // Complete the exercises
          // Find the highest and lowest score in the queue
            double highest=0,lowest=0;
           while (!qList.isEmpty())
           {
            obj = (Student)qList.dequeue();
                 if(highest < obj.getScore())
            
                    highest = obj.getScore();
            
                else if(lowest > obj.getScore())
                    lowest = obj.getScore();
            }
                
           System.out.println ("highest score " + highest );
           System.out.println ("lowest " + lowest );
           
          // Calculate how many students earned score above 80
          int count=0;
          while (!qList.isEmpty())
           {
            obj = (Student)qList.dequeue();
                 if(obj.getScore()>80)
                    count++;
            
            }
           System.out.println ("there are " + count + " students achieve score above 80" );
                              
}
}
