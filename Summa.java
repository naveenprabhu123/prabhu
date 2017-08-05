package summa;
import java.util.*;
public class Summa {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("enter the size of the array :");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]>arr[i+1])
			{
			
				arr[i]=arr[i+1];
			}
			else
			{
				System.out.print(" -1");
			}System.out.print(" "+arr[i]);
		}
		System.out.print(" -1");
	}

}
