package ComparableComparator;
import java.util.Arrays;
public class Show {
public static void main(String[] args) {
	Emp[] arr1= {new Emp("B",70),new Emp("A",60),new Emp("C",50)};
	Arrays.sort(arr1);
	for(Emp n:arr1) {
		System.out.println(n);
	}
}
}
