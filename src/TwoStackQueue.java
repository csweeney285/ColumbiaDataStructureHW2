/*Conor Sweeney
 * cjs2201
 *TwoStackQueue.java
*/

//create custom TwoStackQueue class
//class uses inbox stack to receive data and outbox to reorder it and pop it
//class works with AnyType

public class TwoStackQueue<AnyType> {
	
	//declare variables
    public Integer size;
	public MyStack<AnyType> inbox;
    public MyStack<AnyType> outbox;

    //create instance of TwoStackQueue
    //requires user to input size of the stacks
    //stack size is the same for both stacks
    public TwoStackQueue(int stackSize){
    	this.size = stackSize;
    	inbox = new MyStack<AnyType>(size);
        outbox = new MyStack<AnyType>(size);
    }
    
    //enqueue method
    //this pushes the item to the inbox stack
    public void enqueue(AnyType item) {
        inbox.push(item);
    }

    //dequeue method
    //this pushes the entire inbox to the outbox and pops each instance
    //this reorders the stack to the order in which it was added to the inbox
    public AnyType dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
               outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
}
