package tests;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class ValidLoginTest extends BaseTest{
	private LoginPage loginPage = new LoginPage();
	private InventoryPage inventoryPage = new InventoryPage();

	@Before
	public void setUp() throws Exception {}

	@Test
	public void verifyLogin() throws Exception
	{
		loginPage.writeUsername().Write("standard_user");
		loginPage.writePassword().Write("secret_sauce");
		loginPage.loginButton().Click();

		Assert.assertTrue(inventoryPage.getProductLabel().Displayed());
		Assert.assertEquals(inventoryPage.getProductLabel().Text(),"Products");
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();
	}

}
