ADT Questions

Q1: ADT stands for Abstract Data Type.

Q2: An Abstract Data Type describes what a data structure does and what operations it should support without explaining how it is implemented.

Q3: An ADT describes WHAT a structure does (its behavior and rules, like "push adds to the top"). The implementation describes HOW that behavior is actually built in code (an array, a linked list, etc.).

Q4: Yes. Two programmers can implement the same ADT in completely different ways — one might use an array, another a linked list — as long as both follow the same rules (e.g., both are LIFO for a Stack).

Q5: Yes, both are still Stacks. What makes something a Stack isn't the underlying data structure, it's whether it follows LIFO behavior through push, pop, peek, and isEmpty. The array and the linked list versions both satisfy that behavior, so both qualify as valid Stack implementations.

Stack Questions

Q6: LIFO means Last In, First Out — the most recently added item is the first one removed.

Q7: 55 was the last value pushed onto the Stack, and Stacks always remove the most recently added item first, so 55 comes out before 15, which was pushed first and sits at the bottom.

Q8: pop() removes D, since D was added last.

Q9: A browser's Back button is a good example of a Stack. Each page you visit can be added to a history stack. When you click Back, the most recently visited page is removed from the stack, and the previous page becomes the page you return to. This follows LIFO behavior.

Queue Questions

Q10: FIFO means First In, First Out — the first item added is the first one removed.

Q11: 15 was added first, so it is removed first because a Queue follows FIFO.

Q12: Alex should leave the Queue first, since he entered the line first.

Q13: A printer queue is a good example. The first document sent to the printer is normally printed first, while the other documents wait in line. This follows FIFO behavior.

Stack vs Queue Scenarios

Scenario 1 (Undo): Stack. The most recent action needs to be undone first, which is LIFO behavior.

Scenario 2 (Printer): Queue. The first document submitted should print first, which is FIFO behavior.

Scenario 3 (Browser Back): Clicking Back should show Amazon first (the last page visited). This resembles a Stack, since the most recently visited page is removed/shown first.

Scenario 4 (Customer Service): Queue. The customer who arrived first should be helped fxirst, which is FIFO behavior.

Scenario 5 (Plates): This represents a Stack. You can only add or remove a plate from the top, and the last plate placed on top is the first one removed — classic LIFO.

Predict the Output

Stack: push(7), push(12), push(18), pop(), push(22), peek()

Q14: pop() returns 18 (the most recently pushed item at that point).

Q15: After popping 18 and pushing 22, the Stack (bottom to top) is 7, 12, 22. Final peek() returns 22.

Queue: enqueue(7), enqueue(12), enqueue(18), dequeue(), enqueue(22), peek()

Q16: dequeue() returns 7 (the first item enqueued).

Q17: After dequeuing 7 and enqueuing 22, the Queue (front to back) is 12, 18, 22. Final peek() returns 12.

<img width="1068" height="220" alt="Screenshot 2026-09-28 at 10 31 20 PM" src="https://github.com/user-attachments/assets/a8c069bf-9d9f-43a9-b52f-fdc4fdd596d5" />


Q18: The ADT is the set of operations and rules — push(), pop(), peek(), isEmpty(), and the guarantee that it behaves as LIFO.

Q19: The implementation is the array and the code that uses the array to implement the Stack's operations, such as push(), pop(), peek(), and isEmpty().

Q20: No, the ADT does not change. Replacing the array with a linked list only changes how the Stack is implemented. It is still a Stack as long as it follows the same LIFO rules and operations.
