package LinkedList;
class Node2{
	Object data;
	Node2 next;
	Node2 priv;
public	Node2(Object data){
		this.data=data;
		next=null;
		priv=null;
}
}
class DLL{
	private Node2 head=null;
	private Node2 teal=null;
	int count=0;
	public int size() {
		return count;
	}
	public void add1st(Object data) {
		Node2 newNode = new Node2(data);
		if(head==null) {
		head=newNode;
		teal=newNode;
			}
		else {
			newNode.next=head;
			head.priv=newNode;
			head=newNode;
			}
	}
	public void addlast(Object data) {
		Node2 newNode=new Node2(data);
		if(teal==null) {
			head=newNode;
			teal=newNode;
		}
		else {
			newNode.next=teal;
			teal.priv=newNode;
			teal=newNode;
		}
		count++;
	}
	public void getF()
	{
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		else {
			System.out.println("Forward traversl");
			Node2 currentNode = head;
			while(currentNode != null) {
				System.out.println(currentNode.data+ " ");
				currentNode=currentNode.next;
			}
		}
	}
	public void getB() {
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		else {
			System.out.println("Backward traversal");
			Node2 currentNode =teal;
			while(currentNode != null) {
				System.out.println(currentNode.data+" ");
				currentNode =currentNode.priv;
			}
		}
	}
	public boolean remove(Object data) {
		if(head == null) {
			return false;
		}
		if(head.data==data) {
			if(head==teal) {
				head=null;
				teal=null;
			}
		
		else {
			head=head.next;
			head.priv=null;
		}
		count--;
		return true;
	}
		Node2 currentNode = head.next;
		while(currentNode !=null && currentNode !=teal ) {
			if ((boolean) (currentNode.data=data)) {
				currentNode.priv.next=currentNode.next;
				currentNode.next.priv=currentNode.priv;
				count--;
				return true;
			}
			currentNode=currentNode.next;  
		}
		if(teal.data==data) {
			teal=teal.priv;
			teal.next=null;
			count--;
			return true;
		}
	return false;
	}
}

public class DoublyLinkdList {
public static void main(String[] args) {
	DLL list=new DLL();
	list.add1st(03);
	list.add1st(22);
	list.add1st(7);
	list.add1st(11);
	list.getF();
	list.getB();
}
}
