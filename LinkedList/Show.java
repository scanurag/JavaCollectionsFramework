package LinkedList;
class Node1{
	Object data;
	Node1 next;
  Node1(Object data,Node1 next) {
		this.data=data;
		this.next=next;
	}
}
class LinkdIn{
		private Node1 first=null;
		private int count=0;
		public void add(Object e) {
			if(first==null) {
				first=new Node1(e,null);
				count++;
				return;
			}
			Node1 curr=first;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=new Node1(e,null);
			count++;
		}
		public int size() {
			return count;
		}
		public Object get(int index) {
			if(index<=-1||index>=size()) {
				throw new IndexOutOfBoundsException();
			}
			Node1 curr=first;
			for(int i=1;i<=index;i++) {
				curr=curr.next;
			}
			return curr.data;
		}
		public void addAll(Object e,int index) {
			if(index <=-1||index>=size()) {
				throw new IndexOutOfBoundsException();
				}
			if(index==0) {
				first=new Node1(e,first);
				count++;
				return;
			}
			Node1 curr=first;
			for(int i=1;i<index;i++) {
				curr=curr.next;
			}
			curr.next=new Node1(e,curr.next);
			count++;
		}
		public void remove(int index) {
			if(index<=-1||index>=size()) {
				throw new IndexOutOfBoundsException(); 
			}
			if(index==0) {
				first=first.next;
				count--;
				return;
			}
			Node1 curr=first;
			for(int i=1; i<index;i++) {
				curr=curr.next;
			}
			curr.next=curr.next.next;
			count--;
		}
	
}
public class Show {
public static void main(String[] args) {
	LinkdIn dk=new LinkdIn();
	dk.add(10);
	dk.add(13);
	dk.add(90);
	dk.add(12);
	dk.addAll(7,3);
	dk.remove(4);
	for(int i=0;i<dk.size();i++) {
		System.out.println(dk.get(i));
	}
}
}
