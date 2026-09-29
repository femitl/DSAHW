import java.util.ArrayList;
 
public class Main {
 
    public static void main(String[] args) {
 
        // --------------------
        // Stack
        // --------------------
        System.out.println("STACK DEMONSTRATION");
 
        Stack stack = new Stack();
 
        System.out.println("Adding:");
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        System.out.println("15 25 35 45 55");
 
        System.out.println("Top item:");
        System.out.println(stack.peek());
 
        System.out.println("Removing:");
        System.out.println(stack.pop());
 
        System.out.println("Removing:");
        System.out.println(stack.pop());
 
        System.out.println("New top:");
        System.out.println(stack.peek());
 
        System.out.println("Is Stack empty?");
        System.out.println(stack.isEmpty());
 
        // --------------------
        // Queue
        // --------------------
        System.out.println("\nQUEUE DEMONSTRATION");
 
        Queue queue = new Queue();
 
        System.out.println("Adding:");
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);
        System.out.println("15 25 35 45 55");
 
        System.out.println("Front item:");
        System.out.println(queue.peek());
 
        System.out.println("Removing:");
        System.out.println(queue.dequeue());
 
        System.out.println("Removing:");
        System.out.println(queue.dequeue());
 
        System.out.println("New front:");
        System.out.println(queue.peek());
 
        System.out.println("Is Queue empty?");
        System.out.println(queue.isEmpty());
    }
}
 
// --------------------
// Stack ADT
// --------------------
// Follows LIFO: Last In, First Out.
// The most recently added item is the first one removed.
class Stack {
 
    private ArrayList<Integer> items = new ArrayList<>();
 
    // Adds a new item to the top of the Stack
    public void push(int value) {
        items.add(value);
    }
 
    // Removes and returns the most recently added item
    public int pop() {
        int topItem = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return topItem;
    }
 
    // Returns the top item without removing it
    public int peek() {
        return items.get(items.size() - 1);
    }
 
    // Returns whether the Stack currently contains any items
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
 
// --------------------
// Queue ADT
// --------------------
// Follows FIFO: First In, First Out.
// The first item added is the first one removed.
class Queue {
 
    private ArrayList<Integer> items = new ArrayList<>();
 
    // Adds an item to the back of the Queue
    public void enqueue(int value) {
        items.add(value);
    }
 
    // Removes and returns the item at the front of the Queue
    public int dequeue() {
        int frontItem = items.get(0);
        items.remove(0);
        return frontItem;
    }
 
    // Returns the item at the front without removing it
    public int peek() {
        return items.get(0);
    }
 
    // Returns whether the Queue currently contains any items
    public boolean isEmpty() {
        return items.isEmpty();
    }
}