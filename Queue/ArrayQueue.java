package Queue;
class QueueA{
	private Object[] a=new Object[5];
	private int p=0;
	public void add(Object e) {
		if(p>a.length) increase();
		a[p++]=e;
	}
	public int size() {
		return p;
	}
	private void increase() {
		Object[] temp=new Object[a.length+3];
		for(int i=0; i<a.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public Object Poll() {
		if(size()==0) return null;
		Object ele=a[0];
		for(int i=1;i<size();i++) {//{9,1,5,8,2}
			a[i-1]=a[i];
			p--;
			a[p]=null;
		}
		return ele;
	}
	public Object Peek() {
		if(size()==0) return null;
		return a[0];
	}
}
public class ArrayQueue {
public static void main(String[] args) {
	Queue1 q=new Queue1();
	q.add(20);
	q.add(30);
	q.add(10);
	q.add(60);

	while(!q.isEmpty()) {
		System.out.println(q.peek());
	}
}
}
