# prabhu
import java.util.Scanner; 
public class reversestring {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string : ");
		String str=in.nextLine();
		System.out.println("the reverse string is : ");
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
