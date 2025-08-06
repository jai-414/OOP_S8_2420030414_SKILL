package skill_2;
import java.util.Scanner;
public class operatorss {
	

	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a: ");
	int a=s.nextInt();
	System.out.print("Enter b: ");
	int b=s.nextInt();
	System.out.println("add="+(a+b));
	System.out.println("sub="+(a-b));
	System.out.println("mul="+(a*b));
	System.out.println("div="+(a/b));
	System.out.println("mod="+(a%b));
	System.out.println("eq="+(a==b));
	System.out.println("and="+((a>0)&&(b>0)));
	System.out.println("or="+((a>0)||(b>0)));
	}
	}


