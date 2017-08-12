package guvi;
import java.util.*;
import java.util.Arrays;
public class H2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=in.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("order is");
		for(int sort:arr)
		{
			System.out.println(sort);
		}
		System.out.println("returns");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		
		
		
		
	}

}
