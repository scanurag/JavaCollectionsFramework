package Queue;
class Node{
	Object data;
	Node next;
	public Node(Object data,Node next) {
		this.data=data;
		this.next=next;
	}
}
class Queue1{
	private Node first=null;
	private int count=0;
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node last=first;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new Node(e,null);
		count++;
	}
	public int size() {
		return count;
	}
	public Object poll() {
		if(size()==0) return null;
		Object data=first.data;
		first=first.next;
		count--;
		return data;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object peek() {
		if(size()==0) return null;
		return first.data;
	}
}
public class QueueAlgo {
public static void main(String[] args) {
Queue1 q=new Queue1();
q.add(20);
q.add(30);
q.add(10);
q.add(60);
while(!q.isEmpty()) {
	System.out.println(q.poll());
}
}

}
