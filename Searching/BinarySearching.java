package Searching;
public class BinarySearching {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7,8,9};
	int f=8;
	System.out.println(binary(a ,f));
}
public static int binary(int[] a,int f) {
	int start=0;
	int end=a.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(a[mid]==f) {
			return mid;
		}
		else if(a[mid]>f) {
			end=mid-1;
		}
		else {
			start=mid+1;
		}
		mid=(start+end)/2;
	}
	return -1;
}
}
