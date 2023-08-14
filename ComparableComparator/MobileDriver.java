package ComparableComparator;
import java.util.Arrays;
public class MobileDriver {
public static void main(String[] args) {
	SortByComparator[] b= {new SortByComparator("vivo",8,128)
							,new SortByComparator("mi",12,264)
							,new SortByComparator("oppo",6,345)
							,new SortByComparator("Samsumg",2,122)};
	Arrays.sort(b,new SortBysRom());
	for(SortByComparator m : b) {
		System.out.println(m);
	}
	Arrays.sort(b,new SortByName());
	for(SortByComparator m2 : b) {
		System.out.println(m2);
	}
}
}
//ye Comparator ka <4 > part