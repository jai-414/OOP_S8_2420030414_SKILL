package skill_3;
import java.util.Scanner;
public class transpose_matrix {
	
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter rows and cols: ");
	int r=s.nextInt(),c=s.nextInt();
	int a[][]=new int[r][c];
	System.out.println("Enter matrix:");
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++)a[i][j]=s.nextInt();
	System.out.println("transpose:");
	for(int i=0;i<c;i++){
	for(int j=0;j<r;j++){
	System.out.print(a[j][i]+" ");
	}
	System.out.println();
	}
	}
	}


