package com.priya.Algos;

public class CustomLinkedList {

	private class Node {
		private Node next;
		private Object data;

		Node(Object data) {
			this.next = null;
			this.data = data;
		}

		Node(Object data, Node nextNode) {
			this.next = nextNode;
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [next=" + next + ", data=" + data + "]";
		}

	}

	private static int counter;
	private Node head;

	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		}

		Node tempNode = new Node(data);
		Node nodeCurrent = head;

		if (nodeCurrent != null) {
			while (nodeCurrent.getNext() != null) {
				nodeCurrent = nodeCurrent.getNext();
			}
			nodeCurrent.setNext(tempNode);
		}
		incrementCounter();
	}

	public String toString() {

		String output = "";

		if (head != null) {
			Node nodeCurrent = head.getNext();
			while (nodeCurrent != null) {
				output += "[" + nodeCurrent.getData().toString() + "]";
				nodeCurrent = nodeCurrent.getNext();
			}

		}
		return output;
	}

	public int size() {
		return counter;
	}

	public static void incrementCounter() {
		counter++;
	}

}
