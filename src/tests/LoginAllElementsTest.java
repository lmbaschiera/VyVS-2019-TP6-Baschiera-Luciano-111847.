package tests;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

public class LoginAllElementsTest extends BaseTest{
	private LoginPage loginPage;
	
	
	@Before
	public void setUp() throws Exception {}
	
	@Test
	public void verifyVisibilityOfAllElements() throws Exception
	{
		loginPage=new LoginPage();

		Assert.assertTrue(loginPage.getLoginLogo().Displayed());
		Assert.assertTrue(loginPage.writeUsername().Displayed());
		Assert.assertEquals(loginPage.writeUsername().getPlaceholder(),"Username");
		Assert.assertTrue(loginPage.writePassword().Displayed());
		Assert.assertEquals(loginPage.writePassword().getPlaceholder(),"Password");
		Assert.assertTrue(loginPage.loginButton().Displayed());
		
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();
	}
}
