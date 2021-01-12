package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0; // changed

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) // changed
			totalRejected++;
		else // changed
			super.countIn(in); // changed
	}
}
