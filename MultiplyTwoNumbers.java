import java.util.Scanner;
public class MultiplyTwoNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER VALUE FOR X");
	int x=scan.nextInt();
	System.out.println("ENTER VALUE FOR Y");
	int y=scan.nextInt();
	int MULTIPLY=x*y;
	System.out.println("***THE MULTIPLICATION OF X AND Y IS*** "+MULTIPLY);
}
}
