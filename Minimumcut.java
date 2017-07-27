package guvi;
import java.util.*;
public class Minimumcut {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value of M & N");
		int M=in.nextInt();
		int N=in.nextInt();
		System.out.println("the M*N value is");
		int sum=M*N;
		System.out.println("to cut the pieces propagation");
		System.out.println(sum-1);
	}

}
