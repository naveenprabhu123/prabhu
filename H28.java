package guvi;
import java.util.*;
public class H28 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String str=in.nextLine();
		String empty="";
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(!empty.contains(arr[i]+""))
			{
				empty+=arr[i];
			
			}
		}System.out.print(empty);
	}

}
