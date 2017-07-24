package assignment;
import java.util.Scanner;
public class kdigitremove {
	public static void main(String[] args) {
		
	
	 int n,k,c=0,a,i,r,l=0;
     Scanner s=new Scanner(System.in);
      n=s.nextInt();
     int n1=n;
     System.out.println("Enter the k value");
     k=s.nextInt();
     while(n>0)
     {
      n=n/10;
      c++;
         }
         int c1=c-1;
         int c2=c1;
     int[] temp=new int[c];
     while(n1>0)
     {
         r=n1%10;
         temp[c1]=r;
         c1--;
         n1=n1/10;
     }
     for(i=0;i<c;i++)
     {
         for(int j=i;j<c;j++)
         {
             if(temp[i]<temp[j])
             {
                a=temp[j];
                temp[j]=temp[i];
                temp[i]=a;
             }
             
             
                 
             }
         }
  
         for(int p=0;p<c-k;p++)
         {
             l=l*10+temp[c2];
             c2--;
             
         }
          System.out.println(l);    
     
     
}

}
