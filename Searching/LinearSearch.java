package Searching;
class LinearSearch {
public static void main(String[] args) {
	int[] a= {1,5,7,3,9};
	int b=7;
	System.out.println(linearSearch(a,b));
}
public static int linearSearch(int[] a,int b) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) return i;
	}
	return -1;
}
}
