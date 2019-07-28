package com.rtassignment.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rtassignment.BasePage;

public class ActivityPageTest extends BasePage {
	
	@FindBy(xpath="//textarea[@name='whats-new']")
	WebElement textArea;
	
	@FindBy(xpath="//button[@title='Attach Media']")
	WebElement addMedia;
	
	@FindBy(xpath="//select[@id='rtSelectPrivacy']")
	WebElement privacyDropdown;
	
	@FindBy(xpath="//input[@value='Post Update']")
	WebElement postBtn;
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		login("demo","demo");
	}
	
	//TC3: Update the status of a post with any of the media type and privacy should be private	
    @Test
	public void addMedia() throws IOException, InterruptedException
	{
		textArea.click(); //Click on Text Area
		textArea.sendKeys("Sample Test");
		addMedia.click(); //Click on media icon to upload file
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\Fileupload.exe");
		Thread.sleep(5000);
		Select select = new Select(privacyDropdown); //Click on dropdown to select option "Private" privacy
		select.selectByVisibleText("Private");
		Thread.sleep(5000);
		postBtn.click(); 
		Thread.sleep(5000);
		System.out.println("TC3:Media uploaded successfully with private privacy");
	}
	
	@AfterMethod
	public void tearDown()
	{
 		driver.quit();
  	 
	}
	

}
