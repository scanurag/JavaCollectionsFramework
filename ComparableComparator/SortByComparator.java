package ComparableComparator;
import java.util.Comparator;
public class SortByComparator  {
 String name;
 int rom;
 int ram;
 public SortByComparator(String name, int rom, int ram) {
	this.name = name;
	this.rom = rom;
	this.ram = ram;
}
@Override
public String toString() {
	return "SortByComparator [name=" + name + ", rom=" + rom + ", ram=" + ram + "]";
}
}
// ye Comparator ka <1> part