import java.util.Scanner;
public class Calculator {
 public static void addition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Result="+c);
	}
 public static void subtraction() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("Result="+c);
	}
 public static void multiplication() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("Result="+c);
	}
 public static void division() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Result="+c);
	}
		
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your choice:");
      int choice=sc.nextInt();
      switch(choice) {
      case 1:
    	  addition();
    	  break;
      case 2:
    	  subtraction();
    	  break;
      case 3:
    	  multiplication();
    	  break;
      case 4:
    	  division();
    	  break;
      default:
    	  System.out.println("Invalid");
    	  break;
      }
      
	}

}
