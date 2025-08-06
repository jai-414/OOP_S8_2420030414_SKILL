package skill_3;
import java.util.Scanner;
public class rev_array {
	
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter size: ");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	a[i]=s.nextInt();
	}
	System.out.println("rev:");
	for(int i=n-1;i>=0;i--){
	System.out.print(a[i]+" ");
	}
	}
	}


