import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Commons {

	public static Account account;
	public static Scanner sc=new Scanner(System.in);
	
	
	@BeforeClass
	public static void BeforeClass() {
		account=new Account(500);
		System.out.println("Before Class");
	}
	
	
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
		sc.close();
	}
	
	@Before
	public void Before() {
		System.out.println("From before");
	}
	
	@After
	public void After() {
		System.out.println("After");
	}
	
	@Test()
	public void test1() {
		
		System.out.println(account.getBalance());
	}
	
	@Test
	public void test2() {
		account.widrow(100);
		System.out.println(account.getBalance());
	}

}
