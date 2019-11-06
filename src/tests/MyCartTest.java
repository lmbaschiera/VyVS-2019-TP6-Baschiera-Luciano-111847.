package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.InventoryPage;
import pages.LoginPage;
import pages.ShoppingCartPage;

public class MyCartTest extends BaseTest{

	LoginPage loginPage;
	InventoryPage productPage;
	ShoppingCartPage cartPage;

	@Before
	public void setUp() throws Exception {}
	
	@Test
	public void VerifyMyCart(){
		loginPage = new LoginPage();

		loginPage.writeUsername().Write("standard_user");
		loginPage.writePassword().Write("secret_sauce");
		loginPage.loginButton().Click();

		productPage = new InventoryPage();

		productPage.getItems().get(2).Click();
		productPage.getItems().get(1).Click();
		productPage.getItems().get(4).Click();

		cartPage = new ShoppingCartPage();

		cartPage.getCartPageBtn().Click();

		Assert.assertTrue(cartPage.getFirstProduct().Displayed());
		Assert.assertTrue(cartPage.getSecondProduct().Displayed());
		Assert.assertTrue(cartPage.getThirdProduct().Displayed());
		
	}
	@After
	public void tearDown()
	{
		this.Finalize();
	}
}
