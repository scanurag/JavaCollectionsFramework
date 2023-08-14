package ArrayList;
public class AList {
private Object[] a;
private int count;
public  AList() {
	a=new Object[5];
	count=0;
}
public void add(Object Data) {
	if(count>=a.length) addSize();
	a[count]=Data;
	count++;
}
private void addSize() {
	Object[] temp=new Object[a.length+3];
	for(int i=0;i<a.length;i++) {
		temp[i]=a[i];
	}
	a=temp;
}
public int  size() {
	return count;
}
public Object get(int index) {
	if(index<=-1||index>=size()) {
		System.out.println("Index out of BoundExseption");
	}
	return a[index];
}
public void addP(int index,Object Data) {
	if(index<=-1 || index>=size())System.out.println("Index out of BoundException");
	if(count>=a.length) addSize();
	for(int i=size();i>=index;i--) {
		a[i]=a[i-1];
	}
	a[index]=Data;
	count++;
	
}
public void remove1st(int index) {
	if(index<=-1||index>=size()) System.out.println("Index out Of BoundExsepton");
	if(count>=a.length) addSize();
	for(int i=index+1;i<size();i++) { //{9,1,5,8,2}
		a[i-1]=a[i];
	}
	count--;
	a[count]=null;
}
}
