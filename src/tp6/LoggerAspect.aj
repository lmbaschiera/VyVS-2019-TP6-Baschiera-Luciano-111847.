package tp6;

import tests.AutomatedPurchaseTest;
import controls.*;
import org.openqa.selenium.WebDriver;

public aspect LoggerAspect{
	before(String user, String pass):
		call(void AutomatedPurchaseTest.login(String, String)) && args(user, pass){
			System.out.println("Logging into saucedemo.com with credentials "+user+" "+pass);
	}
	before(String name):
		call(void WebDriver.get(String)) && args(name){
			System.out.println("Entering "+name);
	}
	after():
		call(void AutomatedPurchaseTest.login(String, String)){
			System.out.println("Successfully logged in!");
	}
	before(Button btn):
		execution(void Button.Click()) && this(btn){
			System.out.println("A button identified "+btn.getBy()+" has been clicked.");
	}
	before(String txt, Input inp):
		call(void Input.Write(String)) && args(txt) && target(inp){
			System.out.println("\""+txt+"\""+" has been entered in an input field identified "+inp.getBy());
	}
	after(BaseControl ctrl) returning (String txt):
		call(String BaseControl.Text()) && target(ctrl){
			System.out.println("\""+txt+"\""+" <- text extracted from a "+ctrl.getClass().getName()
					+" identified  "+ctrl.getBy());
	}
}
