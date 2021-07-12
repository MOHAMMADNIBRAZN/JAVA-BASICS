public class SWAPTWONUMBERS {
public static void main(String[] args) {
	float first =2.50f,second = 4.50f;
	System.out.println("--BEFORE SWAP--");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
	
	float temp= first;
	first=second;
	second=temp;
	System.out.println("--AFTER SWAP--");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
}
}
