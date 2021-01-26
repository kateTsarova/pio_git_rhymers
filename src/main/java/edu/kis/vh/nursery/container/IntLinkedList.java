package edu.kis.vh.nursery.container;

final class Node {
	private int value;
	public Node prev, next;

	public Node(int i) {
		setValue(i);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class IntLinkedList implements IntContainer{

	Node last;
	int i;

	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean callCheck() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peekaboo() {
		if (callCheck())
			return RETVAL;
		return last.getValue();
	}

	public int countOut() {
		if (callCheck())
			return RETVAL;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

}
