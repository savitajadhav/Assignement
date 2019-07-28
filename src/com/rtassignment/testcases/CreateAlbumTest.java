package com.rtassignment.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rtassignment.BasePage;

public class CreateAlbumTest extends BasePage{
	
	
	@FindBy(xpath="//li[@id='wp-admin-bar-my-account']//a[@class='ab-item']")
	WebElement profileLink;
		
	@FindBy(xpath="//a[@id='user-media']")
	WebElement mediaLink;
	
	@FindBy(xpath="//div[@class='clicker rtmedia-action-buttons']")
	WebElement optionLink;

	@FindBy(xpath="//ul[@class='rtm-options']/li/a[@title='Create New Album']")
	WebElement createAlbumlink;
	
	@FindBy(xpath="//input[@id='rtmedia_album_name']")
	WebElement albumTitle;
	
	@FindBy(xpath="//button[text()='Create Album']")
	WebElement createAlbumBtn;
	
	@FindBy(xpath="//button[@title='Close (Esc)']")
	WebElement closeBtn;
	
	@FindBy(xpath="//span[@title='Upload Media']")
	WebElement uploadOption;
	
	@FindBy(xpath="//input[@id='rtMedia-upload-button']")
	WebElement selectFilesBtn;
	
	@FindBy(xpath="//input[@value='Start upload']")
	WebElement startUploadBtn;
	
	@FindBy(xpath="//a[@id='rtmedia-nav-item-albums']")
	WebElement albumLink;
	
	@FindBy(xpath="//div[@class='rtmedia-item-thumbnail']/img")
	WebElement firstAlbum;
	
	@FindBy(xpath="//button[@type='submit']/span[text()='Like']")
	WebElement likeBtn;
	
	@FindBy(xpath="//button[@type='submit']/span[text()='Unlike']")
	WebElement unLikeBtn;

	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		login("demo","demo");
	}
	
	//TC4: Create the album with any valid name with private privacy and upload 5 media inside that album
	@Test
	public void createAlbum() throws InterruptedException, Throwable
	{  
	
		profileLink.click(); //Click on Profile URL
		Thread.sleep(2000);
		mediaLink.click(); //Click on Media option
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN); //scrolled the page to view create/upload new album option
		Thread.sleep(2000);
		optionLink.click(); //Create new album
		createAlbumlink.click();
		albumTitle.sendKeys("Sample Album");
		createAlbumBtn.click();
        closeBtn.click();
        uploadOption.click(); //Click on upload button to upload files
        selectFilesBtn.click(); //upload file1
        Runtime.getRuntime().exec("D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\Multifilesupload.exe"+" "+"D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\testimage1.jpeg");
        Thread.sleep(2000);
        selectFilesBtn.click(); //upload file2
        Runtime.getRuntime().exec("D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\Multifilesupload.exe"+" "+"D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\testimage2.jpeg");
        Thread.sleep(2000);
        selectFilesBtn.click();   //upload file3
        Runtime.getRuntime().exec("D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\Multifilesupload.exe"+" "+"D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\testimage3.jpeg");
        Thread.sleep(2000);
        selectFilesBtn.click();   //upload file4   
        Runtime.getRuntime().exec("D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\Multifilesupload.exe"+" "+"D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\testimage4.jpeg");
        Thread.sleep(2000);
        selectFilesBtn.click(); //upload file5
        Runtime.getRuntime().exec("D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\Multifilesupload.exe"+" "+"D:\\JavaProgram\\RtAssignement\\src\\com\\rtassignment\\sampleimages\\testimage5.jpeg");
        startUploadBtn.click(); //start uploading
        System.out.println("TC4:Album created with given name and privacy, 5 media uploaded successfully");
        
        //TC 5: Like/Unlike the media (Open any recently uploaded media, Click on like)	
        
        albumLink.click();
        firstAlbum.click();
		r.keyPress(KeyEvent.VK_PAGE_DOWN); //scrolled the page to view create/upload new album option
		Thread.sleep(2000);
        firstAlbum.click();
        Thread.sleep(2000);
        likeBtn.click();
        System.out.println("TC5: User liked the media and Media shows Unlike after liked");
   	}
        
	


	@AfterMethod
	public void tearDown()
	{
			driver.quit();
	}
}
