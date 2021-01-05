### Class 10 - Stacks and Queues

### Stack and Queue Implementation

### Challenge
- Create a Node class
  - Include properties for the value stored in the Node
  - Include pointer to the next node

- Create a Stack Class
  - Include default empty value assigned to top.
  - Write push, pop, peek, and isEmpty methods.

- Create a Queue Class
  - Include a front and back property.
  - Write enqueue, dequeue, peek, and isEmpty methods.

- Write tests to check functionality.

### Approach & Efficiency
- Begin by creating Node class to be used by both stack and queue classes. 

- Create Stack Class
  - Push Method : takes in any value as an argument and adds a new node with that value to the top of the stack.
  - Pop Method : removes the node from the top of the stack and returns it's value.
  - Peek Method : returns the value of the node from the top of the stack, without removing it from the stack.
  - isEmpty Method : returns a boolean indicating whether or not the stack is empty.

- Create Queue Class
  - Enqueue Method : takes in any value as an argument and adds a new node with that value to the back of the queue.
  - Dequeue Method : removes the node from the front of the queue, and returns it's value.
  - Peek Method : returns the value of the node from the front of the queue, without removing it from the queue.
  - isEmpty Method : returns a boolean indicating whether or not the queue is empty.
