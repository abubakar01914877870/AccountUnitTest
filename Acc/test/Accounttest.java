import org.junit.Assert;
import org.junit.Test;

public class Accounttest {

	@Test
	public void test1() {
		Account account = new Account();

		Assert.assertEquals(0, account.getBalance());
	}
	
	@Test
	public void test2() {
		Account account = new Account(500);

		Assert.assertEquals(500, account.getBalance());
	}
	
	@Test
	public void test3() {
		Account account = new Account();
		account.deposit(900);
		Assert.assertEquals(900, account.getBalance());
	}
	
	@Test
	public void test4() {
		Account account = new Account();
		account.deposit(900);
		account.widrow(500);
		Assert.assertEquals(400, account.getBalance());
	}

	
	@Test
	public void test5() {
		Account account = new Account();
		account.deposit(-900);
		
		Assert.assertEquals(0, account.getBalance());
	}
	
	@Test
	public void test6() {
		Account account = new Account();
		account.widrow(500);
		Assert.assertEquals(0, account.getBalance());
	}
	
	@Test
	public void test7() {
		Account account = new Account();
		account.deposit(900);
		account.widrow(1500);
		Assert.assertEquals(900, account.getBalance());
	}
	
	@Test
	public void test8() {
		Account account = new Account();
		account.deposit(900);
		account.widrow(-500);
		int currentbalance=account.getBalance();
		System.out.println(currentbalance);
		Assert.assertEquals(900, currentbalance);
		
	}
}
