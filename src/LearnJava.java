
public class LearnJava {
	//	Implement stack using Linked List
//	Making a node for the stack
	/*
	 * static class Node { int data; Node next;
	 * 
	 * public Node(int data) { this.data = data; next = null; } }
	 * 
	 * static class Stack { static Node head;
	 * 
	 * public static Boolean isEmpty() { return head == null; }
	 * 
	 * //Push Operation public static void push(int data) { Node insertnode = new
	 * Node(data); if (isEmpty()) { head = insertnode; return; } insertnode.next =
	 * head; head = insertnode; }
	 * 
	 * // Pop Operations public static int pop() { if (isEmpty()) { return -1; } int
	 * top = head.data; head = head.next; return top; }
	 * 
	 * // Peek operation public static int peek() { if (isEmpty()) { return -1; }
	 * return head.data; } }
	 */
//	IMplemnt stack using ArrayList
	static class Stack {
		static ArrayList<Integer> lst = new ArrayList<>();

		public static Boolean isEmpty() {
			return lst.size() == 0;
		}

//		Push operation
		public static void push(int data) {
			lst.add(data);
		}

//		Pop Operations
		public static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = lst.get(lst.size() - 1);
			lst.remove(lst.size() - 1);
			return top;
		}

//		Peek operations
		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			int top = lst.get(lst.size() - 1);
			return top;
		}
	}

	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(1);
		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
