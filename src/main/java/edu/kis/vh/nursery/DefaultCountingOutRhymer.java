package edu.kis.vh.nursery;

/**
 * Rhymer, contains array with max size 11
 */
public class DefaultCountingOutRhymer {
	final int CAPACITY = 12;
	final int EMPTY = -1;
	private final int[] numbers = new int[CAPACITY];
	public int total = -1;

	/**
	 * adds value to array numbers
	 * @param in value to add
	 */
	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * checks if array is empty
	 * @return true if array is empty
	 */
	protected boolean callCheck() {
		return total == EMPTY;
	}

	/**
	 * checks if array is full
	 * @return true if tab is full
	 */
	protected boolean isFull() {
		return total == CAPACITY-1;
	}

	/**
	 * returns last added value in array
	 * @return last value in array
	 */
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	/**
	 * return and delete last value in array
	 * @return last value in array
	 */
	protected int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}
}
