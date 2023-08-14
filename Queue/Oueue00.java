package Queue;
 class Node54{
	 Object data;
	 Node54 next;
	 public Node54(Object data) {
		 this.data=data;
	 }
 }
class OueueKJ{
private Node54 first=null;
 public void push(Object e) {
	 Node54 temp=new Node54(e);
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
 public Object poll() {
	 if(isEmpty()) return null;
	 Object data=first.data;
	 first=first.next;
	 return data;
 }
 public Object peek() {
	 if(isEmpty()) return null;
	 return first.data;
 }
}
 
public class Oueue00 {
public static void main(String[] args) {
	OueueKJ  k=new OueueKJ();
	k.push(9);
	k.push(8);
	k.push(7);
	k.push(10);
	
	while(!k.isEmpty()) {
		System.out.println(k.peek());
		k.poll();
		
		
	}
	
	
	
	
}
}
