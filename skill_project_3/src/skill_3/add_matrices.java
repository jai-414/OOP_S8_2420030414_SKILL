package skill_3;
import java.util.Scanner;
public class add_matrices {
	
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter rows and cols: ");
	int r=s.nextInt(),c=s.nextInt();
	int a[][]=new int[r][c];
	int b[][]=new int[r][c];
	int sum[][]=new int[r][c];
	System.out.println("Enter A:");
	for(int i=0;i<r;i++){
	for(int j=0;j<c;j++)a[i][j]=s.nextInt();
	}
	System.out.println("Enter B:");
	for(int i=0;i<r;i++){
	for(int j=0;j<c;j++)b[i][j]=s.nextInt();
	}
	for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
	sum[i][j]=a[i][j]+b[i][j];
	}
	}
	System.out.println("sum:");
	for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
	System.out.print(sum[i][j]+" ");
	}
	System.out.println();
	}
	}
	}


