package ArrayList;
public class Algo {
	private Object[] a;
	private int count;
public Algo() {
	a=new Object[5];
	count=0;
}
public void add(Object data) {
	if(count>=a.length) increaseSize();
	a[count++]=data;
}
public void add(int index,Object data) {
	if(index <=-1 || index >=size()) {
		throw new IndexOutOfBoundsException();
	}
	if(count>=a.length) increaseSize();
	//System.arraycopy(a, index, a, index+1, size()-index);//{1,2,5,3,4,5}
	for(int i=size();i>index;i--) {
		a[i]=a[i-1];
	}
	a[index]=data;
	count++;
}
private void increaseSize() {
	Object[] temp=new Object[a.length+3];
	for(int i=0; i<a.length;i++) {
		temp[i]=a[i];
	}
	a=temp;
}
public int size() {
	return count;
}
public Object get(int index) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
	}
	return a[index];
}
public void remove(int index) {
	if(index<=-1||index>=size())
	{
		throw new IndexOutOfBoundsException();
	}
	for(int i=index+1;i<size();i++) {//{9,1,5,8,2}
		a[i-1]=a[i];
	}
	count--;
	a[count]=null;
}
}
