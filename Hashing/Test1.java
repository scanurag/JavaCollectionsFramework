package Hashing;
class Node{
	Object key;
	Node next;
	public Node(Object key,Node next) {
		this.key=key;
		this.next=next;
	}
}
class Set{
	private Node[] a=new Node[10];
	private int count=0;
	public boolean add(Object key ) {
		int index=Math.abs(key.hashCode())%a.length;
		if(a[index]==null) {
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null) {
			if(key==curr.key) return false;
			prev=curr;
			curr=curr.next;
 		}
		prev.next=new Node(key,null);
		count++;
		return true;
	}
	public int Size() {
		return count;
	}
	public void Display(){
		for(int i=0; i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
			System.out.println(curr.key);
			curr=curr.next;
			}
		}
		
	}
}
public class Test1 {
public static void main(String[] args) {
	Set s=new Set();
	System.out.println(s.add(46));
	System.out.println(s.add(52));
	System.out.println(s.add(46));
	System.out.println(s.add(22));
	System.out.println("Size"+s.Size());
	s.Display();
}
}

