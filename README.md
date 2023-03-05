# Abstract Data Types
This is a repository of abstract data types for Array, Stack and Queue. In this repository I have used a C language and Java language to implement some the possible operations on Array, Stack and Queue.
# Definition for ADT
Abstract data types is a type for objects whose behavior is defined by a set of values and a set of operations.
The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented.
# Array ADT
Data structure array and the set of operations together we can call it as ADT.
Below list of some of the operations that we can perform on array.
1) Display(): To display the entire array on the screen.
2) Add(n)/Append(n): To add a particular element on the end of the array.
3) Insert(index, n): To add an element to a particular index.
4) Delete(index): To delete an element with the help of an index in the given array.
5) Search(n): To check whether the given element is present or not in an array.
6) Get(index): It will return the element which is present on the given index.
7) Set(index, x): It will change the element with the new element at a particular index.
8) Max()/Min(): These functions will return the maximum and minimum element in the given array.
9) Reverse(): It will reverse the order of elements in the given array.
10) Shift(): It will shift the whole elements either on the left or right side by the given number.
# Stack ADT
In stack ADT implementation, instead of data being stored in each node, the pointer to data is stored.
The program allocates memory for the data and address is passed to the stack ADT.
The head node and the data nodes are encapsulated in the ADT. The calling function can only see the pointer to the stack.
The stack head structure also contains a pointer to top and count of number of entries currently in stack.
1) Push(): Insert and element at one and of the stack if it is not empty.
2) Pop(): Remove and return the element at the top of the stack if it is not empty.
3) Peek(): Return the element at the top of the stack without removing it, if  the stack is not empty.
4) Size(): Return the number of elements in the stack.
5) IsEmpty(): Return true if the stack is empty, otherwise return false.
6) IsFull(): Return true if the stack is full, otherwise return false.
# Queue ADT
The queue abstract data type follows the basic design of the stack abstract data type.
Each node contains a void pointer to the data and the link pointer to the next element in the queue.
The program's responsibility is to allocate memory for storing the data.
1) Enqueue(): Insert an element at the end of the queue.
2) Dequeue(): Remove and return the first element of the queue, if the queue is not empty.
3) Peek(): Return the element of the queue without removing it, if the queue is not empty.
4) Size(): Return the number of elements in the queue.
5) IsEmpty(): Return true if the stack is empty, otherwise return false.
6) IsFull(): Return true if the stack is full, otherwise return false.
