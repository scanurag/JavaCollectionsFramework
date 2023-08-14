package ArrayList;

//import java.util.ArrayList;

public class Show {
public static void main(String[] args) {
	AList a=new AList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.addP(1,80);
    a.remove1st(1);
	for(int i=0; i<a.size();i++){
		System.out.println(a.get(i));
	}
}
}
