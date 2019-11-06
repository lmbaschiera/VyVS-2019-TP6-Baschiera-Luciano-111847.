package tests;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest{
	private LoginPage loginPage;
	
	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void VerifyInvalidLogin() throws Exception
	{
		loginPage=new LoginPage();
		loginPage.writeUsername().Write("standard_user");
		loginPage.writePassword().Write("noexiste");
		loginPage.loginButton().Click();

		Assert.assertTrue(loginPage.getErrorLabel().Displayed());
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();
	}

}
