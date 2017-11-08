package javatest;
import java.util.Scanner;

public class test {
	public static void main(String[] args)
	{
		Scanner scanf = new Scanner(System.in);
		System.out.printf("input your name!");
		
		String name = scanf.next();
		
		System.out.printf("input your aage!");
		
		int age = scanf.nextInt();
		
		System.out.printf("이름 %s 나이는 %d", name,age);
	
	}
	
}
