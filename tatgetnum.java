package assignment;
import java.util.*;
public class tatgetnum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int n=in.nextInt();
		int arr[]=new int[n];
		int flag=0;
		System.out.println("enter the lements into the array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
       System.out.println("enter the target number : ");
       int target=in.nextInt();
       int num=0;
       int num1=0;
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=0;j<arr.length;j++)
    	   {
    		   if(arr[i]+arr[j]==target)
    		   {
    			   flag=1;
    			   num+=arr[i];
    			   num1=arr[j];
    		    }
    		   
    	       
    	   } 
    	   if(flag==0)
		    {
		    	flag=0;
		    	System.out.println("invalid");
		    }
    	  
       }System.out.println("the target is :"+target);
      
	}

}
