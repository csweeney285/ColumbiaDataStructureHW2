Conor Sweeney
cjs2201
READ ME

1. Palindrome Detector:

The Palindrome detector utilizes a custom MyStack class which has custom push, pop, peek, isEmpty, isFull functions.

The MyStack class is generic. It accepts an AnyType value. When using the Palindrome detector it uses Characters.

The palindromes have been saved on the palindromes.txt file which is included in the java file.

I created a FindPalindromes class which calls itself. In order to run the program, the user simply has to hit the run button. All these programs were written using Eclipse.

FindPalindromes.java uses a scanner to scan the palindromes.txt file and convert it into strings. This is done within a While loop which runs as long as the scanner has a next line. The line is converted into a string which is then converted into another string without punctuation. This original string is saved so that it can be printed out later.

This is where the MyStack.java class is called. A stack the size of the string is created. Each character within the string is pushed into the stack.  A reverse string is now created outside of the ensuing loop which pops the stack. As the stack pops each character is added to the reverse string.

When this is completed the string without punctuation and the its reverse are compared. Depending on if they are equal or not the original string with punctuation is printed stating whether or not they are palindromes.

2. Two Stack Queue

A. Creates a custom class called TwoStackQueue. This class uses an inbox stack and outbox stack created by my custom MyStack class to receive data and reorder it back to the order that it was received. This class,like MyStack works with AnyType.

Since my MyStack class does not resize the array and requires an integer input to create its array, the TwoStackQueue also needs an integer input to do this for its two stacks. Both stacks are equal size so only one integer is needed.

This class has two methods, an enqueue and a dequeue. The enqueue pushes an object to the inbox stack and the dequeue pushes the entire inbox stack to the outbox stack and reorders it back into the order that it was received. So now that when it is popped it pops in that order and pops the first item. Then each time after only pops the next item.

B. In a custom Program2 class, the TwoStackQueue is tested. In my example a TwoStackQueue is declared with stacks with arrays the size of 4. 4 strings are enqueued to myQueue and then dequeued. The dequeued is ran through a for loop that runs through the size of the stacks and prints the values.

The values are returned and printed in the order that they were enqueued and prints it.

