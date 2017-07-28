package guvi;
import java.util.*;
public class H11 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String str=in.nextLine();
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	}


}
