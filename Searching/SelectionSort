package Sorting;
public class SelectionSort {
public static void main(String[] args) {
	int[] a= {7,8,3,1,2};
	selectionSort(a);
	for(int n:a) {
		System.out.println(n);
	}
}
public static void selectionSort(int[] a) {
	for(int i=0;i<a.length-1;i++) {
		int index=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[index]>a[j]) index=j;
		}
		int temp=a[index];
		a[index]=a[i];
		a[i] =temp;
	}
}
}
