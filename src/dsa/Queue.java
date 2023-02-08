package dsa;

import java.util.Arrays;

public class Queue {
    private int numberOfElements;
    private int popCounter;
    String[] elements = new String[10];
    public boolean isEmpty() {
        if(numberOfElements == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(String item) {
        int shiftCounter = 0;
        if(numberOfElements == 10) {
            for (int i = 0; i < elements.length-1; i++) {
                if(elements[i] == null) {
                    shiftCounter++;
                }
            }
            for (int i = 0; i < elements.length-shiftCounter; i++) {
                elements[i] = elements[shiftCounter+i];
            }
            if(shiftCounter>0) {
                numberOfElements = numberOfElements - shiftCounter;
                elements[numberOfElements] = item;
                numberOfElements+=1;
            }
            else{throw new ArrayIndexOutOfBoundsException("Queue is full.");}
        }
        else {
            elements[numberOfElements] = item;
            numberOfElements+=1;}
    }

    public String dequeue() {
        String poppedItem = elements[popCounter];
        elements[popCounter] = null;
        popCounter++;
        return poppedItem;
    }

    public String peek() {
        String first_value = "";
        if (popCounter > 0 && numberOfElements < 10){first_value = elements[popCounter];}
        else first_value = elements[0];
        return first_value;
    }

    public void display() {
        System.out.println(Arrays.toString(elements));
    }

    public int size() {
        return elements.length - popCounter;
    }
}