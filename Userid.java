package assignment;
import java.util.*;
public class Userid {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String temp="";
		System.out.println("enter the first name");
		String first=in.nextLine();
		char find=first.charAt(0);
		int firstlength=first.length();
		int findnum=Character.getNumericValue(find);
		System.out.println("ente the last name ");
		String last=in.nextLine();
		int lastlength=last.length();
		char find1=last.charAt(0);
		int findnum1=Character.getNumericValue(find1);
		String temp1="";
		if(lastlength>firstlength)
		{
			temp1=first;
			first=temp1;
			last=temp1;
		}
		if(first.length()==(last.length()))
		{
		if(findnum1>findnum)
		{
			temp=first;
			first=last;
			last=temp;
		}}
		System.out.println("enter the pin");
		String pin=in.nextLine();
		System.out.println("ente the position ");
		int pos=in.nextInt();
		StringBuffer sb=new StringBuffer(pin);
		sb.reverse();
		String pos1=sb.toString();
		char left=pin.charAt(pos-1);
		char right=pos1.charAt(pos-1);
		int pinlength=pin.length();
		char c=first.charAt(0);
		System.out.println("the user id is : ");
		System.out.println(c+last+left+right);
		String str=c+last+left+right;
		int strlength=str.length();
		String output="";
		for(int i=0;i<strlength;i++)
		{
			if(Character.isAlphabetic(str.charAt(i))) {
			if(Character.isUpperCase(str.charAt(i)))
			{
				output+=Character.toLowerCase(str.charAt(i));
			}else
			{
				output+=Character.toUpperCase(str.charAt(i));
			}}else
			{
				output+=str.charAt(i);
			}
			
		}System.out.println("the togggle is : "+output);
	}
}
