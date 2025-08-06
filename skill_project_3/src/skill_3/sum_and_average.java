package skill_3;
import java.util.Scanner;
public class sum_and_average {

	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter no of elemets: ");
	int n=s.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++){
	a[i]=s.nextInt();
	sum+=a[i];
	}
	double avg=(double)sum/n;
	System.out.println("sum="+sum);
	System.out.println("avg="+avg);
	}
	}


