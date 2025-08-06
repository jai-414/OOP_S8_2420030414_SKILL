package skill_1;
import java.util.Scanner;

public class Student_data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Roll Number : ");
        long rollNo = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter Marks : ");
        int marksScore = scanner.nextInt();
        
        System.out.print("Enter Gender like M or F: ");
        char gender = scanner.next().charAt(0);
        
        System.out.print("Pass Status (true/false): ");
        boolean pass_status = scanner.nextBoolean();
        
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marksScore);
        System.out.println("Gender: " + gender);
        System.out.println("Has Student passed:" + pass_status);
        
      
        
    }
}
