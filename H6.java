package guvi;
import java.util.*;
public class H6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size");
		int size=in.nextInt();
		int arr[]=new int[size];
		int ele=0;
		int equal=0;
		int count=0;
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j] && i!=j )
				{
					equal=arr[i];
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
		System.out.println("the repeated elements is "+equal);
	}

}
