package ComparableComparator;
import java.util.Comparator;

public class SortByName implements Comparator  {

	@Override
	public int compare(Object o1, Object o2) {
		return ((SortByComparator)o1).name.compareTo(((SortByComparator)o2).name);
	}

}
//ye Comparator ka <3> part