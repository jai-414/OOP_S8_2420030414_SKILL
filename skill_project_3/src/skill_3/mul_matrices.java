package skill_3;
import java.util.Scanner;

public class mul_matrices {
	
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter r1 c1: ");
	int r1=s.nextInt(),c1=s.nextInt();
	System.out.print("Enter r2 c2: ");
	int r2=s.nextInt(),c2=s.nextInt();
	if(c1!=r2){
	System.out.println("not possible");
	return;
	}
	int a[][]=new int[r1][c1];
	int b[][]=new int[r2][c2];
	int m[][]=new int[r1][c2];
	System.out.println("Enter A:");
	for(int i=0;i<r1;i++)
	for(int j=0;j<c1;j++)a[i][j]=s.nextInt();
	System.out.println("Enter B:");
	for(int i=0;i<r2;i++)
	for(int j=0;j<c2;j++)b[i][j]=s.nextInt();
	for(int i=0;i<r1;i++){
	for(int j=0;j<c2;j++){
	for(int k=0;k<c1;k++){
	m[i][j]+=a[i][k]*b[k][j];
	}
	}
	}
	System.out.println("product:");
	for(int i=0;i<r1;i++){
	for(int j=0;j<c2;j++){
	System.out.print(m[i][j]+" ");
	}
	System.out.println();
	}
	}
	}


