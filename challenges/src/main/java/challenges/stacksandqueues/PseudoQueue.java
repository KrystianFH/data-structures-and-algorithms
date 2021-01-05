package challenges.stacksandqueues;

public class PseudoQueue {
    Stack inputStack = new Stack();
    Stack outputStack = new Stack();

    public void enqueue(int value){
        inputStack.push(value);
    }

    public int dequeue() throws NullPointerException{
        try {
            return outputStack.pop();
        } catch (NullPointerException e){
            stackSwap();
            return outputStack.pop();
        }
    }

    private void stackSwap() throws NullPointerException{
        inputStack.peek();

        try {
            while (true){
                outputStack.push(inputStack.pop());
            }
        } catch (NullPointerException ignored){

        }
    }
}
