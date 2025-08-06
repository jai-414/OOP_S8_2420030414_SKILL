package skill_3;
import java.util.Scanner;
public class bubble_sort {

	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter size: ");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)a[i]=s.nextInt();
	for(int i=0;i<n-1;i++){
	for(int j=0;j<n-i-1;j++){
	if(a[j]>a[j+1]){
	int t=a[j];
	a[j]=a[j+1];
	a[j+1]=t;
	}
	}
	}
	System.out.println("sorted:");
	for(int i=0;i<n;i++)System.out.print(a[i]+" ");
	}
	}


