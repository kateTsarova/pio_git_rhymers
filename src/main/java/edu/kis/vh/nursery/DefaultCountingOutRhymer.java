package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	final int size = 12;
	final int min = -1;
	private int[] numbers = new int[size];
	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == min;
		}
		
			public boolean isFull() {
				return total == size-1;
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
