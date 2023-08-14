package ComparableComparator;

import java.util.Comparator;

public class SortBysRom implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		SortByComparator m1=(SortByComparator)o1;
		SortByComparator m2=(SortByComparator)o2;
		if(m1.rom > m2.rom) return 1;
		else if(m1.rom <m2.rom) return -1;
			return 0;
	}

}
// ye Comparator ka <2> part