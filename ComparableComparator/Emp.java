package ComparableComparator;
import java.lang.Comparable;    
public class Emp implements Comparable{
	String name;
	int sal;
	Emp(String name,int Sal){
		this.name=name;
		this.sal=sal;
	}
@Override
public String toString() {
	return "Emp [name=" + name + ", sal=" + sal + "]";
}
@Override
public int compareTo(Object o) {
	Emp e=(Emp)o;
     //return this.name.compareTo(e.name);                                          
	if((sal>e.sal)) return 1;
	else if(sal<e.sal) return -1;
	else return 0;
}

}
