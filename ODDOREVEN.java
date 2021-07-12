import java.util.Scanner;
public class ODDOREVEN {
public static void main(String[] args) {
	int num;
	System.out.println("ENTER AN INTEGER NUMBER: ");
	Scanner input=new Scanner(System.in);
	num = input.nextInt();
	if( num % 2 == 0)
		System.out.println("ENTERED NUMBER IS EVEN");
	else
		System.out.println("ENTERED NUMBER IS ODD");
}
}
