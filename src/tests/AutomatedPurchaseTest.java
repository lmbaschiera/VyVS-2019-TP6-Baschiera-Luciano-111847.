package tests;

import junit.framework.Assert;
import pages.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;

public class AutomatedPurchaseTest extends BaseTest{
	private ArrayList<String> tabs;
	private LoginPage loginPage;
	private InventoryPage inventoryPage;
	private ShoppingCartPage shoppingCartPage;
	private FakeDataPage fakeDataPage;
	private CheckoutPageStepOne checkoutPageStepOne;
	private CheckoutPageStepTwo checkoutPageStepTwo;
	private FinishPage finishPage;
	@Before
	public void setUp() throws Exception{}
	@Test
	public void verifyProperties() throws Exception
	{
		login("standard_user", "secret_sauce");
		addNewItemToCart();
		goToCart();
		goToCheckout();
		openProfileGenerator();
		copyValues();
		clickAndContinue();
		verifyText();
		
	}
	private void verifyText() {
		Assert.assertEquals(finishPage.getThankYouLabel().Text(), "THANK YOU FOR YOUR ORDER");
		Assert.assertEquals(finishPage.getOrderDispatchedLabel().Text(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	}
	private void clickAndContinue() {
		checkoutPageStepOne.getContinueButton().Click();
		checkoutPageStepTwo =new CheckoutPageStepTwo();
		checkoutPageStepTwo.getFinishButton().Click();
		finishPage=new FinishPage();
	}
	private void copyValues() {
		fakeDataPage = new FakeDataPage();
		String firstName= fakeDataPage.getFirstName();
		String lastName= fakeDataPage.getLastName();
		String zipCode= fakeDataPage.getZipCode();
		Driver().switchTo().window(tabs.get(0));
		checkoutPageStepOne.inputFilling(firstName, lastName, zipCode);
	}
	private void openProfileGenerator() {
		((JavascriptExecutor)Driver()).executeScript("window.open()");
		tabs = new ArrayList<>(Driver().getWindowHandles());
		Driver().switchTo().window(tabs.get(1));
		Driver().get("https://www.fakepersongenerator.com/");
	}
	private void goToCheckout() {
		shoppingCartPage =new ShoppingCartPage();
		shoppingCartPage.getCheckOutButton().Click();
		checkoutPageStepOne = new CheckoutPageStepOne();
	}
	private void goToCart() {
		inventoryPage.goToCartButton().Click();
	}
	private void addNewItemToCart() {
		inventoryPage = new InventoryPage();
		inventoryPage.getRandomItemButton().Click();
	}
	private void login(String username, String password) {
		loginPage = new LoginPage();
		loginPage.writeUsername().Write(username);
		loginPage.writePassword().Write(password);
		loginPage.loginButton().Click();
	}
	@After
	public void tearDown()
	{
		this.Finalize();
	}
}
