/*Conor Sweeney
 * cjs2201
 *Program2.java
*/

//class program2
//used to test TwoStackQueue
//simply adds strings to the TwoStackQueue instance and prints out the dequeue method
//proving that it is popping it in the same order that it is added
//can be used with any value type

public class Program2 {
	
	//declare stack size for this instance
	private static int stackSizeInQueue = 4;
	
	//run method
	public static void main(String [ ] args){
		
		//declare TwoStackQueue instance
		TwoStackQueue<String> myQueue = new TwoStackQueue<String>(stackSizeInQueue);
		
		//enqueue strings to this instance
		myQueue.enqueue("This");
		myQueue.enqueue("Homework");
		myQueue.enqueue("is");
		myQueue.enqueue("perfect");
		
		//dequeue strings from myQueue instance and print results
		//run through a for loop the size of the stacks
		for(int i = 0;i<stackSizeInQueue;i++){
			System.out.println(myQueue.dequeue());
		}
	}
}
