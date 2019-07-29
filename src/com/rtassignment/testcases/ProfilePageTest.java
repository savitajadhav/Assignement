package com.rtassignment.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rtassignment.BasePage;

public class ProfilePageTest extends BasePage {
	
	@FindBy(xpath="//li[@id='wp-admin-bar-my-account']//a[@class='ab-item']")
	WebElement userNameLink;
	
	@FindBy(xpath="//li[@id='wp-admin-bar-my-account-xprofile']/a[@class='ab-item']/span")
	WebElement profileLink;
	
	@FindBy(xpath="//li[@id='change-cover-image-personal-li']/a[@id='change-cover-image']")
	WebElement changeCoverImage;
	
	@FindBy(xpath="//input[@id='bp-browse-button']")
	WebElement browseBtn;

	@FindBy(xpath="//p[@class='warning']")
	WebElement warningMsg;
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		login("demo","demo");
	}
	
	//TC5: Change cover image (Go to profile, Click on change cover image)	
	@Test
	public void ChangeCoverImageTest() throws InterruptedException, IOException, Throwable
	{
		userNameLink.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(profileLink);
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);		
		Thread.sleep(2000);
		changeCoverImage.click();//Click on 'Change Cover Image' option
		Thread.sleep(2000);
		browseBtn.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\CoverImage.exe");  //Select the file
		Thread.sleep(5000);
		System.out.println("TC6: Cover image changed successfully");
		
   }
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
