import java.until.*;
Class Class Queue
{
int arr[],front,rear,cap>n1;
{
arr=new
int[n];cap=n;
front=0;
rear=-1;
n=0;
}
{
if(is empty())
{
}
system.out.println("no items in the queue,cannot delete");system.exit(1);
system.out.println("deleting"+arr[fornt]);
front=[front+1]%
cap;n1--:
}
{
system.out.println("overflow!! cannot add more values");
system.exit(1
}
system.out.println("addting"+ val )
rear=(rear+1)%cap;
arr[rear]=val;
n1++;
}
{
if(is empty())
{
system.out.println("queue empty!!cannot delete");
system.exit(1);
}
return arr[front];
}
{
return n1;\
}
{
return(size()==0);
}
public boolean is full()

{
return(size()==cap);
}
{
//create a queue of capacity 5 queue q=new queue(5);
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
system.out.println("front element is:"+q.peek());
q.dequeue();
system.out.println(front element is:+q.peek(1));
system.out.println("queue size is"+q.size(1)q.dequeue());
q.dequeue();
}
}