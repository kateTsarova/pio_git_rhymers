package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IntArrayStack;
import edu.kis.vh.nursery.container.IntContainer;

/**
 * Rhymer, contains array with max size 11
 */
public class DefaultCountingOutRhymer {
	public DefaultCountingOutRhymer(IntContainer nums) {
		this.nums = nums;
	}

	public DefaultCountingOutRhymer() {
		nums = new IntArrayStack();
	}

	public void countIn(int in) {
		nums.countIn(in);
	}

	public boolean callCheck() {
		return nums.callCheck();
	}

	public boolean isFull() {
		return nums.isFull();
	}

	public int peekaboo() {
		return nums.peekaboo();
	}

	public int countOut() {
		return nums.countOut();
	}

	IntContainer nums;
}
