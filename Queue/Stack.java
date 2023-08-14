package Queue;
class Node2{
	Object data;
	Node2 next;
	public Node2(Object data) {
		this.data=data;
		next=null;
	}
}
class Stack1{
	private Node2 first;
	public void push(Object e) {
		Node2 temp=new Node2(e);
		if(isEmpty()) {
			first=temp;
			return;
		}
		temp.next=first;
		first=temp;
	}
	public boolean isEmpty() {
		return first==null;
	}

	public Object Pop() {
		if(isEmpty()) return -1;
		Object data=first.data;
		first=first.next;
		return data;
	}
	public Object Peek() {
		if(isEmpty()) return -1;
		return first.data;
	}
}

public class Stack {
public static void main(String[] args) {
	Stack1 s=new Stack1();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	while(!s.isEmpty()) {
		System.out.println(s.Peek());
		s.Pop();
	}
}
}
