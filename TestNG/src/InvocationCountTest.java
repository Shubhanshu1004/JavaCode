import org.testng.annotations.Test;

public class InvocationCountTest {

	// To execute same test case multiple time we use invocationCount keyword 
	@Test(invocationCount = 10)
	public void sum() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
}
