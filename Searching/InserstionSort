package Sorting;
public class InserstionSort {
public static void main(String[] args) {
	int[] a= {7,3,6,9,2,4};
	insersionSort(a);
	for(int n:a) {
		System.out.println(n);
	} 
}
public static void insersionSort(int[] a) {
	for(int i=1;i<a.length;i++) {
		int key=a[i];
		int j=i-1;
		while(j>=0&& a[j]>key) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
}
}
