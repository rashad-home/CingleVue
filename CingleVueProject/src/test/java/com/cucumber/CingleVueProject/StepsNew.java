package com.cucumber.CingleVueProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ElementsPack.Button;
import ElementsPack.TextField;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsNew {

	WebDriver driver;
	
@Given("^I navigate to CingleVue site$")
public void I_navigate_to_CingleVue_site() throws Throwable {
    
	System.out.println("read1");
	
	//driver = new FirefoxDriver();
	System.setProperty("WebDriver.chrome.driver", "/Users/mohamedrouzdeen/Desktop/Chrome/chromedriver");
	driver = new ChromeDriver();
	

	
	
	System.out.println("read");
	driver.navigate().to("http://cinglevue.com");
	Thread.sleep(1000);
	
}

@When("^I click on search bar$")
public void I_click_on_search_bar() throws Throwable {
 
 TextField clrtext = new TextField(driver,By.xpath("//div//div//input[@id='edit-search-block-form--2']"));
 clrtext.clearText();
 Thread.sleep(500);
	
}

@When("^I enter the text \"([^\"]*)\"$")
public void I_enter_the_text(String text) throws Throwable {
	
	TextField entertext = new TextField(driver,By.xpath("//div//div//input[@id='edit-search-block-form--2']"));
	entertext.enterText(text);
	Thread.sleep(500);
	
}

@When("^I click search button$")
public void I_click_search_button() throws Throwable {
	
	Button clickBtn = new Button(driver, By.xpath("//form//div//div//div[@id='edit-actions']"));
	clickBtn.click();
	Thread.sleep(1000);
	
    
}

@Then("^I get the results of more than ten$")
public void I_get_the_results_of_more_than_ten() throws Throwable {
	
	
	//Link page = new Link(driver, By.xpath("//section//div//div//div//div//div//ul//li//a[@href='/search/site/CingleVue?page=1’]"));
	//page.
	
	//int pages = driver.findElements(By.xpath("ELEMENT CONTAINS (WHICH I DONT KNOW)PUT THE CORRECT PATH OF TOTAL COUNT COMING")).size();
	
	
	String text = driver.findElement(By.xpath("//section//div//div//div//div//div//ul//li//a[@href='/search/site/CingleVue?page=1’]")).getText();
	
	
	
	
	int numb = 	Integer.parseInt(text);
	
	System.out.print(numb);
	
	//int page = 2;
	
	
	if (numb == 2){
		
		System.out.println("The results are more than 10");
		
		
	}else {
		
		System.out.println("The results are less than 10");
		
	}
		
		
	
	
	
	
	
	
   
}
	
	
}

