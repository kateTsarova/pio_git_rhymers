package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private IntArrayStack temp = new IntArrayStack();
	
	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().countIn(super.countOut());
		
		int ret = getTemp().countOut();
		
		while (!getTemp().callCheck())
			countIn(getTemp().countOut());
		
		return ret;
	}

	public IntArrayStack getTemp() {
		return temp;
	}
}
