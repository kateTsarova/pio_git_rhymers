package edu.kis.vh.nursery;

/**
 * Rhymer, contains array with max size 11
 */
public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	public int getTotal() {
		return total;
	}

	public int[] getNumbers() {
		return numbers;
	}

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
		return total == -1;
	}

	/**
	 * checks if array is full
	 * @return true if tab is full
	 */
	protected boolean isFull() {
		return total == 11;
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
