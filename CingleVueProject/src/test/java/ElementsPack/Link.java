package ElementsPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author mrmrashad88@gmail.com
 * 
 */

public class Link extends Element{

	  /**
     * @param driver
     * @param elementIdentifier
     */
    public Link(WebDriver driver, By elementIdentifier)
    {
        super(driver, elementIdentifier);
    }
	
}
