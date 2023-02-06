package dsa;

public class Stack {
    int count;
    int[] elements = new int[6];

    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }

    public void push(int element) {
        elements[count] = element;
        count++;
    }

    public int pop() {
        count--;
        return elements[count];
    }

    public int peek() {
        return elements[count-1];
    }
}
