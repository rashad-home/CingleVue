package ElementsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author mrmrashad88@gmail.com
 * 
 */

public class Element {

	/**
     * Defining driver
     */
    private WebDriver driver;
    /**
     * Defining element
     */
    private WebElement element;

    /**
     * @param driver
     * @param elementIdentifier it could be xpath, id, class etc. example : by.xpath("//input[@id='btn1']")
     */
    public Element(WebDriver driver, By elementIdentifier)
    {
        this.driver = driver;
        element = this.driver.findElement(elementIdentifier);
    }

    /**
     * click method
     */
    public void click()
    {
        element.click();
    }

    /**
     * @param attribute
     * @return
     */
    public String getElementAttribute(String attribute)
    {
        return element.getAttribute(attribute);
    }

    /**
     * @return
     */
    public WebElement getWebElement()
    {
        return this.element;
    }

    /**
     * @return
     */
    public WebDriver getDriver()
    {
        return this.driver;
    }
	
	
}
