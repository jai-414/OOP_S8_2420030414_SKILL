package skill_3;

import java.util.Scanner;
	public class big_and_small{
		public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size: ");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		a[i]=s.nextInt();
		}
		int max=a[0],min=a[0];
		for(int i=1;i<n;i++){
		if(a[i]>max)max=a[i];
		if(a[i]<min)min=a[i];
		}
		System.out.println("biggest value is"+max);
		System.out.println("smallest value is="+min);
		}
		}


