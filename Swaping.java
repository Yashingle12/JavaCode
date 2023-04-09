import java.util.Scanner;
class Swaping
{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Two numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Before swapping");
	System.out.println("a=" +a+"b = "+b);

int temp = a;

a = b;


b = temp;	
System.out.println("After swapping");
System.out.println("a=" +a+"b = "+b);

}
}

// a = 5 
// b =10

//  a= 20 b = 40