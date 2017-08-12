package guvi;
import java.util.*;
public class H4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the arary");
		int size=in.nextInt();
		int arr[]=new int[size];
		int unique=0;
		System.out.println("enter thearray elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					unique=arr[i];
				}
			}
		}System.out.println(unique);
		
	}

}
