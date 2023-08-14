package LinkedList;
class Node
{
	Object data;
	Node next;
	Node (Object data,Node next){
		this.data=data;
		this.next=next;
	}
}
class LinkedList{
	private Node first=null;
	private int count=0;
	public void add(Object e) {
		if(first == null) {
			first=new Node(e,null);
			count++;
			return;
			}
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
		}
	public void add(int index,Object e) {
		if(index <=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first = new Node(e,first);
			count++;
			return;
		}
		Node 
		curr=first;
		for(int i=1; i<index;i++)
		{//1->2->m3->9->12->4
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
				count++;
	}
	public void remove(int index)
	{
		if(index <=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index) {
		if(index <=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.data;
	}
	public void reverse() {
	Node prev=null;
	Node curr=first;
	Node next=null;
	while(curr!=null)
	{
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
		first=prev;
	}
}
public class SinglyLinkedList {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(20);
	l.add(30);
	l.add(1,03);
	l.reverse();
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	//l.reverse();
}
}
