package Queue;
import java.util.HashMap;
import java.util.Scanner;
public class SoupProbability {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Num");
	int n=sc.nextInt();
	int num=n;
	int fact=num*num;
	n=num;
	int i=1;
	while(n>0) {
		i*=10;
		n/=10;
	}
	if(num==fact%i) System.out.println("Enter number is spacl number"+5);
	else System.out.println("not");
}
}