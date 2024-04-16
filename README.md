# Technical-Assessment

## 1. Explain the difference between a stack and a queue. Provide real life examples of real-life scenarios where each of them are used appropriately.

Both of them are data structures but they differ in how elements are added and removed.

### Stack
- **Definition**: A stack is a LIFO (Last In First Out) data structure. This means that the last element that is added to the stack is the first out to be removed.
- **Operations**: The operations in a stack are: Push (add an element to the top of the stack), Pop (remove and return the top element of the stack), Peek or Top (return the top element of the stack without removing it).
- **Real-life Examples**: A real-life example for a stack that comes to mind would be a train depot, where the last train that comes in the depot on the same track, would be the first that has to come out of the depot.

### Queue
- **Definition**: A queue is a FIFO (First In First Out) data structure. In a queue the first element that is added will be the first to be removed.
- **Operations**: The operations in a queue are: Enqueue (add an element to the back of the queue), Dequeue (remove and return the first element of the queue), Peek or Front (return the first element of the queue without removing it).
- **Real-life Examples**: A real-life example for a queue could be at a checkout, like at a supermarket, or at an ATM, where the first person that is standing in line would be the first person out.

## 2. What is the difference between an array and a linked list ? Provide advantages and disadvantages of each data structure.

### Array
- **Advantages**: Arrays provide an efficient random access and compact memory usage
- **Disadvantages**: Arrays have costly insertion and deletion operations (inserting/deleting elements in the middle of an array has a time complexity of O(n)), and also it is fixed in size and can be wasteful on memory if the array size is larger than needed.

### Linked List
- **Advantages**: Linked lists offer dynamic size and efficient insertion and deletion operations.
- **Disadvantages**: Linked lists don't have random access, and they require more memory to store pointers

## 3. What is HTTP? How is it different from HTTPS?

### HTTP
HTTP(Hypertext Transfer Protocol) is a protocol used for transmitting hypermedia documents, like HTML. HTTP defines how messages are formatted and transmitted, as well as how web servers and browsers should respond to various commands.

- **Difference**: The difference between HTTP and HTTPS is that HTTPS (Hypertext Transfer Protocol Secure) is a secured version of HTTP, that adds encryption to ensure that data transmitted between client and server is secure and cannot be intercepted or altered by unathorized parties.

## 4. Can you give some examples of common HTTP response codes ?
### I think that the most common HTTP response is:
- **404 Not Found**: This response code indicates that the server cannot find the requested source. It is used when the requested URL doesn't exist on the server.
### Other HTTP response codes would be:
- **500 Internal Server Error**: This indicates that something has gone wrong on the server side. It is a generic error that is used when the server encounters a condition that prevents it from fufilling the request.
- **200 OK**: is a HTTP code that indicates that the request has succeded.
- There are more such as (403 Forbidden, 401 Unauthorized, etc.)

## 5. What is the difference between authorization and authentication ?
