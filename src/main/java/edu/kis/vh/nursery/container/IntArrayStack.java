package edu.kis.vh.nursery.container;

public class IntArrayStack implements IntContainer {
    final int CAPACITY = 12;
    final int EMPTY = -1;
    private final int[] numbers = new int[CAPACITY];
    public int total = -1;

    /**
     * adds value to array numbers
     * @param in value to add
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * checks if array is empty
     * @return true if array is empty
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * checks if array is full
     * @return true if tab is full
     */
    public boolean isFull() {
        return total == CAPACITY-1;
    }

    /**
     * returns last added value in array
     * @return last value in array
     */
    public int peekaboo() {
        if (callCheck())
            return RETVAL;
        return numbers[total];
    }

    /**
     * return and delete last value in array
     * @return last value in array
     */
    public int countOut() {
        if (callCheck())
            return RETVAL;
        return numbers[total--];
    }
}
