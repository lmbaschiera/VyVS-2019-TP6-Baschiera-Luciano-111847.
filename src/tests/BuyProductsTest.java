package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class BuyProductsTest extends BaseTest {
	private LoginPage loginPage;
	private InventoryPage productPage;

	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void VerifyBuyThreeProducts(){
		loginPage = new LoginPage();
		loginPage.writeUsername().Write("standard_user");
		loginPage.writePassword().Write("secret_sauce");
		loginPage.loginButton().Click();

		productPage = new InventoryPage();

		productPage.getItems().get(2).Click();
		productPage.getItems().get(1).Click();
		productPage.getItems().get(4).Click();

		Assert.assertEquals(productPage.howMany().Text(),"3");
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();
		
	}
}