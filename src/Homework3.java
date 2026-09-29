import java.util.ArrayList;


public class Homework3 {


/*

    PART 2 ANSWERS


    Question 1
    ADT stands for Abstract Data Type.

    Question 2
    An Abstract Data Type describes what a data structure does, not how
    it is built.

    Question 3
    The ADT is the WHAT, meaning the operations and rules. The
    implementation is the HOW, meaning the code that makes them work.

    Question 4
    Yes. Two programmers can write different code for the same ADT as
    long as the operations behave the same way.

    Question 5
    Yes, both are still Stacks. A Stack is defined by its behavior, not
    by how it stores the data.
    */

    /*

     PART 3 INFO

     A Stack follows LIFO, which means Last In, First Out. Like a stack
     of plates, the last plate placed on top is the first one removed.

   */



// PART 4 CODE
class Stack {
    private ArrayList<Integer> items;

    public Stack() {
        items = new ArrayList<Integer>();
    }

    public void push(int item) {
        items.add(item);
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        return items.remove(items.size() - 1);
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }
}

// PART 5,6, 7 CODE
static void stackDemonstration() {
    // Part 5
    Stack stack = new Stack();
    int[] stackValues = {15, 25, 35, 45, 55};

    System.out.println("STACK DEMONSTRATION");
    System.out.println();
    System.out.println("Adding");

    for (int index = 0; index < stackValues.length; index++) {
        int value = stackValues[index];
        stack.push(value);
        System.out.println(value);
    }

    // Part 6
    System.out.println();
    System.out.println("Top item");
    System.out.println(stack.peek());

    System.out.println();
    System.out.println("Removing");
    System.out.println(stack.pop());

    System.out.println();
    System.out.println("Removing");
    System.out.println(stack.pop());

    System.out.println();
    System.out.println("New top");
    System.out.println(stack.peek());

    System.out.println();
    System.out.println("Is Stack empty?");
    System.out.println(stack.isEmpty());
}

      /*

    PART 8 ANSWERS


    Question 6
    LIFO means Last In, First Out.

    Question 7
    55 was added after 15, so it was on top and came off first.

    Question 8
    D is removed first because it was added last.

    Question 9
    Undo in a text editor is one example. The newest change is on top of
    the stack, so undo removes it first.
    */


     /*

    PART 9 INFO


    A Queue follows FIFO, which means First In, First Out. Like people
    standing in line, the first person to arrive is the first one served.


    */

     /*
    Part 10 Code
    */

    static class Queue {
        private ArrayList<Integer> items;

        public Queue() {
            items = new ArrayList<Integer>();
        }

        public void enqueue(int item) {
            items.add(item);
        }

        public Integer dequeue() {
            if (isEmpty()) {
                return null;
            }
            return items.remove(0);
        }

        public Integer peek() {
            if (isEmpty()) {
                return null;
            }
            return items.get(0);
        }

        public boolean isEmpty() {
            return items.size() == 0;
        }

        public int size() {
            return items.size();
        }
    }


    /*

    PART 11, 12 AND 13 CODE

    */

    static void queueDemonstration() {
        /* Part 11 */
        Queue queue = new Queue();
        int[] queueValues = {15, 25, 35, 45, 55};

        System.out.println("QUEUE DEMONSTRATION");
        System.out.println();
        System.out.println("Adding");

        for (int index = 0; index < queueValues.length; index++) {
            int value = queueValues[index];
            queue.enqueue(value);
            System.out.println(value);
        }

        /* Part 12 */
        System.out.println();
        System.out.println("Front item");
        System.out.println(queue.peek());

        System.out.println();
        System.out.println("Removing");
        System.out.println(queue.dequeue());

        System.out.println();
        System.out.println("Removing");
        System.out.println(queue.dequeue());

        System.out.println();
        System.out.println("New front");
        System.out.println(queue.peek());

        System.out.println();
        System.out.println("Is Queue empty?");
        System.out.println(queue.isEmpty());
    }


    /*

    PART 14 ANSWERS


    Question 10
    FIFO means First In, First Out.

    Question 11
    15 was added first, so it was at the front and left first.

    Question 12
    Alex leaves first because Alex entered the line first.

    Question 13
    A printer is one example. Documents print in the order they were
    sent, so the first one submitted prints first.
    */

    /*

    PART 15 ANSWERS


    Scenario 1
    Stack. The most recent action is undone first.

    Scenario 2
    Queue. The first document submitted prints first.

    Scenario 3
    Amazon appears first. This resembles a Stack.

    Scenario 4
    Queue. The first customer to arrive is helped first.

    Scenario 5
    Stack. Plates are added and removed from the top only.
    */

    /*

    PART 16 ANSWERS


    Question 14
    pop() returns 18.

    Question 15
    The final peek() returns 22.

    Question 16
    dequeue() returns 7.

    Question 17
    The final peek() returns 12.
    */

    /*

    PART 18 ANSWERS


    Question 18
    The ADT is the Stack operations and the LIFO rule.

    Question 19
    The implementation is the array and the code that uses it.

    Question 20
    No, the ADT did not change. Only how the data is stored changed, and
    the operations and LIFO behavior stayed the same.
    */

/*

    PART 19 CODE


    */

    public static void main(String[] args) {
        stackDemonstration();

        System.out.println();

        queueDemonstration();

        System.out.println();
        System.out.println("Stack removed 55 and 45 first, so the Stack is LIFO.");
        System.out.println("Queue removed 15 and 25 first, so the Queue is FIFO.");
    }



}
