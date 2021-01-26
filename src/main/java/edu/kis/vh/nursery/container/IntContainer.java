package edu.kis.vh.nursery.container;

public interface IntContainer {
    static final int RETVAL = 0;
    public boolean isFull();
    public boolean callCheck();
    public void countIn(int in);
    public int peekaboo();
    public int countOut();
}
