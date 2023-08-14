package ArrayList;
class ArrayList22{
	private Object[] a;
	private int count;
	public ArrayList22() {
		a=new Object[5];
		count=0;
	}
	public void add(Object data) {
		if(count >=a.length) incSize();
		a[count++]=data;
	}
	public void incSize() {
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public int size() {
		return count;
	}
	public void addAll(int index,Object data) {
		if(index <= -1 || index>=size()) {
			System.out.println("index out of bound");
		}
		if(count >= a.length) incSize();
		for(int i=size();i>=index;i--) {
			a[i]=a[i-1];
		}
		a[index]=data;
		count++;
	}
	public void remove(int index) {
		if(index <= -1 || index >=size()) {
			System.out.println("index out of bound exception");
		}
		if(count>=size()) incSize();
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		count--;
		a[count]=null;
	}
	public Object get(int index) {
		if(index <=-1|| index>=size()) {
			System.out.println("index out of bound exception");	
		}
		return a[index];
	}
	
}
public class ArrayList {
	public static void main(String[] args) {
		ArrayList22 sc=new ArrayList22();
		sc.add(03);
		sc.add(17);
		sc.add(11);
		sc.add(11);
		sc.remove(2);
		for(int i=0; i<sc.size();i++) {
			System.out.println(sc.get(i));
		}
	}

}
