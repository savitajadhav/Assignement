package com.rtassignment.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rtassignment.BasePage;

public class LoginPageTest extends BasePage{
	
	@FindBy(xpath="//div[@id='login_error']")
	WebElement errorMessage;
	   
	   BasePage basePage;
	 //  WebDriver driver;
      public LoginPageTest()
      {
  		PageFactory.initElements(driver, this);
      }
	  
	@BeforeMethod
	  public void setUp()
      {
    	  initialization();
      }
	
	  //TC1: Login with valid username and password and should be able to successfully login	
      @Test
      public void loginWithValidData()
      {
    	  login("demo", "demo");
    	  System.out.println("TC1: User logged in successfully");
      }
      
      //TC2: Login with invalid username and password and should not be able to login	
      @Test
      public void loginWithInvalidPassword()
      {
    	  login("demo", "demo1");
    	  System.out.println("TC2(1): User unable to login:" +errorMessage.getText());
    	     	 
      }
      
      @Test
      public void loginWithInvalidUsername()
      {
    	  login("demo1","demo");
    	  System.out.println("TC2(2): User unable to login:" +errorMessage.getText());

      }
      
      @Test
      public void loginWithBlankUsername()
      {
    	  login(" ","demo");
    	  System.out.println("TC2(3): User unable to login:" +errorMessage.getText());

      }
      
      @Test
      public void loginWithBlankPassword()
      {
    	  login("demo", " ");
    	  System.out.println("TC2(4): User unable to login:" +errorMessage.getText());

      }
      
      @Test
      public void loginwithBlankcredentails()
      {
    	  login(" "," ");
    	  System.out.println("TC2(5): User unable to login:" +errorMessage.getText());

      }
      
	@AfterMethod
      public void tearDown()
      {
    	  driver.quit();
    	 
      }
}
