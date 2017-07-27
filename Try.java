package assignment;
import java.util.*;
public class Try {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String str=in.nextLine();
		String [] arr=str.split(" ");
		int l=arr.length;
		//System.out.println(l);
		for(int i=l-1;i>=00;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
