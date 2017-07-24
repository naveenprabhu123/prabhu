package assignment;
import java.util.*;
public class longestpreix {
	public static void main(String args[]){
		System.out.println("Enter the number of pairs:");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int stud=2*n;
		System.out.println("The pairs of 3 days: ");
		for(int i=1;i<=(2*n-1);i++){
		for(int j=i+1;j<=stud;j++){
			System.out.println(+i+" "+j);}}

}}
