package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	final int CAPACITY = 12;
	final int EMPTY = -1;
	private final int[] numbers = new int[CAPACITY];
	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == EMPTY;
		}
		
			public boolean isFull() {
				return total == CAPACITY-1;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return -1;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return -1;
						return numbers[total--];
					}

}
