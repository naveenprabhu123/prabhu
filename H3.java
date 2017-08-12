package guvi;
import java.util.*;
public class H3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("enter thearray elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==i)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
