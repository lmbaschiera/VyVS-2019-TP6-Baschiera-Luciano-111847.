package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Label extends BaseControl {

	public Label(By findBy) {
		super(findBy);
	}
	public void Click() {
		 this.Element().click();
	}
}
