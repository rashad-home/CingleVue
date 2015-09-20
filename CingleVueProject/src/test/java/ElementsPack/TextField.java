package ElementsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


/**
 * @author mrmrashad88@gmail.com
 * 
 */

public class TextField extends Element{

	
	/**
     * TextField method
     * @param driver
     * @param elementIdentifier
     */
    /**
     * @param driver
     * @param elementIdentifier
     */
    public TextField(WebDriver driver, By elementIdentifier)
    {
        super(driver, elementIdentifier);
    }

    /**
     * enterText method
     * @param text
     */
    public void enterText(String text)
    {
        getWebElement().sendKeys(text);
    }

    /**
     * clearText method
     */
    public void clearText()
    {
        getWebElement().clear();
    }

    /**
     * getText method
     * @return
     */
    public String getText()
    {
        return getElementAttribute("value");
    }

	public void enterEnter() {
		
		getWebElement().sendKeys(Keys.RETURN);
		
	}

	
}
